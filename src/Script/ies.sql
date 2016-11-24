-- Table: ies

-- DROP TABLE ies;

CREATE TABLE ies(
  co_ies integer NOT NULL,
  no_ies character varying,
  organizacao_academica integer,
  categoria_administrativa integer,
  CONSTRAINT ies_pkey PRIMARY KEY (co_ies),
  CONSTRAINT ies_categoria_administrativa_fkey FOREIGN KEY (categoria_administrativa)
      REFERENCES categoria_administrativa (co_categoria_administrativa) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT ies_organizacao_academica_fkey FOREIGN KEY (organizacao_academica)
      REFERENCES organizacao_academica (co_organizacao_academica) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ies
  OWNER TO postgres;
