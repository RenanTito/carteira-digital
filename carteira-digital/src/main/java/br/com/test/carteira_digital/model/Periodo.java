package br.com.test.carteira_digital.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Periodo {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double dataAtual;

    Periodo(Integer periodo){
        this.dataFim = LocalDate.now();
        this.dataInicio = dataFim.minusDays(periodo);
    }

    Periodo(Date dataFim, Date dataInicio) {
        this.dataFim = LocalDate.now();
        this.dataInicio = LocalDate.now();
    }
}
