package br.com.test.carteira_digital.controller;

import br.com.test.carteira_digital.model.enums.TipoEvento;
import br.com.test.carteira_digital.request.EventRequest;
import br.com.test.carteira_digital.response.EventResponse;
import br.com.test.carteira_digital.service.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping(value = "/operacao")
    public ResponseEntity<EventResponse> executarOperacao(@RequestBody EventRequest eventRequest) {
        TipoEvento evento = TipoEvento.fromCodigo(eventRequest.codigoAcao);
        EventResponse eventResponse = eventService.execute(evento, eventRequest);
        return new ResponseEntity<EventResponse>(eventResponse, eventResponse.status);
    }

    @DeleteMapping("/estorno/{id}")
    public ResponseEntity<String> estornarOperacao(@PathVariable int id) {
        return new ResponseEntity<>("Evento excluído com sucesso!", HttpStatus.OK);
    }


}
