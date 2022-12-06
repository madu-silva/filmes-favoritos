package com.madu.silva.filmesfavoritos.remote;

import com.madu.silva.filmesfavoritos.dto.FilmeFeignDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "filmes", url = "https://api.themoviedb.org/3/movie/")
public interface FilmeFeing {

    @GetMapping(value = "/{movieId}")
    FilmeFeignDTO pegarFilmes(@PathVariable Long movieId, @RequestParam("api_key") String apiKey, @RequestParam("language") String language);
}