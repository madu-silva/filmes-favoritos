package com.madu.silva.filmesfavoritos.services;

import com.madu.silva.filmesfavoritos.converter.FilmeConverter;
import com.madu.silva.filmesfavoritos.dto.FilmeFeignDTO;
import com.madu.silva.filmesfavoritos.models.Filmes;
import com.madu.silva.filmesfavoritos.remote.FilmeFeing;
import com.madu.silva.filmesfavoritos.repositories.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Value("${tmdb.apikey}")
    private String apiKey;

    @Value("${language}")
    private String language;

    @Autowired
    private FilmeFeing filmeFeing;

    @Autowired
    private FilmesRepository filmesRepository;

    @Autowired
    private FilmeConverter filmeConverter;

    public FilmeFeignDTO getFilmeFeing(Long id) {
        return filmeFeing.pegarFilmes(id, apiKey, language);
    }

    public Filmes salvarFilme (FilmeFeignDTO filmeFeignDTO) {
        Filmes filme = filmeConverter.converterParaFilme(filmeFeignDTO);
        return filmesRepository.save(filme);
    }
}
