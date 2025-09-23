package org.example.pedidos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.excecoes.EntregaInvalidaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void deveCriarEntregaValida() {
        Entrega entrega = new Entrega("Rua A", "Maria", 5);
        assertEquals("Maria", entrega.getDestinatario());
    }

    @Test
    void naoDevePermitirPesoZero() {
        assertThrows(EntregaInvalidaException.class,
                () -> new Entrega("Rua A", "Maria", 0));
    }
}
