package com.madu.silva.filmesfavoritos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_usuario_filme")
public class UsuariosFilmes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_usuario")
    Long idUsuario;

    @Id
    @Column(name = "id_filme")
    Integer idFilme;

    public UsuariosFilmes() {
    }

    public UsuariosFilmes(Long idUsuario, Integer idFilme) {
        this.idUsuario = idUsuario;
        this.idFilme = idFilme;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }
}

