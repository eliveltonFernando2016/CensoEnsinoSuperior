-- Table: atividade

-- DROP TABLE atividade;

CREATE TABLE atividade(
  aluno integer,
  in_ativ_pesquisa_rem integer,
  in_ativ_pesquisa_nao_rem integer,
  in_ativ_extensao_rem integer,
  in_ativ_extensao_nao_rem integer,
  in_ativ_monitoria_rem integer,
  in_ativ_monitoria_nao_rem integer,
  in_ativ_estag_n_obrig_rem integer,
  in_ativ_estag_n_obrig_nao_rem integer,
  CONSTRAINT atividade_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE atividade
  OWNER TO postgres;
