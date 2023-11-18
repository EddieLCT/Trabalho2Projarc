import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Aplicação.DTO.OrcamentoDTO;
import com.example.demo.Aplicação.Serviços.OrcamentoService;
import com.example.demo.Dominio.Entidades.Orcamento;

@Component
public class CalculaCusto {
    private OrcamentoService os;
    private CidadesAtendidasService cidadesAtendidasService; // Suponha que exista um serviço para gerenciar as cidades atendidas

    @Autowired
    public CalculaCusto(OrcamentoService os, CidadesAtendidasService cidadesAtendidasService){
        this.os = os;
        this.cidadesAtendidasService = cidadesAtendidasService;
    }

    public Orcamento calculaCusto(OrcamentoDTO oDto){
        return this.os.calculaOrcamento(oDto);
    }

    public double calculaCustoEntrega(String cidadeOrigem, String cidadeDestino, int pesoGramas){
        double custoBasico = 0.0;

        // Verifica se as cidades de origem e destino estão na lista de cidades atendidas
        if(cidadesAtendidasService.isCidadeAtendida(cidadeOrigem) && cidadesAtendidasService.isCidadeAtendida(cidadeDestino)){
            // Calcula o custo básico da entrega até São Paulo
            double custoBasicoOrigem = cidadesAtendidasService.obterCustoBasicoParaSaoPaulo(cidadeOrigem);
            double custoBasicoDestino = cidadesAtendidasService.obterCustoBasicoParaSaoPaulo(cidadeDestino);

            // Se a origem e o destino forem a mesma cidade, usa o custo da cidade para São Paulo como custo básico
            if(cidadeOrigem.equals(cidadeDestino)){
                custoBasico = custoBasicoOrigem;
            } else {
                custoBasico = custoBasicoOrigem + custoBasicoDestino;
            }

            // Calcula o custo adicional por peso
            int pesoKg = (int) Math.ceil(pesoGramas / 1000.0); // Converte para Kg arredondando para cima
            double adicionalPeso = calcularAdicionalPeso(pesoKg);

            // Adiciona o custo adicional por peso ao custo básico
            custoBasico += adicionalPeso;

            // Aplica impostos de acordo com as políticas locais (5% se não especificado)
            double imposto = cidadesAtendidasService.obterImpostoCidade(cidadeOrigem);
            double valorImposto = custoBasico * (imposto / 100);

            // Retorna o custo final da entrega
            return custoBasico + valorImposto;
        }

        return custoBasico; // Se alguma das cidades não estiver na lista de atendimento, retorna 0
    }

    private double calcularAdicionalPeso(int pesoKg){
        double adicionalPeso = 0.0;

        if(pesoKg > 5 && pesoKg <= 20){
            adicionalPeso = 10 * (pesoKg - 5);
        } else if(pesoKg > 20){
            int blocosDeCincoKg = (pesoKg - 20) / 5;
            adicionalPeso = 150 + (20 * blocosDeCincoKg);
        }

        return adicionalPeso;
    }
}
