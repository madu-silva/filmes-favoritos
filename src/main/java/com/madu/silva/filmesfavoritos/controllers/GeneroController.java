package com.madu.silva.filmesfavoritos.controllers;

import com.madu.silva.filmesfavoritos.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/generos")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

}
