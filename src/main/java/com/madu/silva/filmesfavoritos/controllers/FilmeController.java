package com.madu.silva.filmesfavoritos.controllers;

import com.madu.silva.filmesfavoritos.dto.FilmeFeignDTO;
import com.madu.silva.filmesfavoritos.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping(value = "{id}")
    public ResponseEntity<FilmeFeignDTO> getFilme(@PathVariable Long id) {
        try {
            FilmeFeignDTO filmePorId = filmeService.getFilmeFeing(id);
            filmeService.salvarFilme(filmeService.getFilmeFeing(id));

            return ResponseEntity.status(HttpStatus.OK).body(filmePorId);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
