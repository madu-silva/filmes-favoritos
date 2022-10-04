package com.madu.silva.filmesfavoritos.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "FILMES")
public class Filmes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    Integer id;
    String nome;
    String resumo;
    String capa;
    /*String genero; Criar uma tabela genero para fazer refencia com os ids?*/
    String data_lancamento;
    Integer duracao;

    @ManyToMany(mappedBy = "filmes")
    private Set<Usuario> usuarios = new HashSet<>();

    @ManyToMany(mappedBy = "filmes")
    private Set<Genero> generos = new HashSet<>();

    public Filmes() {
    }

    public Filmes(Integer id, String nome, String resumo, String capa, String data_lancamento, Integer duracao) {
        this.id = id;
        this.nome = nome;
        this.resumo = resumo;
        this.capa = capa;
        this.data_lancamento = data_lancamento;
        this.duracao = duracao;
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

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }
}
