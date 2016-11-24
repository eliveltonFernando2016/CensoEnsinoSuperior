-- Table: apoio

-- DROP TABLE apoio;

CREATE TABLE apoio(
  aluno integer,
  in_apoio_social integer,
  in_apoio_alimentacao integer,
  in_apoio_moradia integer,
  in_apoio_transporte integer,
  in_apoio_material_didatico integer,
  in_apoio_bolsa_permanencia integer,
  in_apoio_bolsa_trabalho integer,
  CONSTRAINT apoio_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE apoio
  OWNER TO postgres;
