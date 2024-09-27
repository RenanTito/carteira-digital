package br.com.test.carteira_digital.model.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipoEventoTest {

    @Test
    public void testEventoPositivo() {
        for (int idTipoEvento = 1; idTipoEvento <= 5; idTipoEvento++) {
            TipoEvento tipoEvento = TipoEvento.fromCodigo(idTipoEvento);
            Assertions.assertNotNull(tipoEvento, "TipoEvento para o código " + idTipoEvento + " não deve ser nulo.");
            Assertions.assertEquals(idTipoEvento, tipoEvento.codigo, "O código do evento retornado deve ser igual ao esperado.");
        }
    }

    @Test
    public void testEventoNegativo() {
        int codigoInvalido = 999; // Um número que não corresponde a nenhum tipo válido
        Assertions.assertThrows(IllegalArgumentException.class, () -> TipoEvento.fromCodigo(codigoInvalido)) ;
        Assertions.assertThrows(IllegalArgumentException.class, () -> TipoEvento.fromCodigo(null)) ;
    }

}
