package com.example.demo.Aplicação;

public class AplicaDesconto {

    public AplicaDesconto(){
    }

    public int calculaDesconto(int valor, int desconto){
        desconto = desconto%100;
        return valor*desconto;
    }
}
