-- Table: nacionalidade_aluno

-- DROP TABLE nacionalidade_aluno;

CREATE TABLE nacionalidade_aluno(
  co_nacionalidade_aluno integer NOT NULL,
  no_nacionalidade_aluno character varying,
  CONSTRAINT nacionalidade_aluno_pkey PRIMARY KEY (co_nacionalidade_aluno)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE nacionalidade_aluno
  OWNER TO postgres;
