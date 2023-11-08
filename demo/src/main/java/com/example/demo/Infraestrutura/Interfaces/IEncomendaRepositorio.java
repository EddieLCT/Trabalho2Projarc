package com.example.demo.Infraestrutura.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dominio.Entidades.Encomenda;

public interface IEncomendaRepositorio extends JpaRepository<Encomenda, Integer>{
    
}
