package com.example.Desafio.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name ="categoria_id")
    private Categoria categoria;


    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",
        joinColumns = @JoinColumn(name = "atividade_id"),
        inverseJoinColumns = @JoinColumn(name = " participante_id"))
    private Set<Participante> participante = new HashSet<>();

    public Atividade() {
    }

    @OneToMany(mappedBy = "atividade")
    private List<Bloco>bloco = new ArrayList<>();


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }




    public Atividade(Integer id, String nome, String descricao, Double preco,Bloco bloco,Participante participante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Bloco> getBloco() {
        return bloco;
    }


}
