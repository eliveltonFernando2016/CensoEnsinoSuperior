-- Table: necessidade_especial

-- DROP TABLE necessidade_especial;

CREATE TABLE necessidade_especial(
  aluno integer,
  in_cegueira integer,
  in_baixa_visao integer,
  in_surdez integer,
  in_def_auditiva integer,
  in_def_fisica integer,
  in_surdocegueira integer,
  in_def_multipla integer,
  in_def_mental integer,
  CONSTRAINT necessidade_especial_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE necessidade_especial
  OWNER TO postgres;
