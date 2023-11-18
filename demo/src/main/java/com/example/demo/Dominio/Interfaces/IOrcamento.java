package com.example.demo.Dominio.Interfaces;

import com.example.demo.Dominio.Entidades.Orcamento;

import java.util.List;

public interface IOrcamento {
    List<Orcamento> findAll();

    Orcamento findOrcamento(int id);

    Orcamento saveOrcamento(Orcamento o);

    List<Orcamento> findByCidadeOrigem(String cidadeOrigem);

    List<Orcamento> findByCidadeDestino(String cidadeDestino);

    List<Orcamento> findByDataSimulacao(String data);

    List<Orcamento> findByCidadeDataSimulacao(String cidade, String data);
    }
}