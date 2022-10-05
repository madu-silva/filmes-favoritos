package com.madu.silva.filmesfavoritos.services;

import com.madu.silva.filmesfavoritos.models.Genero;
import com.madu.silva.filmesfavoritos.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> encontrarTodosOsGeneros() {
        return generoRepository.findAll();
    }

    public Genero encontrarOsGenerosPorId (Long id) {
        return generoRepository.findById(id).get();
    }
}
