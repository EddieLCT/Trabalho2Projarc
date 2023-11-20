package com.example.demo.Apresentação;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Aplicação.DTO.EncomendaDTO;
import com.example.demo.Dominio.Entidades.Encomenda;
import com.example.demo.Infraestrutura.Repositorios.EncomendaRepositorio;

@RestController
@RequestMapping("/encomendas")
public class EncomendaController {

    private final EncomendaDTO encomendaService;
    private EncomendaRepositorio er;

    @Autowired
    public EncomendaController(EncomendaDTO encomendaService) {
        this.encomendaService = encomendaService;
    }

    @PostMapping
    public ResponseEntity<Encomenda> criarEncomenda(@RequestBody Encomenda encomenda) {
        Encomenda novaEncomenda = er.saveEncomenda(encomenda);
        //Encomenda novaEncomenda = encomendaService.criarEncomenda(encomenda);
        return new ResponseEntity<>(novaEncomenda, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Encomenda> buscarEncomenda(@PathVariable("id") int id) {
        Encomenda encomenda = er.findEncomenda(id);
        //Encomenda encomenda = encomendaService.buscarEncomendaPorId(id);
        return new ResponseEntity<>(encomenda, HttpStatus.OK);
    }
}
