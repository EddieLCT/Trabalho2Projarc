package com.example.demo.Infraestrutura.Interfaces;

import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Dominio.Entidades.Orcamento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrcamentoRepositorio extends JpaRepository<Orcamento, Integer> {
    List<Orcamento> findAll();
    Orcamento findById(int id);
    OrcamentoDTO save(OrcamentoDTO o);
}
