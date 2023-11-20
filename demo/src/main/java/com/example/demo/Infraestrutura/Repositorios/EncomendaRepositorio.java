package com.example.demo.Infraestrutura.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Dominio.Entidades.Encomenda;
import com.example.demo.Dominio.Interfaces.IEncomenda;
import com.example.demo.Infraestrutura.Interfaces.IEncomendaRepositorio;

public class EncomendaRepositorio implements IEncomenda {
    private IEncomendaRepositorio er;

    @Autowired
    public EncomendaRepositorio(IEncomendaRepositorio er){
        this.er = er;
    }

    @Override
    public List<Encomenda> findAll() {
        return this.er.findAll();
    }

    @Override
    public Encomenda findEncomenda(int id_encomenda) {
        return this.er.findById(id_encomenda);
    }

    @Override
    public Encomenda saveEncomenda(Encomenda e) {
        return this.er.save(e);
    }

    @Override
    public List<Encomenda> findByOrigem(String cidadeOrigem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByOrigem'");
    }

    @Override
    public List<Encomenda> findByDestino(String cidadeDestino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDestino'");
    }

    @Override
    public List<Encomenda> findByData(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByData'");
    }

    @Override
    public List<Encomenda> findByCidadeData(String cidade, String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCidadeData'");
    }
}
