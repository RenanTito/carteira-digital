package br.com.test.carteira_digital.service;

import br.com.test.carteira_digital.exception.TransacaoException;
import br.com.test.carteira_digital.model.Canal;
import br.com.test.carteira_digital.model.enums.TipoEvento;
import br.com.test.carteira_digital.response.TransacaoResponse;

import java.math.BigDecimal;

public interface Transacao {

    TransacaoResponse executar(Canal canal, TipoEvento tipo, BigDecimal valor) throws TransacaoException;

    TransacaoResponse cancelar(Canal canal, TipoEvento tipo, String motivo) throws TransacaoException;

}

