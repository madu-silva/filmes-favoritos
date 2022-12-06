package com.madu.silva.filmesfavoritos.services;

import com.madu.silva.filmesfavoritos.models.Usuario;
import com.madu.silva.filmesfavoritos.repositories.FilmesRepository;
import com.madu.silva.filmesfavoritos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosFilmesService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FilmesRepository filmesRepository;

    public Usuario encontrandoIdUsuario(Long idUsuario){
        return usuarioRepository.findById(idUsuario).get();
    }


}
