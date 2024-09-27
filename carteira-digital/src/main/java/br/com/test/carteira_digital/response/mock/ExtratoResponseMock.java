package br.com.test.carteira_digital.response.mock;

import br.com.test.carteira_digital.model.Informacao;
import br.com.test.carteira_digital.response.ExtratoResponse;

import java.util.ArrayList;
import java.util.List;

public class ExtratoResponseMock extends ExtratoResponse{

    public ExtratoResponseMock(Double saldo, List<Informacao> informacoes) {
        super(saldo, informacoes);
    }

    public static ExtratoResponseMock getResponseOk() {
        Informacao informacao = new Informacao("Informação disponível");
        List<Informacao> informacoes = new ArrayList<>();
        informacoes.add(informacao);
        return new ExtratoResponseMock(1.0, informacoes);
    }

}
