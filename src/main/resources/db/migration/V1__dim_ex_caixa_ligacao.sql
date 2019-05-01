CREATE TABLE DIM_EX_CAIXA_LIGACAO(
    CODCONTROLE BIGINT NOT NULL,
    CARCACA BIGINT,
    LINHA VARCHAR(255),
    W1 VARCHAR(255), --distância mínima entre furo e interior ou exterior do invólucro
    W2 VARCHAR(255), --idem W21 - L1 Comprimento Axial do Encaixe W22
    W3 VARCHAR(255), --idem
    LARGURAMINIMAJUNTAW1 VARCHAR(255), --Largura mínima da junta
    LARGURAMINIMAJUNTAW2 VARCHAR(255), --idem W21 - ØD1 Nominal W22
    FACETAMPAD1MINIMO VARCHAR(5), --ØD1 - W22
    FACETAMPAD1MAXIMO VARCHAR(5), --ØD1 - W22
    COMPRIMENTORADIALENCAIXE VARCHAR(5), --w1 - W22
    ENCAIXETAMPAMINIMO VARCHAR(10), --D3 - W22
    ENCAIXETAMPAMAXIMO VARCHAR(10), --D3 - W22
    PRIMARY KEY(CODCONTROLE)
);

CREATE INDEX IDX_CXL_CARCACA ON DIM_EX_CAIXA_LIGACAO (CARCACA);
CREATE INDEX IDX_CXL_LINHA ON DIM_EX_CAIXA_LIGACAO (LINHA);
CREATE INDEX IDX_CXL_CARC_LINHA ON DIM_EX_CAIXA_LIGACAO (CARCACA, LINHA);

CREATE SEQUENCE dim_ex_caixa_ligacao
MINVALUE 1
START WITH 1
INCREMENT BY 1;