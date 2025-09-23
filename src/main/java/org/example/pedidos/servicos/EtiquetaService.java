package org.example.pedidos.servicos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.CalculadoraFrete;
import org.example.pedidos.promocoes.PromocaoFrete;

public class EtiquetaService {

    private final CalculadoraFrete frete;

    public EtiquetaService(CalculadoraFrete frete) {
        this.frete = frete;
    }

    public String gerarEtiqueta(Entrega entrega) {
        double valor = calcularFreteFinal(entrega);
        return "Destinatário: " + entrega.getDestinatario() +
                "\nEndereço: " + entrega.getEndereco() +
                "\nValor do Frete: R$" + valor;
    }

    public String gerarResumoPedido(Entrega entrega) {
        double valor = calcularFreteFinal(entrega);
        return "Pedido para " + entrega.getDestinatario() +
                " com frete tipo " + frete.getNome() +
                " no valor de R$" + valor;
    }

    private double calcularFreteFinal(Entrega entrega) {
        if (PromocaoFrete.freteGratis(entrega, frete)) {
            return 0.0;
        }
        return PromocaoFrete.aplicarDescontoPorPeso(entrega, frete);
    }
}
