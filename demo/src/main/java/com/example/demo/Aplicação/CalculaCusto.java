package com.example.demo.Aplicação;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Aplicação.Serviços.OrcamentoService;
import com.example.demo.Dominio.Entidades.Orcamento;

@Component
public class CalculaCusto {
    private OrcamentoService os;

    @Autowired
    public CalculaCusto(OrcamentoService os){
        this.os = os;
    }

    public Orcamento calculaCusto(OrcamentoDTO oDto){
        return this.os.calculaOrcamento(oDto);
    }
}
