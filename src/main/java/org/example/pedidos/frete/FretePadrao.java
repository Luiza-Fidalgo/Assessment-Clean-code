package org.example.pedidos.frete;

import org.example.pedidos.dominio.Entrega;

public class FretePadrao implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.2;
    }

    @Override
    public String getNome() {
        return "PAD";
    }
}
