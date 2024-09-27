package br.com.test.carteira_digital.controller;
import br.com.test.carteira_digital.response.ExtratoResponse;
import br.com.test.carteira_digital.response.SaldoResponse;
import br.com.test.carteira_digital.response.mock.ExtratoResponseMock;
import br.com.test.carteira_digital.response.mock.SaldoResponseMock;
import br.com.test.carteira_digital.validation.PeriodoValidator;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {

    @GetMapping(value = "/saldo", produces = "application/json")
    @Description("Consulta Saldo")
    public SaldoResponse saldo() {
        return SaldoResponseMock.getResponseOk();
    }

    @GetMapping(value="/extrato", produces = "application/json")
    @Description("Consulta Extrato")
    public ExtratoResponse extrato(
            @RequestParam(required = false) Integer periodo,
            @RequestParam(required = false) String dataInicio,
            @RequestParam(required = false) String dataFim){

        PeriodoValidator.validate(periodo, dataInicio, dataFim);

        return ExtratoResponseMock.getResponseOk();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
