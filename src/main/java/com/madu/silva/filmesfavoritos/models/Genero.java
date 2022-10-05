package com.madu.silva.filmesfavoritos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Genero implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    Integer id;
    String nome;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "tb_genero_filme", joinColumns = @JoinColumn(name = "id_genero"), inverseJoinColumns = @JoinColumn(name = "id_filme"))
    private Set<Filmes> filmes = new HashSet<>();

    public Genero(){
    }

    public Genero(Integer id, String nome){
        this.id = id;
        this.nome = nome;
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
}
