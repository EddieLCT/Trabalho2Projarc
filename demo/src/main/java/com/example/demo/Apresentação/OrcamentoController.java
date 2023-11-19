package com.example.demo.Apresentação;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Aplicação.Serviços.OrcamentoService;
import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Dominio.Entidades.Orcamento;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentoController {

    private final OrcamentoService orcamentoService;

    @Autowired
    public OrcamentoController(OrcamentoService orcamentoService) {
        this.orcamentoService = orcamentoService;
    }

    @PostMapping
    public ResponseEntity<Orcamento> calcularOrcamento(@RequestBody OrcamentoDTO orcamentoDTO) {
        Orcamento orcamento = orcamentoService.calculaOrcamento(orcamentoDTO);
        return new ResponseEntity<>(orcamento, HttpStatus.OK);
    }

}
