package com.example.demo.Aplicação;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Dominio.Entidades.Orcamento;

public class ListaOrcamento {
    private List<Orcamento> orcamentos;

    public ListaOrcamento() {
        this.orcamentos = new ArrayList<>();
    }

    public void adicionarOrcamento(Orcamento orcamento) {
        this.orcamentos.add(orcamento);
    }

    public List<Orcamento> recuperarTodosOrcamentos() {
        return this.orcamentos;
    }
}
