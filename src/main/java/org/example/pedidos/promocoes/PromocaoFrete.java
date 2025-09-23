package org.example.pedidos.promocoes;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.CalculadoraFrete;
import org.example.pedidos.frete.FreteEconomico;

public class PromocaoFrete {

    // Se peso > 10, desconto de 1kg
    public static double aplicarDescontoPorPeso(Entrega entrega, CalculadoraFrete frete) {
        double pesoAjustado = entrega.getPeso() > 10 ? entrega.getPeso() - 1 : entrega.getPeso();
        return frete.calcular(new Entrega(entrega.getEndereco(), entrega.getDestinatario(), pesoAjustado));
    }

    // Frete grátis se for econômico e peso < 2
    public static boolean freteGratis(Entrega entrega, CalculadoraFrete frete) {
        return (frete instanceof FreteEconomico && entrega.getPeso() < 2);
    }
}
