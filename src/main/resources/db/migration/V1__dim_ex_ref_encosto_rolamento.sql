CREATE TABLE DIM_EX_REF_ENCOSTO_ROLAMENTO(
    CODCONTROLE BIGINT NOT NULL,
    CARCACA BIGINT,
    POLOS INTEGER,
    LINHA VARCHAR(255),
    FURACAOPE VARCHAR(3),
    REFERENCIA VARCHAR(10),
    MINIMO VARCHAR(10),
    MAXIMO VARCHAR(10),
    MINIMO2 VARCHAR(10),
    MAXIMO2 VARCHAR(10),
    REFERENCIAENT VARCHAR(10),
    MINIMOENT VARCHAR(10),
    MAXIMOENT VARCHAR(10),
    MINIMO2ENT VARCHAR(10),
    MAXIMO2ENT VARCHAR(10),
    PRIMARY KEY(CODCONTROLE)
);

CREATE INDEX IDX_RER_CARCACA ON DIM_EX_REF_ENCOSTO_ROLAMENTO (CARCACA);
CREATE INDEX IDX_RER_POLOS ON DIM_EX_REF_ENCOSTO_ROLAMENTO (POLOS);
CREATE INDEX IDX_RER_LINHA ON DIM_EX_REF_ENCOSTO_ROLAMENTO (LINHA);
CREATE INDEX IDX_RER_CARC_LINHA ON DIM_EX_REF_ENCOSTO_ROLAMENTO (CARCACA, LINHA);
CREATE INDEX IDX_RER_PL_CARC_LINHA ON DIM_EX_REF_ENCOSTO_ROLAMENTO (CARCACA, POLOS, LINHA);

CREATE SEQUENCE dim_ex_ref_encosto_rolamento
MINVALUE 1
START WITH 1
INCREMENT BY 1;