-- Table: aluno_situacao

-- DROP TABLE aluno_situacao;

CREATE TABLE aluno_situacao(
  co_aluno_situacao integer NOT NULL,
  no_aluno_situacao character varying,
  CONSTRAINT aluno_situacao_pkey PRIMARY KEY (co_aluno_situacao)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE aluno_situacao
  OWNER TO postgres;
