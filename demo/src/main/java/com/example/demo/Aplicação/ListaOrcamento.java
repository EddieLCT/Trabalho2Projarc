package com.example.demo.Aplicação;

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
