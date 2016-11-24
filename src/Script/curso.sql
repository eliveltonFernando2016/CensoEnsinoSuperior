-- Table: curso

-- DROP TABLE curso;

CREATE TABLE curso(
  co_curso integer NOT NULL,
  no_curso character varying,
  co_nivel_academico integer,
  co_modalidade_ensino integer,
  grau_academico integer,
  CONSTRAINT curso_pkey PRIMARY KEY (co_curso),
  CONSTRAINT curso_grau_academico_fkey FOREIGN KEY (grau_academico)
      REFERENCES grau_academico (co_grau_academico) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE curso
  OWNER TO postgres;
