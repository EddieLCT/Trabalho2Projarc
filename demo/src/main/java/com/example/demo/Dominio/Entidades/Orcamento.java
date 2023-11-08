package com.example.demo.Dominio.Entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orcamentos")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int custoBasico;
    int adicionalPeso;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "id_encomenda")
    Encomenda encomenda;
    int desconto;
    int imposto;
    int custoFinal;
    LocalDate dataSimulacao;


    public Orcamento(int id, int custoBasico, int adicionalPeso, Encomenda encomenda, int desconto, int imposto, int custoFinal, LocalDate dataSimulacao) {
        this.id = id;
        this.custoBasico = custoBasico;
        this.adicionalPeso = adicionalPeso;
        this.encomenda = encomenda;
        this.desconto = desconto;
        this.imposto = imposto;
        this.custoFinal = custoFinal;
        this.dataSimulacao = dataSimulacao;
    }
}