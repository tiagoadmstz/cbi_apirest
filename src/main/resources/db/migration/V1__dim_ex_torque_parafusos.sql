CREATE TABLE DIM_EX_TORQUE_PARAFUSOS(
    CODCONTROLE BIGINT NOT NULL,
    CARCACA BIGINT,
    LINHA VARCHAR(255),
    TAMPAS VARCHAR(10),
    TORQUETPMIN VARCHAR(10),
    TORQUETPMAX VARCHAR(10),
    ANEISFIX VARCHAR(10),
    TORQUEANEISMIN VARCHAR(10),
    TORQUEANEISMAX VARCHAR(10),
    BASECXLIG VARCHAR(10),
    TORQUEBASECXLIGMIN VARCHAR(10),
    TORQUEBASECXLIGMAX VARCHAR(10),
    CXLIGACAO VARCHAR(10),
    SAIDACABOS VARCHAR(10),
    TORQUECXLIGACAOMIN VARCHAR(10),
    TORQUECXLIGACAOMAX VARCHAR(10),
    PRIMARY KEY(CODCONTROLE)
);

CREATE INDEX IDX_TQP_CARCACA ON DIM_EX_TORQUE_PARAFUSOS (CARCACA);
CREATE INDEX IDX_TQP_LINHA ON DIM_EX_TORQUE_PARAFUSOS (LINHA);
CREATE INDEX IDX_TQP_CARC_LINHA ON DIM_EX_TORQUE_PARAFUSOS (CARCACA, LINHA);

CREATE SEQUENCE dim_ex_torque_parafusos
MINVALUE 1
START WITH 1
INCREMENT BY 1;