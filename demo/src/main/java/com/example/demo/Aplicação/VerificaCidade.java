package com.example.demo.Aplicação;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Aplicação.Serviços.CidadeService;

@Component
public class VerificaCidade {
    private CidadeService cs;

    @Autowired
    public VerificaCidade(CidadeService cs){
        this.cs = cs;
    }

    public boolean consultaCep(int cep){
        return this.cs.verificaCidade(cep);
    }
}
