package com.example.Desafio.entities;

import jakarta.persistence.*;

import java.time.Instant;


@Entity
@Table(name="tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    public Bloco() {
    }
    @ManyToOne
    @JoinColumn(name="atividade_id")
    private Atividade atividade;

    public Bloco(Integer id, Instant fim, Instant inicio) {
        this.id = id;
        this.fim = fim;
        this.inicio = inicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }
}
