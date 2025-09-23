package org.example.pedidos;

import org.example.pedidos.dominio.Entrega;
import org.example.pedidos.frete.FreteEconomico;
import org.example.pedidos.frete.FreteExpresso;
import org.example.pedidos.promocoes.PromocaoFrete;

public class Main {
    public static void main(String[] args) {
        Entrega entrega1 = new Entrega("Rua das Flores, 123", "Maria", 8.0);
        Entrega entrega2 = new Entrega("Av. Brasil, 456", "João", 12.0);

        // Usando frete econômico
        FreteEconomico freteEco = new FreteEconomico();
        System.out.println("Entrega 1 (Econômico): R$ " + freteEco.calcular(entrega1));
        System.out.println("Entrega 2 (Econômico): R$ " + freteEco.calcular(entrega2));

        // Usando frete expresso
        FreteExpresso freteExp = new FreteExpresso();
        System.out.println("Entrega 1 (Expresso): R$ " + freteExp.calcular(entrega1));
        System.out.println("Entrega 2 (Expresso): R$ " + freteExp.calcular(entrega2));

        // Testando promoções
        double valorComDesconto = PromocaoFrete.aplicarDescontoPorPeso(entrega2, freteEco);
        System.out.println("Entrega 2 com desconto por peso: R$ " + valorComDesconto);

        boolean freteGratis = PromocaoFrete.freteGratis(entrega1, freteExp);
        System.out.println("Entrega 1 tem frete grátis? " + freteGratis);
    }
}
