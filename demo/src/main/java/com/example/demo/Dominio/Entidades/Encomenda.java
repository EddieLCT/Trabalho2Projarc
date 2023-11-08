package com.example.demo.Dominio.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Encomendas")
public class Encomenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String enderecoOrigem;
    String enderecoDestino;
    int peso;

    public Encomenda(int id, String origem, String destino, int peso){
        this.id = id;
        this.enderecoOrigem = origem;
        this.enderecoDestino = destino;
        this.peso = peso;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnderecoOrigem() {
        return this.enderecoOrigem;
    }

    public void setEnderecoOrigem(String enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public String getEnderecoDestino() {
        return this.enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
