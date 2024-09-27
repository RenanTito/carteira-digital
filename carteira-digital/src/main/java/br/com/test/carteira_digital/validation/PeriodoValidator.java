package br.com.test.carteira_digital.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class PeriodoValidator {

    private boolean isValido;

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void validate(Integer periodo, String dataInicio, String dataFim) {

        if (periodo != null && !PeriodoValidator.isValidPeriodo(periodo)) {
            throw new IllegalArgumentException("Período inválido. Os valores permitidos são: 7, 15, 30, 60, 90.");
        }

        LocalDate startDate = Optional.ofNullable(dataInicio)
                .map(data -> LocalDate.parse(data, formatter))
                .orElse(null);

        LocalDate endDate = Optional.ofNullable(dataFim)
                .map(data -> LocalDate.parse(data, formatter))
                .orElse(null);

        if (startDate != null && endDate != null && startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("A data de início não pode ser maior que a data de fim.");
        }
    }

    public static boolean isValidPeriodo(int periodo) {
        return periodo == 7 || periodo == 15 || periodo == 30 || periodo == 60 || periodo == 90;
    }

}
