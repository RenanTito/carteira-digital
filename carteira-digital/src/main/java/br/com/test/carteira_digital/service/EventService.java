package br.com.test.carteira_digital.service;

import br.com.test.carteira_digital.model.enums.TipoEvento;
import br.com.test.carteira_digital.request.EventRequest;
import br.com.test.carteira_digital.response.EventResponse;

import java.awt.event.TextEvent;

public interface EventService {

     EventResponse execute(TipoEvento tipoEvento, EventRequest eventRequest);

}
