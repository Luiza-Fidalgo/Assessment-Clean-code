package org.example.pedidos.frete;

import org.example.pedidos.dominio.Entrega;

public interface CalculadoraFrete {
    double calcular(Entrega entrega);
    String getNome();
}
