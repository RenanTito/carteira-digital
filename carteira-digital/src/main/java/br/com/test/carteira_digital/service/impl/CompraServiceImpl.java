package br.com.test.carteira_digital.service.impl;

import br.com.test.carteira_digital.model.Informacao;
import br.com.test.carteira_digital.model.enums.TipoEvento;
import br.com.test.carteira_digital.request.EventRequest;
import br.com.test.carteira_digital.response.EventResponse;
import br.com.test.carteira_digital.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompraServiceImpl implements EventService {

    @Override
    public EventResponse execute(TipoEvento tipoEvento, EventRequest eventRequest) {
        UUID uuid = UUID.randomUUID();
        return new EventResponse(HttpStatus.OK, new Informacao(eventRequest.toString()), uuid);
    }
}
