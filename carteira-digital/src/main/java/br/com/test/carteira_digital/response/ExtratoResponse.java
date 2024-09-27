package br.com.test.carteira_digital.response;

import br.com.test.carteira_digital.model.Informacao;
import br.com.test.carteira_digital.validation.PeriodoValidator;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.List;

@Data
public class ExtratoResponse {

    private LocalDate dataExtrato;

    private Double saldoAtual;

    private List<Informacao> informacoes;

    private ValueRange período;

    public ExtratoResponse(Double saldo, List<Informacao> informacoes) {
        this.saldoAtual = saldo;
        this.dataExtrato = LocalDate.now();
        this.informacoes = informacoes;
    }

    public String getDataExtrato() {
        return dataExtrato.format(PeriodoValidator.formatter);
    }

}
