package org.example.pedidos.frete;

import org.example.pedidos.dominio.Entrega;

public class FreteExpresso implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.5 + 10;
    }

    @Override
    public String getNome() {
        return "EXP";
    }
}
