package com.madu.silva.filmesfavoritos.services;

import com.madu.silva.filmesfavoritos.models.Usuario;
import com.madu.silva.filmesfavoritos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> encontrarTodosOsUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario encontrandoUsuarioPorId(Long id) {
        Optional<Usuario> usuarioPorId = usuarioRepository.findById(id);
        return usuarioPorId.get();
    }

    public Usuario inserirUmUsuario(Usuario usuarioNovo) {
        return usuarioRepository.save(usuarioNovo);
    }

    public void deletarUmUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
