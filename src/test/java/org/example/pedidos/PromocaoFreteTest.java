package org.example.pedidos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.FreteEconomico;
import org.example.pedidos.promocoes.PromocaoFrete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromocaoFreteTest {

    @Test
    void deveAplicarFreteGratis() {
        Entrega entrega = new Entrega("Rua X", "Carlos", 1.5);
        assertTrue(PromocaoFrete.freteGratis(entrega, new FreteEconomico()));
    }

    @Test
    void deveAplicarDescontoPorPeso() {
        Entrega entrega = new Entrega("Rua Y", "Paula", 11);
        double valor = PromocaoFrete.aplicarDescontoPorPeso(entrega, new FreteEconomico());
        assertEquals(6.0, valor, 0.01);
    }
}
