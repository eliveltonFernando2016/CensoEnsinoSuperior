-- Table: categoria_administrativa

-- DROP TABLE categoria_administrativa;

CREATE TABLE categoria_administrativa(
  co_categoria_administrativa integer NOT NULL,
  ds_categoria_administrativa character varying,
  CONSTRAINT categoria_administrativa_pkey PRIMARY KEY (co_categoria_administrativa)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE categoria_administrativa
  OWNER TO postgres;
