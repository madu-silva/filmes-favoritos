package com.madu.silva.filmesfavoritos.repositories;

import com.madu.silva.filmesfavoritos.models.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritosRepository extends JpaRepository <Favoritos , Long>{
}
