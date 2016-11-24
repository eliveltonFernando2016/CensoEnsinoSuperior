-- Table: cor_raca_aluno

-- DROP TABLE cor_raca_aluno;

CREATE TABLE cor_raca_aluno(
  co_cor_raca_aluno integer NOT NULL,
  no_cor_raca_aluno character varying,
  CONSTRAINT cor_raca_aluno_pkey PRIMARY KEY (co_cor_raca_aluno)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE cor_raca_aluno
  OWNER TO postgres;
