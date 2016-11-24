-- Table: grau_academico

-- DROP TABLE grau_academico;

CREATE TABLE grau_academico(
  co_grau_academico integer NOT NULL,
  no_grau_academico character varying,
  CONSTRAINT grau_academico_pkey PRIMARY KEY (co_grau_academico)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE grau_academico
  OWNER TO postgres;
