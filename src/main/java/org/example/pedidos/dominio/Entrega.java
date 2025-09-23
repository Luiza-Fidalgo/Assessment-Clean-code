package org.example.pedidos.dominio;

import org.example.pedidos.excecoes.EntregaInvalidaException;

public final class Entrega {
    private final String endereco;
    private final String destinatario;
    private final double peso;

    public Entrega(String endereco, String destinatario, double peso) {
        if (endereco == null || endereco.isBlank()) {
            throw new EntregaInvalidaException("Endereço não pode ser vazio.");
        }
        if (destinatario == null || destinatario.isBlank()) {
            throw new EntregaInvalidaException("Destinatário não pode ser vazio.");
        }
        if (peso <= 0) {
            throw new EntregaInvalidaException("Peso deve ser maior que zero.");
        }

        this.endereco = endereco;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }
}
