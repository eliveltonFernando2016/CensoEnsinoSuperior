-- Table: reserva

-- DROP TABLE reserva;

CREATE TABLE reserva(
  aluno integer,
  in_reserva_vagas integer,
  in_reserva_ensino_publico integer,
  in_reserva_etnico integer,
  in_reserva_deficiencia integer,
  in_reserva_renda_familiar integer,
  in_reserva_outros integer,
  CONSTRAINT reserva_aluno_fkey FOREIGN KEY (aluno)
      REFERENCES aluno (co_aluno) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE reserva
  OWNER TO postgres;
