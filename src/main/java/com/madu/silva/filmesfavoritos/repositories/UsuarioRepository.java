package com.madu.silva.filmesfavoritos.repositories;

import com.madu.silva.filmesfavoritos.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
