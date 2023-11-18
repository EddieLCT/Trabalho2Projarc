package com.example.demo.Aplicação;

public class AplicaImposto {
    public double aplicarImposto(double valorOriginal, double taxaImposto) {
        double imposto = valorOriginal * (taxaImposto / 100.0);
        return valorOriginal + imposto;
    }

    public int calculaImposto(int valor, int imposto){
        imposto = imposto/100;
        return valor = valor*imposto;
    }
}
