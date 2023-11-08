package com.example.demo.Infraestrutura.Interfaces;

import com.example.demo.Dominio.Entidades.Orcamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrcamentoRepositorio extends JpaRepository<Orcamento, Integer> {
    
}
