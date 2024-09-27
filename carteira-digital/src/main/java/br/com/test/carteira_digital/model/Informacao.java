package br.com.test.carteira_digital.model;

import lombok.Data;

@Data
public class Informacao<T> {

    String mensagem;

    private Informacao(String mensagem, T objeto) {
        this.mensagem = mensagem;
    }

    public Informacao(String mensagem) {
        this.mensagem = mensagem;
    }
}
