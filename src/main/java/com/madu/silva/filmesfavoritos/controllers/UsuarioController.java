package com.madu.silva.filmesfavoritos.controllers;

import com.madu.silva.filmesfavoritos.models.Usuario;
import com.madu.silva.filmesfavoritos.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> inserindoUmUsuario(@RequestBody Usuario inserindoUsuario) {
        inserindoUsuario = usuarioService.inserirUmUsuario(inserindoUsuario);
        return ResponseEntity.ok().body(inserindoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> encontrandoTodosOsUsuarios() {
        List<Usuario> listaDeUsuarios = usuarioService.encontrarTodosOsUsuarios();
        return ResponseEntity.ok().body(listaDeUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> encontrandoUsuarioPorId(@PathVariable Long id) {
        Usuario usuarioPorId = usuarioService.encontrandoUsuarioPorId(id);
        return ResponseEntity.ok().body(usuarioPorId);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletandoUmUsuarioPorId(@PathVariable Long id) {
        usuarioService.deletarUmUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> atualizandoDadosDoUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        usuarioAtualizado = usuarioService.atualizarDados(id, usuarioAtualizado);
        return ResponseEntity.ok().body(usuarioAtualizado);
    }

}
