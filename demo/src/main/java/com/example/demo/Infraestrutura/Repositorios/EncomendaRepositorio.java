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
        return this.er.findById(id_encomenda).get();
    }

    @Override
    public Encomenda saveEncomenda(Encomenda e) {
        return this.er.save(e);
    }
}
