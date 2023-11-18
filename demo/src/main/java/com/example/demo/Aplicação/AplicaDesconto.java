package com.example.demo.Aplicação;

public class AplicaDesconto {

    public double aplicarDesconto(double valorOriginal, double descontoPercentual) {
        double desconto = valorOriginal * (descontoPercentual / 100.0);
        return valorOriginal - desconto;
    }

    public int calculaDesconto(int valor, int desconto){
        desconto = desconto%100;
        return valor*desconto;
    }
}
