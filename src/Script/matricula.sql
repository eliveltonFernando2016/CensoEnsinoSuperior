-- Table: matricula

-- DROP TABLE matricula;

CREATE TABLE matricula
(
  in_concluinte integer,
  in_ingresso integer,
  dt_ingresso_curso character varying,
  ano_ingresso integer,
  aluno bigint,
  ies integer,
  curso integer,
  aluno_situacao integer,
  in_matricula integer,
  CONSTRAINT matricula_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT matricula_aluno_situacao_fkey FOREIGN KEY (aluno_situacao)
      REFERENCES aluno_situacao (co_aluno_situacao) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT matricula_curso_fkey FOREIGN KEY (curso)
      REFERENCES curso (co_curso) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT matricula_ies_fkey FOREIGN KEY (ies)
      REFERENCES ies (co_ies) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE matricula
  OWNER TO postgres;

-- Index: alunoanoindex

-- DROP INDEX alunoanoindex;

CREATE INDEX alunoanoindex
  ON matricula
  USING btree
  (aluno, ano_ingresso);

