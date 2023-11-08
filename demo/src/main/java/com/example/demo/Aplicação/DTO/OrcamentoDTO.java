package com.example.demo.Aplicação.DTO;

import java.time.LocalDate;

import com.example.demo.Dominio.Entidades.Encomenda;

public class OrcamentoDTO {
    int id;
    int custoBasico;
    int adicionalPeso;
    Encomenda encomenda;
    int desconto;
    int imposto;
    int custoFinal;
    LocalDate dataSimulacao;

    public OrcamentoDTO(int id, int custoBasico, int adicionalPeso, Encomenda encomenda, int desconto, int imposto, int custoFinal, LocalDate dataSimulacao) {
        this.id = id;
        this.custoBasico = custoBasico;
        this.adicionalPeso = adicionalPeso;
        this.encomenda = encomenda;
        this.desconto = desconto;
        this.imposto = imposto;
        this.custoFinal = custoFinal;
        this.dataSimulacao = dataSimulacao;
    }

    public int getId(){
        return id;
    }

    public int getCustoB(){
        return custoBasico;
    }

    public int getPesoAdicional(){
        return adicionalPeso;
    }

    public Encomenda getEncomenda(){
        return encomenda;
    }

    public int getDesconto(){
        return desconto;
    }

    public int getImposto(){
        return imposto;
    }

    public int getCustoFinal(){
        return custoFinal;
    }

    public String getOrigemEncomenda(){
        return encomenda.getEnderecoOrigem();
    }

    public String getDestinoEncomenda(){
        return encomenda.getEnderecoOrigem();
    }

    public void setPesoAdicional(int peso){
        adicionalPeso = peso;
    }

    public void setCustoBasico(int custo){
        custoBasico = custo;
    }

    public void setImposto(int imposto){
        this.imposto = imposto;
    }

    public void setDesconto(int desconto){
        this.desconto = desconto;
    }

    public void setCustoFinal(int custo){
        custoFinal = custo;
    }
}
