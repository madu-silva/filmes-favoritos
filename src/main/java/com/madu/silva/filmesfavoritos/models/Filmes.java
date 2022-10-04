package com.madu.silva.filmesfavoritos.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "FILMES")
public class Filmes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    Integer id;
    String nome;
    String resumo;
    String capa;


    public Filmes() {
    }

    public Filmes(Integer id, String nome, String resumo, String capa) {
        this.id = id;
        this.nome = nome;
        this.resumo = resumo;
        this.capa = capa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
}
