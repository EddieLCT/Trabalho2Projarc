package com.example.demo.Aplicação.Serviços;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    public CidadeService(){
    }

    public boolean verificaCidade(int cep){
        List<Integer> cepList = new ArrayList<>(Arrays.asList(25000, 26000, 27000, 28000, 29000, 30000, 31000, 32000, 33000, 34000));

        return cepList.contains(cep);
    }
}
