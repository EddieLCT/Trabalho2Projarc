package com.example.demo.Aplicação;

import java.util.HashMap;
import java.util.Map;

public class ListaPromocao {
    private Map<String, String> promocoes;

    public ListaPromocao() {
        this.promocoes = new HashMap<>();
    }

    public void adicionarPromocao(String cidade, String promocao) {
        this.promocoes.put(cidade, promocao);
    }

    public String obterPromocao(String cidade) {
        return this.promocoes.get(cidade);
    }

    public void atualizarPromocao(String cidade, String novaPromocao) {
        this.promocoes.put(cidade, novaPromocao);
    }

    // Outros métodos para manipular as promoções, se necessário
}
