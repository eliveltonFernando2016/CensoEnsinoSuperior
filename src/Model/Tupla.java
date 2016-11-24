/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author elivelton
 */
public class Tupla {
    private String CO_IES;
    private String NO_IES;
    private String CO_CATEGORIA_ADMINISTRATIVA;
    private String DS_CATEGORIA_ADMINISTRATIVA;
    private String CO_ORGANIZACAO_ACADEMICA;                   //5
    private String DS_ORGANIZACAO_ACADEMICA;
    private String CO_CURSO;
    private String NO_CURSO;
    private String CO_NIVEL_ACADEMICO;
    private String CO_MODALIDADE_ENSINO;                       //10
    private String CO_GRAU_ACADEMICO;
    private String CO_ALUNO_CURSO;
    private String CO_ALUNO;
    private String CO_ALUNO_SITUACAO;
    private String ignorar1;                                   //15
    private String IN_ING_VESTIBULAR;
    private String IN_ING_ENEM;
    private String ignorar2;
    private String ignorar3;
    private String IN_ING_CONVENIO_PECG;                       //20
    private String ignorar4;
    private String IN_APOIO_SOCIAL;
    private String IN_APOIO_ALIMENTACAO;
    private String IN_APOIO_MORADIA;
    private String IN_APOIO_TRANSPORTE;                        //25
    private String IN_APOIO_MATERIAL_DIDATICO;
    private String IN_APOIO_BOLSA_PERMANENCIA;
    private String IN_APOIO_BOLSA_TRABALHO;
    private String ignorar5;
    private String IN_CEGUEIRA;                                //30
    private String IN_BAIXA_VISAO;
    private String IN_SURDEZ;
    private String IN_DEF_AUDITIVA;
    private String IN_DEF_FISICA;
    private String IN_SURDOCEGUEIRA;                           //35
    private String IN_DEF_MULTIPLA;
    private String IN_DEF_MENTAL;
    private String IN_RESERVA_VAGAS;
    private String IN_RESERVA_ENSINO_PUBLICO;
    private String IN_RESERVA_ETNICO;                          //40
    private String IN_RESERVA_DEFICIENCIA;
    private String IN_RESERVA_RENDA_FAMILIAR;
    private String IN_RESERVA_OUTROS;
    private String ignorar6;
    private String IN_ATIV_PESQUISA_REM;                       //45
    private String IN_ATIV_PESQUISA_NAO_REM;
    private String IN_ATIV_EXTENSAO_REM;
    private String IN_ATIV_EXTENSAO_NAO_REM;
    private String IN_ATIV_MONITORIA_REM;
    private String IN_ATIV_MONITORIA_NAO_REM;                  //50
    private String IN_ATIV_ESTAG_N_OBRIG_REM;
    private String IN_ATIV_ESTAG_N_OBRIG_NAO_REM;
    private String IN_FINANC_ESTUDANTIL;
    private String IN_FINANC_EXTERNAS;
    private String IN_FINANC_EXTERNAS_REEMB;                   //55
    private String IN_FINANC_IES;
    private String IN_FINANC_IES_REEMB;
    private String IN_FINANC_MUNICIPAL;
    private String IN_FINANC_MUNICIPAL_REEMB;
    private String IN_FINANC_ESTADUAL;                         //60
    private String IN_FINANC_ESTADUAL_REEMB;
    private String ignorar7;
    private String ignorar8;
    private String IN_PROUNI_INTEGRAL;
    private String IN_PROUNI_PARCIAL;                          //65
    private String IN_FIES;
    private String IN_SEXO_ALUNO;
    private String CO_COR_RACA_ALUNO;
    private String CO_NACIONALIDADE_ALUNO;
    private String CO_PAIS_ORIGEM_ALUNO;                       //70
    private String NU_ANO_ALUNO_NASC;
    private String NU_DIA_ALUNO_NASC;
    private String NU_MES_ALUNO_NASC;
    private String NU_IDADE_ALUNO;
    private String IN_MATRICULA;                               //75
    private String IN_CONCLUINTE;
    private String IN_INGRESSO;
    private String DT_INGRESSO_CURSO;
    private String ANO_INGRESSO;

    public Tupla(String CO_IES, String NO_IES, String CO_CATEGORIA_ADMINISTRATIVA, String DS_CATEGORIA_ADMINISTRATIVA, String CO_ORGANIZACAO_ACADEMICA, String DS_ORGANIZACAO_ACADEMICA, String CO_CURSO, String NO_CURSO, String CO_NIVEL_ACADEMICO, String CO_MODALIDADE_ENSINO, String CO_GRAU_ACADEMICO, String CO_ALUNO_CURSO, String CO_ALUNO, String CO_ALUNO_SITUACAO, String ignorar1, String IN_ING_VESTIBULAR, String IN_ING_ENEM, String ignorar2, String ignorar3, String IN_ING_CONVENIO_PECG, String ignorar4, String IN_APOIO_SOCIAL, String IN_APOIO_ALIMENTACAO, String IN_APOIO_MORADIA, String IN_APOIO_TRANSPORTE, String IN_APOIO_MATERIAL_DIDATICO, String IN_APOIO_BOLSA_PERMANENCIA, String IN_APOIO_BOLSA_TRABALHO, String ignorar5, String IN_CEGUEIRA, String IN_BAIXA_VISAO, String IN_SURDEZ, String IN_DEF_AUDITIVA, String IN_DEF_FISICA, String IN_SURDOCEGUEIRA, String IN_DEF_MULTIPLA, String IN_DEF_MENTAL, String IN_RESERVA_VAGAS, String IN_RESERVA_ENSINO_PUBLICO, String IN_RESERVA_ETNICO, String IN_RESERVA_DEFICIENCIA, String IN_RESERVA_RENDA_FAMILIAR, String IN_RESERVA_OUTROS, String ignorar6, String IN_ATIV_PESQUISA_REM, String IN_ATIV_PESQUISA_NAO_REM, String IN_ATIV_EXTENSAO_REM, String IN_ATIV_EXTENSAO_NAO_REM, String IN_ATIV_MONITORIA_REM, String IN_ATIV_MONITORIA_NAO_REM, String IN_ATIV_ESTAG_N_OBRIG_REM, String IN_ATIV_ESTAG_N_OBRIG_NAO_REM, String IN_FINANC_ESTUDANTIL, String IN_FINANC_EXTERNAS, String IN_FINANC_EXTERNAS_REEMB, String IN_FINANC_IES, String IN_FINANC_IES_REEMB, String IN_FINANC_MUNICIPAL, String IN_FINANC_MUNICIPAL_REEMB, String IN_FINANC_ESTADUAL, String IN_FINANC_ESTADUAL_REEMB, String ignorar7, String ignorar8, String IN_PROUNI_INTEGRAL, String IN_PROUNI_PARCIAL, String IN_FIES, String IN_SEXO_ALUNO, String CO_COR_RACA_ALUNO, String CO_NACIONALIDADE_ALUNO, String CO_PAIS_ORIGEM_ALUNO, String NU_ANO_ALUNO_NASC, String NU_DIA_ALUNO_NASC, String NU_MES_ALUNO_NASC, String NU_IDADE_ALUNO, String IN_MATRICULA, String IN_CONCLUINTE, String IN_INGRESSO, String DT_INGRESSO_CURSO, String ANO_INGRESSO) {
        this.CO_IES = CO_IES;
        this.NO_IES = NO_IES;
        this.CO_CATEGORIA_ADMINISTRATIVA = CO_CATEGORIA_ADMINISTRATIVA;
        this.DS_CATEGORIA_ADMINISTRATIVA = DS_CATEGORIA_ADMINISTRATIVA;
        this.CO_ORGANIZACAO_ACADEMICA = CO_ORGANIZACAO_ACADEMICA;
        this.DS_ORGANIZACAO_ACADEMICA = DS_ORGANIZACAO_ACADEMICA;
        this.CO_CURSO = CO_CURSO;
        this.NO_CURSO = NO_CURSO;
        this.CO_NIVEL_ACADEMICO = CO_NIVEL_ACADEMICO;
        this.CO_MODALIDADE_ENSINO = CO_MODALIDADE_ENSINO;
        this.CO_GRAU_ACADEMICO = CO_GRAU_ACADEMICO;
        this.CO_ALUNO_CURSO = CO_ALUNO_CURSO;
        this.CO_ALUNO = CO_ALUNO;
        this.CO_ALUNO_SITUACAO = CO_ALUNO_SITUACAO;
        this.ignorar1 = ignorar1;
        this.IN_ING_VESTIBULAR = IN_ING_VESTIBULAR;
        this.IN_ING_ENEM = IN_ING_ENEM;
        this.ignorar2 = ignorar2;
        this.ignorar3 = ignorar3;
        this.IN_ING_CONVENIO_PECG = IN_ING_CONVENIO_PECG;
        this.ignorar4 = ignorar4;
        this.IN_APOIO_SOCIAL = IN_APOIO_SOCIAL;
        this.IN_APOIO_ALIMENTACAO = IN_APOIO_ALIMENTACAO;
        this.IN_APOIO_MORADIA = IN_APOIO_MORADIA;
        this.IN_APOIO_TRANSPORTE = IN_APOIO_TRANSPORTE;
        this.IN_APOIO_MATERIAL_DIDATICO = IN_APOIO_MATERIAL_DIDATICO;
        this.IN_APOIO_BOLSA_PERMANENCIA = IN_APOIO_BOLSA_PERMANENCIA;
        this.IN_APOIO_BOLSA_TRABALHO = IN_APOIO_BOLSA_TRABALHO;
        this.ignorar5 = ignorar5;
        this.IN_CEGUEIRA = IN_CEGUEIRA;
        this.IN_BAIXA_VISAO = IN_BAIXA_VISAO;
        this.IN_SURDEZ = IN_SURDEZ;
        this.IN_DEF_AUDITIVA = IN_DEF_AUDITIVA;
        this.IN_DEF_FISICA = IN_DEF_FISICA;
        this.IN_SURDOCEGUEIRA = IN_SURDOCEGUEIRA;
        this.IN_DEF_MULTIPLA = IN_DEF_MULTIPLA;
        this.IN_DEF_MENTAL = IN_DEF_MENTAL;
        this.IN_RESERVA_VAGAS = IN_RESERVA_VAGAS;
        this.IN_RESERVA_ENSINO_PUBLICO = IN_RESERVA_ENSINO_PUBLICO;
        this.IN_RESERVA_ETNICO = IN_RESERVA_ETNICO;
        this.IN_RESERVA_DEFICIENCIA = IN_RESERVA_DEFICIENCIA;
        this.IN_RESERVA_RENDA_FAMILIAR = IN_RESERVA_RENDA_FAMILIAR;
        this.IN_RESERVA_OUTROS = IN_RESERVA_OUTROS;
        this.ignorar6 = ignorar6;
        this.IN_ATIV_PESQUISA_REM = IN_ATIV_PESQUISA_REM;
        this.IN_ATIV_PESQUISA_NAO_REM = IN_ATIV_PESQUISA_NAO_REM;
        this.IN_ATIV_EXTENSAO_REM = IN_ATIV_EXTENSAO_REM;
        this.IN_ATIV_EXTENSAO_NAO_REM = IN_ATIV_EXTENSAO_NAO_REM;
        this.IN_ATIV_MONITORIA_REM = IN_ATIV_MONITORIA_REM;
        this.IN_ATIV_MONITORIA_NAO_REM = IN_ATIV_MONITORIA_NAO_REM;
        this.IN_ATIV_ESTAG_N_OBRIG_REM = IN_ATIV_ESTAG_N_OBRIG_REM;
        this.IN_ATIV_ESTAG_N_OBRIG_NAO_REM = IN_ATIV_ESTAG_N_OBRIG_NAO_REM;
        this.IN_FINANC_ESTUDANTIL = IN_FINANC_ESTUDANTIL;
        this.IN_FINANC_EXTERNAS = IN_FINANC_EXTERNAS;
        this.IN_FINANC_EXTERNAS_REEMB = IN_FINANC_EXTERNAS_REEMB;
        this.IN_FINANC_IES = IN_FINANC_IES;
        this.IN_FINANC_IES_REEMB = IN_FINANC_IES_REEMB;
        this.IN_FINANC_MUNICIPAL = IN_FINANC_MUNICIPAL;
        this.IN_FINANC_MUNICIPAL_REEMB = IN_FINANC_MUNICIPAL_REEMB;
        this.IN_FINANC_ESTADUAL = IN_FINANC_ESTADUAL;
        this.IN_FINANC_ESTADUAL_REEMB = IN_FINANC_ESTADUAL_REEMB;
        this.ignorar7 = ignorar7;
        this.ignorar8 = ignorar8;
        this.IN_PROUNI_INTEGRAL = IN_PROUNI_INTEGRAL;
        this.IN_PROUNI_PARCIAL = IN_PROUNI_PARCIAL;
        this.IN_FIES = IN_FIES;
        this.IN_SEXO_ALUNO = IN_SEXO_ALUNO;
        this.CO_COR_RACA_ALUNO = CO_COR_RACA_ALUNO;
        this.CO_NACIONALIDADE_ALUNO = CO_NACIONALIDADE_ALUNO;
        this.CO_PAIS_ORIGEM_ALUNO = CO_PAIS_ORIGEM_ALUNO;
        this.NU_ANO_ALUNO_NASC = NU_ANO_ALUNO_NASC;
        this.NU_DIA_ALUNO_NASC = NU_DIA_ALUNO_NASC;
        this.NU_MES_ALUNO_NASC = NU_MES_ALUNO_NASC;
        this.NU_IDADE_ALUNO = NU_IDADE_ALUNO;
        this.IN_MATRICULA = IN_MATRICULA;
        this.IN_CONCLUINTE = IN_CONCLUINTE;
        this.IN_INGRESSO = IN_INGRESSO;
        this.DT_INGRESSO_CURSO = DT_INGRESSO_CURSO;
        this.ANO_INGRESSO = ANO_INGRESSO;
    }
    
    public String getCO_IES() {
        return CO_IES;
    }

    public void setCO_IES(String CO_IES) {
        this.CO_IES = CO_IES;
    }

    public String getNO_IES() {
        return NO_IES;
    }

    public void setNO_IES(String NO_IES) {
        this.NO_IES = NO_IES;
    }

    public String getCO_CATEGORIA_ADMINISTRATIVA() {
        return CO_CATEGORIA_ADMINISTRATIVA;
    }

    public void setCO_CATEGORIA_ADMINISTRATIVA(String CO_CATEGORIA_ADMINISTRATIVA) {
        this.CO_CATEGORIA_ADMINISTRATIVA = CO_CATEGORIA_ADMINISTRATIVA;
    }

    public String getDS_CATEGORIA_ADMINISTRATIVA() {
        return DS_CATEGORIA_ADMINISTRATIVA;
    }

    public void setDS_CATEGORIA_ADMINISTRATIVA(String DS_CATEGORIA_ADMINISTRATIVA) {
        this.DS_CATEGORIA_ADMINISTRATIVA = DS_CATEGORIA_ADMINISTRATIVA;
    }

    public String getCO_ORGANIZACAO_ACADEMICA() {
        return CO_ORGANIZACAO_ACADEMICA;
    }

    public void setCO_ORGANIZACAO_ACADEMICA(String CO_ORGANIZACAO_ACADEMICA) {
        this.CO_ORGANIZACAO_ACADEMICA = CO_ORGANIZACAO_ACADEMICA;
    }

    public String getDS_ORGANIZACAO_ACADEMICA() {
        return DS_ORGANIZACAO_ACADEMICA;
    }

    public void setDS_ORGANIZACAO_ACADEMICA(String DS_ORGANIZACAO_ACADEMICA) {
        this.DS_ORGANIZACAO_ACADEMICA = DS_ORGANIZACAO_ACADEMICA;
    }

    public String getCO_CURSO() {
        return CO_CURSO;
    }

    public void setCO_CURSO(String CO_CURSO) {
        this.CO_CURSO = CO_CURSO;
    }

    public String getNO_CURSO() {
        return NO_CURSO;
    }

    public void setNO_CURSO(String NO_CURSO) {
        this.NO_CURSO = NO_CURSO;
    }

    public String getCO_NIVEL_ACADEMICO() {
        return CO_NIVEL_ACADEMICO;
    }

    public void setCO_NIVEL_ACADEMICO(String CO_NIVEL_ACADEMICO) {
        this.CO_NIVEL_ACADEMICO = CO_NIVEL_ACADEMICO;
    }

    public String getCO_MODALIDADE_ENSINO() {
        return CO_MODALIDADE_ENSINO;
    }

    public void setCO_MODALIDADE_ENSINO(String CO_MODALIDADE_ENSINO) {
        this.CO_MODALIDADE_ENSINO = CO_MODALIDADE_ENSINO;
    }

    public String getCO_GRAU_ACADEMICO() {
        return CO_GRAU_ACADEMICO;
    }

    public void setCO_GRAU_ACADEMICO(String CO_GRAU_ACADEMICO) {
        this.CO_GRAU_ACADEMICO = CO_GRAU_ACADEMICO;
    }

    public String getCO_ALUNO_CURSO() {
        return CO_ALUNO_CURSO;
    }

    public void setCO_ALUNO_CURSO(String CO_ALUNO_CURSO) {
        this.CO_ALUNO_CURSO = CO_ALUNO_CURSO;
    }

    public String getCO_ALUNO() {
        return CO_ALUNO;
    }

    public void setCO_ALUNO(String CO_ALUNO) {
        this.CO_ALUNO = CO_ALUNO;
    }

    public String getCO_ALUNO_SITUACAO() {
        return CO_ALUNO_SITUACAO;
    }

    public void setCO_ALUNO_SITUACAO(String CO_ALUNO_SITUACAO) {
        this.CO_ALUNO_SITUACAO = CO_ALUNO_SITUACAO;
    }

    public String getIN_ING_VESTIBULAR() {
        return IN_ING_VESTIBULAR;
    }

    public void setIN_ING_VESTIBULAR(String IN_ING_VESTIBULAR) {
        this.IN_ING_VESTIBULAR = IN_ING_VESTIBULAR;
    }

    public String getIN_ING_ENEM() {
        return IN_ING_ENEM;
    }

    public void setIN_ING_ENEM(String IN_ING_ENEM) {
        this.IN_ING_ENEM = IN_ING_ENEM;
    }

    public String getIN_ING_CONVENIO_PECG() {
        return IN_ING_CONVENIO_PECG;
    }

    public void setIN_ING_CONVENIO_PECG(String IN_ING_CONVENIO_PECG) {
        this.IN_ING_CONVENIO_PECG = IN_ING_CONVENIO_PECG;
    }

    public String getIN_APOIO_SOCIAL() {
        return IN_APOIO_SOCIAL;
    }

    public void setIN_APOIO_SOCIAL(String IN_APOIO_SOCIAL) {
        this.IN_APOIO_SOCIAL = IN_APOIO_SOCIAL;
    }

    public String getIN_APOIO_ALIMENTACAO() {
        return IN_APOIO_ALIMENTACAO;
    }

    public void setIN_APOIO_ALIMENTACAO(String IN_APOIO_ALIMENTACAO) {
        this.IN_APOIO_ALIMENTACAO = IN_APOIO_ALIMENTACAO;
    }

    public String getIN_APOIO_MORADIA() {
        return IN_APOIO_MORADIA;
    }

    public void setIN_APOIO_MORADIA(String IN_APOIO_MORADIA) {
        this.IN_APOIO_MORADIA = IN_APOIO_MORADIA;
    }

    public String getIN_APOIO_TRANSPORTE() {
        return IN_APOIO_TRANSPORTE;
    }

    public void setIN_APOIO_TRANSPORTE(String IN_APOIO_TRANSPORTE) {
        this.IN_APOIO_TRANSPORTE = IN_APOIO_TRANSPORTE;
    }

    public String getIN_APOIO_MATERIAL_DIDATICO() {
        return IN_APOIO_MATERIAL_DIDATICO;
    }

    public void setIN_APOIO_MATERIAL_DIDATICO(String IN_APOIO_MATERIAL_DIDATICO) {
        this.IN_APOIO_MATERIAL_DIDATICO = IN_APOIO_MATERIAL_DIDATICO;
    }

    public String getIN_APOIO_BOLSA_PERMANENCIA() {
        return IN_APOIO_BOLSA_PERMANENCIA;
    }

    public void setIN_APOIO_BOLSA_PERMANENCIA(String IN_APOIO_BOLSA_PERMANENCIA) {
        this.IN_APOIO_BOLSA_PERMANENCIA = IN_APOIO_BOLSA_PERMANENCIA;
    }

    public String getIN_APOIO_BOLSA_TRABALHO() {
        return IN_APOIO_BOLSA_TRABALHO;
    }

    public void setIN_APOIO_BOLSA_TRABALHO(String IN_APOIO_BOLSA_TRABALHO) {
        this.IN_APOIO_BOLSA_TRABALHO = IN_APOIO_BOLSA_TRABALHO;
    }

    public String getIN_CEGUEIRA() {
        return IN_CEGUEIRA;
    }

    public void setIN_CEGUEIRA(String IN_CEGUEIRA) {
        this.IN_CEGUEIRA = IN_CEGUEIRA;
    }

    public String getIN_BAIXA_VISAO() {
        return IN_BAIXA_VISAO;
    }

    public void setIN_BAIXA_VISAO(String IN_BAIXA_VISAO) {
        this.IN_BAIXA_VISAO = IN_BAIXA_VISAO;
    }

    public String getIN_SURDEZ() {
        return IN_SURDEZ;
    }

    public void setIN_SURDEZ(String IN_SURDEZ) {
        this.IN_SURDEZ = IN_SURDEZ;
    }

    public String getIN_DEF_AUDITIVA() {
        return IN_DEF_AUDITIVA;
    }

    public void setIN_DEF_AUDITIVA(String IN_DEF_AUDITIVA) {
        this.IN_DEF_AUDITIVA = IN_DEF_AUDITIVA;
    }

    public String getIN_DEF_FISICA() {
        return IN_DEF_FISICA;
    }

    public void setIN_DEF_FISICA(String IN_DEF_FISICA) {
        this.IN_DEF_FISICA = IN_DEF_FISICA;
    }

    public String getIN_SURDOCEGUEIRA() {
        return IN_SURDOCEGUEIRA;
    }

    public void setIN_SURDOCEGUEIRA(String IN_SURDOCEGUEIRA) {
        this.IN_SURDOCEGUEIRA = IN_SURDOCEGUEIRA;
    }

    public String getIN_DEF_MULTIPLA() {
        return IN_DEF_MULTIPLA;
    }

    public void setIN_DEF_MULTIPLA(String IN_DEF_MULTIPLA) {
        this.IN_DEF_MULTIPLA = IN_DEF_MULTIPLA;
    }

    public String getIN_DEF_MENTAL() {
        return IN_DEF_MENTAL;
    }

    public void setIN_DEF_MENTAL(String IN_DEF_MENTAL) {
        this.IN_DEF_MENTAL = IN_DEF_MENTAL;
    }

    public String getIN_RESERVA_VAGAS() {
        return IN_RESERVA_VAGAS;
    }

    public void setIN_RESERVA_VAGAS(String IN_RESERVA_VAGAS) {
        this.IN_RESERVA_VAGAS = IN_RESERVA_VAGAS;
    }

    public String getIN_RESERVA_ENSINO_PUBLICO() {
        return IN_RESERVA_ENSINO_PUBLICO;
    }

    public void setIN_RESERVA_ENSINO_PUBLICO(String IN_RESERVA_ENSINO_PUBLICO) {
        this.IN_RESERVA_ENSINO_PUBLICO = IN_RESERVA_ENSINO_PUBLICO;
    }

    public String getIN_RESERVA_ETNICO() {
        return IN_RESERVA_ETNICO;
    }

    public void setIN_RESERVA_ETNICO(String IN_RESERVA_ETNICO) {
        this.IN_RESERVA_ETNICO = IN_RESERVA_ETNICO;
    }

    public String getIN_RESERVA_DEFICIENCIA() {
        return IN_RESERVA_DEFICIENCIA;
    }

    public void setIN_RESERVA_DEFICIENCIA(String IN_RESERVA_DEFICIENCIA) {
        this.IN_RESERVA_DEFICIENCIA = IN_RESERVA_DEFICIENCIA;
    }

    public String getIN_RESERVA_RENDA_FAMILIAR() {
        return IN_RESERVA_RENDA_FAMILIAR;
    }

    public void setIN_RESERVA_RENDA_FAMILIAR(String IN_RESERVA_RENDA_FAMILIAR) {
        this.IN_RESERVA_RENDA_FAMILIAR = IN_RESERVA_RENDA_FAMILIAR;
    }

    public String getIN_RESERVA_OUTROS() {
        return IN_RESERVA_OUTROS;
    }

    public void setIN_RESERVA_OUTROS(String IN_RESERVA_OUTROS) {
        this.IN_RESERVA_OUTROS = IN_RESERVA_OUTROS;
    }

    public String getIN_ATIV_PESQUISA_REM() {
        return IN_ATIV_PESQUISA_REM;
    }

    public void setIN_ATIV_PESQUISA_REM(String IN_ATIV_PESQUISA_REM) {
        this.IN_ATIV_PESQUISA_REM = IN_ATIV_PESQUISA_REM;
    }

    public String getIN_ATIV_PESQUISA_NAO_REM() {
        return IN_ATIV_PESQUISA_NAO_REM;
    }

    public void setIN_ATIV_PESQUISA_NAO_REM(String IN_ATIV_PESQUISA_NAO_REM) {
        this.IN_ATIV_PESQUISA_NAO_REM = IN_ATIV_PESQUISA_NAO_REM;
    }

    public String getIN_ATIV_EXTENSAO_REM() {
        return IN_ATIV_EXTENSAO_REM;
    }

    public void setIN_ATIV_EXTENSAO_REM(String IN_ATIV_EXTENSAO_REM) {
        this.IN_ATIV_EXTENSAO_REM = IN_ATIV_EXTENSAO_REM;
    }

    public String getIN_ATIV_EXTENSAO_NAO_REM() {
        return IN_ATIV_EXTENSAO_NAO_REM;
    }

    public void setIN_ATIV_EXTENSAO_NAO_REM(String IN_ATIV_EXTENSAO_NAO_REM) {
        this.IN_ATIV_EXTENSAO_NAO_REM = IN_ATIV_EXTENSAO_NAO_REM;
    }

    public String getIN_ATIV_MONITORIA_REM() {
        return IN_ATIV_MONITORIA_REM;
    }

    public void setIN_ATIV_MONITORIA_REM(String IN_ATIV_MONITORIA_REM) {
        this.IN_ATIV_MONITORIA_REM = IN_ATIV_MONITORIA_REM;
    }

    public String getIN_ATIV_MONITORIA_NAO_REM() {
        return IN_ATIV_MONITORIA_NAO_REM;
    }

    public void setIN_ATIV_MONITORIA_NAO_REM(String IN_ATIV_MONITORIA_NAO_REM) {
        this.IN_ATIV_MONITORIA_NAO_REM = IN_ATIV_MONITORIA_NAO_REM;
    }

    public String getIN_ATIV_ESTAG_N_OBRIG_REM() {
        return IN_ATIV_ESTAG_N_OBRIG_REM;
    }

    public void setIN_ATIV_ESTAG_N_OBRIG_REM(String IN_ATIV_ESTAG_N_OBRIG_REM) {
        this.IN_ATIV_ESTAG_N_OBRIG_REM = IN_ATIV_ESTAG_N_OBRIG_REM;
    }

    public String getIN_ATIV_ESTAG_N_OBRIG_NAO_REM() {
        return IN_ATIV_ESTAG_N_OBRIG_NAO_REM;
    }

    public void setIN_ATIV_ESTAG_N_OBRIG_NAO_REM(String IN_ATIV_ESTAG_N_OBRIG_NAO_REM) {
        this.IN_ATIV_ESTAG_N_OBRIG_NAO_REM = IN_ATIV_ESTAG_N_OBRIG_NAO_REM;
    }

    public String getIN_FINANC_ESTUDANTIL() {
        return IN_FINANC_ESTUDANTIL;
    }

    public void setIN_FINANC_ESTUDANTIL(String IN_FINANC_ESTUDANTIL) {
        this.IN_FINANC_ESTUDANTIL = IN_FINANC_ESTUDANTIL;
    }

    public String getIN_FINANC_EXTERNAS() {
        return IN_FINANC_EXTERNAS;
    }

    public void setIN_FINANC_EXTERNAS(String IN_FINANC_EXTERNAS) {
        this.IN_FINANC_EXTERNAS = IN_FINANC_EXTERNAS;
    }

    public String getIN_FINANC_EXTERNAS_REEMB() {
        return IN_FINANC_EXTERNAS_REEMB;
    }

    public void setIN_FINANC_EXTERNAS_REEMB(String IN_FINANC_EXTERNAS_REEMB) {
        this.IN_FINANC_EXTERNAS_REEMB = IN_FINANC_EXTERNAS_REEMB;
    }

    public String getIN_FINANC_IES() {
        return IN_FINANC_IES;
    }

    public void setIN_FINANC_IES(String IN_FINANC_IES) {
        this.IN_FINANC_IES = IN_FINANC_IES;
    }

    public String getIN_FINANC_IES_REEMB() {
        return IN_FINANC_IES_REEMB;
    }

    public void setIN_FINANC_IES_REEMB(String IN_FINANC_IES_REEMB) {
        this.IN_FINANC_IES_REEMB = IN_FINANC_IES_REEMB;
    }

    public String getIN_FINANC_MUNICIPAL() {
        return IN_FINANC_MUNICIPAL;
    }

    public void setIN_FINANC_MUNICIPAL(String IN_FINANC_MUNICIPAL) {
        this.IN_FINANC_MUNICIPAL = IN_FINANC_MUNICIPAL;
    }

    public String getIN_FINANC_MUNICIPAL_REEMB() {
        return IN_FINANC_MUNICIPAL_REEMB;
    }

    public void setIN_FINANC_MUNICIPAL_REEMB(String IN_FINANC_MUNICIPAL_REEMB) {
        this.IN_FINANC_MUNICIPAL_REEMB = IN_FINANC_MUNICIPAL_REEMB;
    }

    public String getIN_FINANC_ESTADUAL() {
        return IN_FINANC_ESTADUAL;
    }

    public void setIN_FINANC_ESTADUAL(String IN_FINANC_ESTADUAL) {
        this.IN_FINANC_ESTADUAL = IN_FINANC_ESTADUAL;
    }

    public String getIN_FINANC_ESTADUAL_REEMB() {
        return IN_FINANC_ESTADUAL_REEMB;
    }

    public void setIN_FINANC_ESTADUAL_REEMB(String IN_FINANC_ESTADUAL_REEMB) {
        this.IN_FINANC_ESTADUAL_REEMB = IN_FINANC_ESTADUAL_REEMB;
    }

    public String getIN_PROUNI_INTEGRAL() {
        return IN_PROUNI_INTEGRAL;
    }

    public void setIN_PROUNI_INTEGRAL(String IN_PROUNI_INTEGRAL) {
        this.IN_PROUNI_INTEGRAL = IN_PROUNI_INTEGRAL;
    }

    public String getIN_PROUNI_PARCIAL() {
        return IN_PROUNI_PARCIAL;
    }

    public void setIN_PROUNI_PARCIAL(String IN_PROUNI_PARCIAL) {
        this.IN_PROUNI_PARCIAL = IN_PROUNI_PARCIAL;
    }

    public String getIN_FIES() {
        return IN_FIES;
    }

    public void setIN_FIES(String IN_FIES) {
        this.IN_FIES = IN_FIES;
    }

    public String getIN_SEXO_ALUNO() {
        return IN_SEXO_ALUNO;
    }

    public void setIN_SEXO_ALUNO(String IN_SEXO_ALUNO) {
        this.IN_SEXO_ALUNO = IN_SEXO_ALUNO;
    }

    public String getCO_COR_RACA_ALUNO() {
        return CO_COR_RACA_ALUNO;
    }

    public void setCO_COR_RACA_ALUNO(String CO_COR_RACA_ALUNO) {
        this.CO_COR_RACA_ALUNO = CO_COR_RACA_ALUNO;
    }

    public String getCO_NACIONALIDADE_ALUNO() {
        return CO_NACIONALIDADE_ALUNO;
    }

    public void setCO_NACIONALIDADE_ALUNO(String CO_NACIONALIDADE_ALUNO) {
        this.CO_NACIONALIDADE_ALUNO = CO_NACIONALIDADE_ALUNO;
    }

    public String getCO_PAIS_ORIGEM_ALUNO() {
        return CO_PAIS_ORIGEM_ALUNO;
    }

    public void setCO_PAIS_ORIGEM_ALUNO(String CO_PAIS_ORIGEM_ALUNO) {
        this.CO_PAIS_ORIGEM_ALUNO = CO_PAIS_ORIGEM_ALUNO;
    }

    public String getNU_ANO_ALUNO_NASC() {
        return NU_ANO_ALUNO_NASC;
    }

    public void setNU_ANO_ALUNO_NASC(String NU_ANO_ALUNO_NASC) {
        this.NU_ANO_ALUNO_NASC = NU_ANO_ALUNO_NASC;
    }

    public String getNU_DIA_ALUNO_NASC() {
        return NU_DIA_ALUNO_NASC;
    }

    public void setNU_DIA_ALUNO_NASC(String NU_DIA_ALUNO_NASC) {
        this.NU_DIA_ALUNO_NASC = NU_DIA_ALUNO_NASC;
    }

    public String getNU_MES_ALUNO_NASC() {
        return NU_MES_ALUNO_NASC;
    }

    public void setNU_MES_ALUNO_NASC(String NU_MES_ALUNO_NASC) {
        this.NU_MES_ALUNO_NASC = NU_MES_ALUNO_NASC;
    }

    public String getNU_IDADE_ALUNO() {
        return NU_IDADE_ALUNO;
    }

    public void setNU_IDADE_ALUNO(String NU_IDADE_ALUNO) {
        this.NU_IDADE_ALUNO = NU_IDADE_ALUNO;
    }

    public String getIN_MATRICULA() {
        return IN_MATRICULA;
    }

    public void setIN_MATRICULA(String IN_MATRICULA) {
        this.IN_MATRICULA = IN_MATRICULA;
    }

    public String getIN_CONCLUINTE() {
        return IN_CONCLUINTE;
    }

    public void setIN_CONCLUINTE(String IN_CONCLUINTE) {
        this.IN_CONCLUINTE = IN_CONCLUINTE;
    }

    public String getIN_INGRESSO() {
        return IN_INGRESSO;
    }

    public void setIN_INGRESSO(String IN_INGRESSO) {
        this.IN_INGRESSO = IN_INGRESSO;
    }

    public String getDT_INGRESSO_CURSO() {
        return DT_INGRESSO_CURSO;
    }

    public void setDT_INGRESSO_CURSO(String DT_INGRESSO_CURSO) {
        this.DT_INGRESSO_CURSO = DT_INGRESSO_CURSO;
    }

    public String getANO_INGRESSO() {
        return ANO_INGRESSO;
    }

    public void setANO_INGRESSO(String ANO_INGRESSO) {
        this.ANO_INGRESSO = ANO_INGRESSO;
    }
    
    
}
