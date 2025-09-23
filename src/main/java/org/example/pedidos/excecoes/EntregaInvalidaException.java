package org.example.pedidos.excecoes;

public class EntregaInvalidaException extends RuntimeException {
    public EntregaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
