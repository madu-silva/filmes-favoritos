package com.madu.silva.filmesfavoritos.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "FAVORITOS")
public class Favoritos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    Long id;
    Long id_usuario;
    Long id_filme;

    public Favoritos() {
    }

    public Favoritos(Long id, Long id_usuario, Long id_filme) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_filme = id_filme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_filme() {
        return id_filme;
    }

    public void setId_filme(Long id_filme) {
        this.id_filme = id_filme;
    }
}
