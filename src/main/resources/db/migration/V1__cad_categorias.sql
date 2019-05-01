CREATE TABLE CAD_CATEGORIAS (
    CODIGO BIGINT NOT NULL,
    DESCRICAO VARCHAR(100) NOT NULL,
    PRIMARY KEY(CODIGO)
);

CREATE INDEX IDX_DESCRICAO ON CAD_CATEGORIAS(DESCRICAO);

CREATE SEQUENCE seq_cad_categorias 
MINVALUE 1 
START WITH 1
INCREMENT BY 1;