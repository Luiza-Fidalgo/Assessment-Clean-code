package org.example.pedidos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveCalcularFreteExpresso() {
        Entrega entrega = new Entrega("Rua A", "Maria", 10);
        CalculadoraFrete frete = new FreteExpresso();
        assertEquals(25.0, frete.calcular(entrega));
    }

    @Test
    void deveCalcularFretePadrao() {
        Entrega entrega = new Entrega("Rua B", "João", 10);
        CalculadoraFrete frete = new FretePadrao();
        assertEquals(12.0, frete.calcular(entrega));
    }

    @Test
    void deveCalcularFreteEconomico() {
        Entrega entrega = new Entrega("Rua C", "Ana", 10);
        CalculadoraFrete frete = new FreteEconomico();
        assertEquals(6.0, frete.calcular(entrega));
    }
}
