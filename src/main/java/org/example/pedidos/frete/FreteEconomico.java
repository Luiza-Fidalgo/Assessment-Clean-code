package org.example.pedidos.frete;

import org.example.pedidos.dominio.Entrega;

public class FreteEconomico implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.1 - 5;
    }

    @Override
    public String getNome() {
        return "ECO";
    }
}
