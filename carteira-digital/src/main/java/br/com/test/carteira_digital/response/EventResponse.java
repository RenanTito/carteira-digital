package br.com.test.carteira_digital.response;

import br.com.test.carteira_digital.model.Informacao;
import org.springframework.http.HttpStatus;
import java.util.UUID;

public class EventResponse {

    public HttpStatus status;

    private Informacao informacao;

    private UUID identificadorEvento = null;

    public EventResponse(HttpStatus status, Informacao informacao, UUID identificadorEvento) {}
}
