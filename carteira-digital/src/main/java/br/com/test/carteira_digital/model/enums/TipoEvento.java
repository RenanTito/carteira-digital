package br.com.test.carteira_digital.model.enums;

public enum TipoEvento {
    ADICAO_VALOR(1,"Adicao de valores"),
    RETIRADA_VALOR(2,"Retirada de valores") ,
    COMPRA(3,"Compra"),
    CANCELAMENTO(4,"Cancelamento"),
    ESTORNO(5,"Estorno");

    final Integer codigo;
    private final String descricao;

    TipoEvento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoEvento fromCodigo(Integer codigo) {
        for (TipoEvento evento : TipoEvento.values()) {
            if (evento.codigo.equals(codigo)) {
                return evento;
            }
        }
        throw new IllegalArgumentException("Código não encontrado: " + codigo);
    }

}

