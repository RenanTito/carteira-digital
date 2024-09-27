CREATE TABLE transacoes (
                            uuidTransacao UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                            idWallet BIGINT NOT NULL,
                            canal VARCHAR(50) NOT NULL,
                            idDestino BIGINT,
                            valor DECIMAL(10, 2) NOT NULL,
                            dataInclusao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            dataModificacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            uuidRelacional UUID
);