package com.madu.silva.filmesfavoritos.repositories;

import com.madu.silva.filmesfavoritos.models.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
