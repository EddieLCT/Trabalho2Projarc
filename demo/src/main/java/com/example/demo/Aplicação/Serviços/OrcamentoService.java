package com.example.demo.Aplicação.Serviços;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Aplicação.DTO.EncomendaDTO;
import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Dominio.Entidades.*;
import com.example.demo.Infraestrutura.Interfaces.IEncomendaRepositorio;
import com.example.demo.Infraestrutura.Interfaces.IOrcamentoRepositorio;

@Service
public class OrcamentoService {
    private IEncomendaRepositorio ie;
    private IOrcamentoRepositorio io;
    
    public OrcamentoService(IEncomendaRepositorio ie, IOrcamentoRepositorio io){
        this.ie = ie;
        this.io = io;
    }

    public Orcamento calculaOrcamento(OrcamentoDTO oDto){
        int custoB = calculaCustoB(oDto.getOrigemEncomenda(), oDto.getDestinoEncomenda());
        int pesoAd = calculaPeso(oDto.getPesoAdicional());

        int custoB_Peso = custoB + pesoAd;
        int desconto = 0;
        int imposto;

        if(oDto.getImposto()==-1){
            imposto = 5;
        }
        else{
            imposto = oDto.getImposto();
        }

        imposto = calculaImposto(imposto, custoB_Peso);

        if(custoB_Peso>=100){
            desconto = 10;
        }

        desconto = calculaDesconto(desconto, custoB_Peso);

        int custoFinal = custoB_Peso + imposto - desconto;

        Orcamento o = new Orcamento(custoB, pesoAd, oDto.getEncomenda(), desconto, imposto, custoFinal, LocalDate.now());

        return o;
    }

    public int calculaCustoB(String origem, String destino){
        if(origem.equals(destino)){
            if(origem.equals("SAO")){
                return 10;
            }
            else if(origem.equals("POA")){
                return 25 + 25;
            }
            else if(origem.equals("CUR")){
                return 15 + 15;
            }
            else
                return 20 + 20;
        }
        else if(origem.equals("SAO")){
            if(destino.equals("POA")){
                return 25;
            }
            else if(destino.equals("CUR")){
                return 15;
            }
            else
                return 20;
        }
        else if(origem.equals("POA")){
            if(destino.equals("CUR")){
                return 25 + 15;
            }
            else
                return 25 + 20;
        }
        else if(origem.equals("CUR")){
            if(destino.equals("POA")){
                return 15 + 25;
            }
            else
                return 15 + 20;
        }
        else{
            if(destino.equals("POA")){
                return 20 + 25;
            }
            else
                return 20 + 15;
        }
    }

    public int calculaImposto(int percentual, int valor){
        percentual = percentual/100;
        int aux = valor*percentual;
        valor = valor + aux;

        return valor;
    }

    public int calculaDesconto(int percentual, int valor){
        percentual = percentual/100;
        int aux = valor*percentual;
        valor = valor + aux;

        return valor;
    }

    public int calculaPeso(int peso){
        if(peso%1000!=0){
            peso = peso/1000;
            peso = peso+1;
        }
        else
            peso = peso/1000;

        if(peso>12){
            peso = peso-12;
            int soma = (peso*15) + 100;
            return soma;
        }
        else if(peso>2 && peso<=11){
            return (peso-2)*10;
        }
        return 0;
    }

    
}
