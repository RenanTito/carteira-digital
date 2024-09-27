package br.com.test.carteira_digital.response;

import br.com.test.carteira_digital.validation.PeriodoValidator;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
public class SaldoResponse {

    private String saldo;

    private String dataSaldo;

    public SaldoResponse(Double saldo) {
        this.saldo = String.valueOf(saldo);
        this.dataSaldo = String.valueOf(LocalDate.now().format(PeriodoValidator.formatter));
    }

}
