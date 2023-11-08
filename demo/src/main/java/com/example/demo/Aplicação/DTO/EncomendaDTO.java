package com.example.demo.Aplicação.DTO;

public class EncomendaDTO {
    int id;

    String enderecoOrigem;

    String enderecoDestino;

    int peso;

    public EncomendaDTO(int id, String enderecoOrigem, String enderecoDestino, int peso){
        this.id = id;
        this.enderecoOrigem = enderecoOrigem;
        this.enderecoDestino = enderecoDestino;
        this.peso = peso;
    }
}
