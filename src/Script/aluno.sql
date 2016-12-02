-- Table: aluno

-- DROP TABLE aluno;

CREATE TABLE aluno
(
  co_aluno bigint NOT NULL,
  in_sexo_aluno integer,
  cor_raca_aluno integer,
  nacionalidade_aluno integer,
  co_pais_origem_aluno integer,
  nu_ano_aluno_nasc integer,
  nu_dia_aluno_nasc integer,
  nu_mes_aluno_nasc integer,
  nu_idade_aluno integer,
  CONSTRAINT aluno_pkey PRIMARY KEY (co_aluno),
  CONSTRAINT aluno_cor_raca_aluno_fkey FOREIGN KEY (cor_raca_aluno)
      REFERENCES cor_raca_aluno (co_cor_raca_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT aluno_nacionalidade_aluno_fkey FOREIGN KEY (nacionalidade_aluno)
      REFERENCES nacionalidade_aluno (co_nacionalidade_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE aluno
  OWNER TO postgres;

-- Index: idx_aluno

-- DROP INDEX idx_aluno;

CREATE INDEX idx_aluno
  ON aluno
  USING hash
  (co_aluno);

