package org.example.pedidos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.FreteExpresso;
import org.example.pedidos.servicos.EtiquetaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtiquetaServiceTest {

    @Test
    void deveGerarEtiquetaCorreta() {
        Entrega entrega = new Entrega("Rua A", "Maria", 10);
        EtiquetaService service = new EtiquetaService(new FreteExpresso());

        String etiqueta = service.gerarEtiqueta(entrega);
        assertTrue(etiqueta.contains("Maria"));
        assertTrue(etiqueta.contains("Rua A"));
    }
}
