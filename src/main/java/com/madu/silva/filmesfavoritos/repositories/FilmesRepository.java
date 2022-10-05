package com.madu.silva.filmesfavoritos.repositories;

import com.madu.silva.filmesfavoritos.models.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository <Filmes, Long> {
}
