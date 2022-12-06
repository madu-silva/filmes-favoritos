package com.madu.silva.filmesfavoritos.converter;

import com.madu.silva.filmesfavoritos.dto.FilmeFeignDTO;
import com.madu.silva.filmesfavoritos.models.Filmes;
import org.springframework.stereotype.Component;

@Component
public class FilmeConverter {

    public Filmes converterParaFilme(FilmeFeignDTO filmeFeignDTODTO) {
        Filmes filme = new Filmes();
        filme.setId(filmeFeignDTODTO.getId());
        filme.setNome(filmeFeignDTODTO.getOriginalTitle());
        filme.setResumo(filmeFeignDTODTO.getOverview());
        filme.setCapa(filmeFeignDTODTO.getPosterPath());
        filme.setDataLancamento(filmeFeignDTODTO.getReleaseDate());
        filme.setDuracao(filmeFeignDTODTO.getRuntime());
        return filme;
    }
}
