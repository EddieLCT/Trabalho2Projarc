package com.example.demo.Infraestrutura.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Aplicação.DTO.EncomendaDTO;
import com.example.demo.Dominio.Entidades.Encomenda;

public interface IEncomendaRepositorio extends JpaRepository<Encomenda, Integer>{
    List<Encomenda> findAll();
    Encomenda findById(int id);
    EncomendaDTO save(EncomendaDTO e);
}
