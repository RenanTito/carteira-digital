package br.com.test.carteira_digital.response;

import br.com.test.carteira_digital.validation.PeriodoValidator;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
public class SaldoResponse {

    private Double saldo;
    private LocalDate dataSaldo;

    public SaldoResponse(Double saldo) {
        this.saldo = saldo;
        this.dataSaldo = LocalDate.now();
    }

    public String getDataSaldo() {
        return dataSaldo.format(PeriodoValidator.formatter);
    }

}
