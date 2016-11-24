-- Table: ingresso

-- DROP TABLE ingresso;

CREATE TABLE ingresso(
  aluno integer,
  in_ing_vestibular integer,
  in_ing_enem integer,
  in_ing_convenio_pecg integer,
  CONSTRAINT ingresso_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ingresso
  OWNER TO postgres;
