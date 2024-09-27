package br.com.test.carteira_digital.response.mock;

import br.com.test.carteira_digital.response.SaldoResponse;

public class SaldoResponseMock extends SaldoResponse {

    public SaldoResponseMock(Double saldo) {
        super(saldo);
    }

    public static SaldoResponseMock getResponseOk(){
        return new SaldoResponseMock(1.0);
    };

}
