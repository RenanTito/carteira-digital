package br.com.test.carteira_digital.request;

import br.com.test.carteira_digital.model.enums.TipoEvento;
import io.swagger.v3.core.util.Json;
import jakarta.validation.constraints.NotNull;

public class EventRequest {

    @NotNull(message = "O tipo de evento a ser executado é obrigatório.")
    public int codigoAcao;

    private Json conteudo;

}
