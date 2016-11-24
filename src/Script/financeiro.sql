-- Table: financeiro

-- DROP TABLE financeiro;

CREATE TABLE financeiro(
  aluno integer,
  in_financ_estudantil integer,
  in_financ_externas integer,
  in_financ_externas_reemb integer,
  in_financ_ies integer,
  in_financ_ies_reemb integer,
  in_financ_municipal integer,
  in_financ_municipal_reemb integer,
  in_financ_estadual integer,
  in_financ_estadual_reemb integer,
  in_prouni_integral integer,
  in_prouni_parcial integer,
  in_fies integer,
  CONSTRAINT financeiro_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE financeiro
  OWNER TO postgres;
