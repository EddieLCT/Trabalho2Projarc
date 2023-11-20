package com.example.demo.Infraestrutura.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Dominio.Entidades.Orcamento;
import com.example.demo.Dominio.Interfaces.IOrcamento;
import com.example.demo.Infraestrutura.Interfaces.IOrcamentoRepositorio;

public class OrcamentoRepositorio implements IOrcamento{
    private IOrcamentoRepositorio io;

    @Autowired
    public OrcamentoRepositorio(IOrcamentoRepositorio io){
        this.io = io;
    }

    @Override
    public List<Orcamento> findAll() {
        return this.io.findAll();
    }

    @Override
    public Orcamento findOrcamento(int id) {
        return this.io.findById(id).get();
    }

    @Override
    public Orcamento saveOrcamento(Orcamento o) {
        return this.io.save(o);
    }

    @Override
    public List<Orcamento> findByCidadeOrigem(String cidadeOrigem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCidadeOrigem'");
    }

    @Override
    public List<Orcamento> findByCidadeDestino(String cidadeDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCidadeDestino'");
    }

    @Override
    public List<Orcamento> findByDataSimulacao(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDataSimulacao'");
    }

    @Override
    public List<Orcamento> findByCidadeDataSimulacao(String cidade, String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCidadeDataSimulacao'");
    }   
}
