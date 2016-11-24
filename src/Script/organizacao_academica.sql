-- Table: organizacao_academica

-- DROP TABLE organizacao_academica;

CREATE TABLE organizacao_academica(
  co_organizacao_academica integer NOT NULL,
  no_organizacao_academica character varying,
  CONSTRAINT organizacao_academica_pkey PRIMARY KEY (co_organizacao_academica)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE organizacao_academica
  OWNER TO postgres;
