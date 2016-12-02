/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CensoEnsinoSuperior;

import Model.Aluno;
import Model.AlunoSituacao;
import Model.Apoio;
import Model.Atividade;
import Model.CategoriaAdministrativa;
import Model.CorRacaAluno;
import Model.Curso;
import Model.Financeiro;
import Model.GrauAcademico;
import Model.Ingresso;
import Model.InstitutoEnsinoSuperior;
import Model.Matricula;
import Model.NacionalidadeAluno;
import Model.NecessidadeEspecial;
import Model.OrganizacaoAcademica;
import Model.Reserva;

/**
 *
 * @author elivelton
 */
public class SeparaClasse{
    private Aluno aluno = null;
    private AlunoSituacao alunoSituacao = null;
    private Apoio apoio = null;
    private Atividade atividade = null;
    private CategoriaAdministrativa catAdm = null;
    private CorRacaAluno corRaca = null;
    private Curso curso = null;
    private Financeiro financeiro = null;
    private GrauAcademico grauAcademico = null;
    private Ingresso ingresso = null;
    private InstitutoEnsinoSuperior ies = null;
    private Matricula matricula = null;
    private NacionalidadeAluno nacionalidade = null;
    private NecessidadeEspecial necessidade = null;
    private OrganizacaoAcademica orgAcademica = null;
    private Reserva reserva = null;

    public void run() {
        if("".equals(Manipular10.tupla.getCO_IES()))                        Manipular10.tupla.setCO_IES("-1");
        if("".equals(Manipular10.tupla.getCO_CATEGORIA_ADMINISTRATIVA()))   Manipular10.tupla.setCO_CATEGORIA_ADMINISTRATIVA("-1");
        if("".equals(Manipular10.tupla.getCO_ORGANIZACAO_ACADEMICA()))      Manipular10.tupla.setCO_ORGANIZACAO_ACADEMICA("-1");
        if("".equals(Manipular10.tupla.getCO_CURSO()))                      Manipular10.tupla.setCO_CURSO("-1");
        if("".equals(Manipular10.tupla.getCO_NIVEL_ACADEMICO()))            Manipular10.tupla.setCO_NIVEL_ACADEMICO("-1");
        if("".equals(Manipular10.tupla.getCO_MODALIDADE_ENSINO()))          Manipular10.tupla.setCO_MODALIDADE_ENSINO("-1");
        if("".equals(Manipular10.tupla.getCO_GRAU_ACADEMICO()))             Manipular10.tupla.setCO_GRAU_ACADEMICO("-1");
        if("".equals(Manipular10.tupla.getCO_ALUNO_CURSO()))                Manipular10.tupla.setCO_ALUNO_CURSO("-1");
        if("".equals(Manipular10.tupla.getCO_ALUNO()))                      Manipular10.tupla.setCO_ALUNO("-1");
        if("".equals(Manipular10.tupla.getCO_ALUNO_SITUACAO()))             Manipular10.tupla.setCO_ALUNO_SITUACAO("-1");
        if("".equals(Manipular10.tupla.getIN_ING_VESTIBULAR()))             Manipular10.tupla.setIN_ING_VESTIBULAR("-1");
        if("".equals(Manipular10.tupla.getIN_ING_ENEM()))                   Manipular10.tupla.setIN_ING_ENEM("-1");
        if("".equals(Manipular10.tupla.getIN_ING_CONVENIO_PECG()))          Manipular10.tupla.setIN_ING_CONVENIO_PECG("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_SOCIAL()))               Manipular10.tupla.setIN_APOIO_SOCIAL("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_ALIMENTACAO()))          Manipular10.tupla.setIN_APOIO_ALIMENTACAO("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_MORADIA()))              Manipular10.tupla.setIN_APOIO_MORADIA("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_TRANSPORTE()))           Manipular10.tupla.setIN_APOIO_TRANSPORTE("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_MATERIAL_DIDATICO()))    Manipular10.tupla.setIN_APOIO_MATERIAL_DIDATICO("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_BOLSA_PERMANENCIA()))    Manipular10.tupla.setIN_APOIO_BOLSA_PERMANENCIA("-1");
        if("".equals(Manipular10.tupla.getIN_APOIO_BOLSA_TRABALHO()))       Manipular10.tupla.setIN_APOIO_BOLSA_TRABALHO("-1");
        if("".equals(Manipular10.tupla.getIN_CEGUEIRA()))                   Manipular10.tupla.setIN_CEGUEIRA("-1");
        if("".equals(Manipular10.tupla.getIN_BAIXA_VISAO()))                Manipular10.tupla.setIN_BAIXA_VISAO("-1");
        if("".equals(Manipular10.tupla.getIN_SURDEZ()))                     Manipular10.tupla.setIN_SURDEZ("-1");
        if("".equals(Manipular10.tupla.getIN_DEF_AUDITIVA()))               Manipular10.tupla.setIN_DEF_AUDITIVA("-1");
        if("".equals(Manipular10.tupla.getIN_DEF_FISICA()))                 Manipular10.tupla.setIN_DEF_FISICA("-1");
        if("".equals(Manipular10.tupla.getIN_SURDOCEGUEIRA()))              Manipular10.tupla.setIN_SURDOCEGUEIRA("-1");
        if("".equals(Manipular10.tupla.getIN_DEF_MULTIPLA()))               Manipular10.tupla.setIN_DEF_MULTIPLA("-1");
        if("".equals(Manipular10.tupla.getIN_DEF_MENTAL()))                 Manipular10.tupla.setIN_DEF_MENTAL("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_VAGAS()))              Manipular10.tupla.setIN_RESERVA_VAGAS("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_ENSINO_PUBLICO()))     Manipular10.tupla.setIN_RESERVA_ENSINO_PUBLICO("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_ETNICO()))             Manipular10.tupla.setIN_RESERVA_ETNICO("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_DEFICIENCIA()))        Manipular10.tupla.setIN_RESERVA_DEFICIENCIA("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_RENDA_FAMILIAR()))     Manipular10.tupla.setIN_RESERVA_RENDA_FAMILIAR("-1");
        if("".equals(Manipular10.tupla.getIN_RESERVA_OUTROS()))             Manipular10.tupla.setIN_RESERVA_OUTROS("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_PESQUISA_REM()))          Manipular10.tupla.setIN_ATIV_PESQUISA_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_PESQUISA_NAO_REM()))      Manipular10.tupla.setIN_ATIV_PESQUISA_NAO_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_EXTENSAO_REM()))          Manipular10.tupla.setIN_ATIV_EXTENSAO_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_EXTENSAO_NAO_REM()))      Manipular10.tupla.setIN_ATIV_EXTENSAO_NAO_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_MONITORIA_REM()))         Manipular10.tupla.setIN_ATIV_MONITORIA_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_MONITORIA_NAO_REM()))     Manipular10.tupla.setIN_ATIV_MONITORIA_NAO_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_ESTAG_N_OBRIG_REM()))     Manipular10.tupla.setIN_ATIV_ESTAG_N_OBRIG_REM("-1");
        if("".equals(Manipular10.tupla.getIN_ATIV_ESTAG_N_OBRIG_NAO_REM())) Manipular10.tupla.setIN_ATIV_ESTAG_N_OBRIG_NAO_REM("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_ESTUDANTIL()))          Manipular10.tupla.setIN_FINANC_ESTUDANTIL("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_EXTERNAS()))            Manipular10.tupla.setIN_FINANC_EXTERNAS("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_EXTERNAS_REEMB()))      Manipular10.tupla.setIN_FINANC_EXTERNAS_REEMB("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_IES()))                 Manipular10.tupla.setIN_FINANC_IES("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_IES_REEMB()))           Manipular10.tupla.setIN_FINANC_IES_REEMB("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_MUNICIPAL()))           Manipular10.tupla.setIN_FINANC_MUNICIPAL("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_MUNICIPAL_REEMB()))     Manipular10.tupla.setIN_FINANC_MUNICIPAL_REEMB("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_ESTADUAL()))            Manipular10.tupla.setIN_FINANC_ESTADUAL("-1");
        if("".equals(Manipular10.tupla.getIN_FINANC_ESTADUAL_REEMB()))      Manipular10.tupla.setIN_FINANC_ESTADUAL_REEMB("-1");
        if("".equals(Manipular10.tupla.getIN_PROUNI_INTEGRAL()))            Manipular10.tupla.setIN_PROUNI_INTEGRAL("-1");
        if("".equals(Manipular10.tupla.getIN_PROUNI_PARCIAL()))             Manipular10.tupla.setIN_PROUNI_PARCIAL("-1");
        if("".equals(Manipular10.tupla.getIN_FIES()))                       Manipular10.tupla.setIN_FIES("-1");
        if("".equals(Manipular10.tupla.getIN_SEXO_ALUNO()))                 Manipular10.tupla.setIN_SEXO_ALUNO("-1");
        if("".equals(Manipular10.tupla.getCO_COR_RACA_ALUNO()))             Manipular10.tupla.setCO_COR_RACA_ALUNO("-1");
        if("".equals(Manipular10.tupla.getCO_NACIONALIDADE_ALUNO()))        Manipular10.tupla.setCO_NACIONALIDADE_ALUNO("-1");
        if("".equals(Manipular10.tupla.getCO_PAIS_ORIGEM_ALUNO()))          Manipular10.tupla.setCO_PAIS_ORIGEM_ALUNO("-1");
        if("".equals(Manipular10.tupla.getNU_ANO_ALUNO_NASC()))             Manipular10.tupla.setNU_ANO_ALUNO_NASC("-1");
        if("".equals(Manipular10.tupla.getNU_DIA_ALUNO_NASC()))             Manipular10.tupla.setNU_DIA_ALUNO_NASC("-1");
        if("".equals(Manipular10.tupla.getNU_MES_ALUNO_NASC()))             Manipular10.tupla.setNU_MES_ALUNO_NASC("-1");
        if("".equals(Manipular10.tupla.getNU_IDADE_ALUNO()))                Manipular10.tupla.setNU_IDADE_ALUNO("-1");
        if("".equals(Manipular10.tupla.getIN_MATRICULA()))                  Manipular10.tupla.setIN_MATRICULA("-1");
        if("".equals(Manipular10.tupla.getIN_CONCLUINTE()))                 Manipular10.tupla.setIN_CONCLUINTE("-1");
        if("".equals(Manipular10.tupla.getIN_INGRESSO()))                   Manipular10.tupla.setIN_INGRESSO("-1");
        if("".equals(Manipular10.tupla.getDT_INGRESSO_CURSO()))             Manipular10.tupla.setDT_INGRESSO_CURSO("-1");
        if("".equals(Manipular10.tupla.getANO_INGRESSO()))                  Manipular10.tupla.setANO_INGRESSO("-1");

        aluno         = new Aluno(Long.parseLong(Manipular10.tupla.getCO_ALUNO()), Integer.parseInt(Manipular10.tupla.getIN_SEXO_ALUNO()), Integer.parseInt(Manipular10.tupla.getCO_PAIS_ORIGEM_ALUNO()), Integer.parseInt(Manipular10.tupla.getNU_ANO_ALUNO_NASC()), Integer.parseInt(Manipular10.tupla.getNU_DIA_ALUNO_NASC()), Integer.parseInt(Manipular10.tupla.getNU_MES_ALUNO_NASC()), Integer.parseInt(Manipular10.tupla.getNU_IDADE_ALUNO()));
        alunoSituacao = new AlunoSituacao(Integer.parseInt(Manipular10.tupla.getCO_ALUNO_SITUACAO()));
        apoio         = new Apoio(Integer.parseInt(Manipular10.tupla.getIN_APOIO_SOCIAL()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_ALIMENTACAO()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_MORADIA()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_TRANSPORTE()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_MATERIAL_DIDATICO()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_BOLSA_PERMANENCIA()), Integer.parseInt(Manipular10.tupla.getIN_APOIO_BOLSA_TRABALHO()));
        atividade     = new Atividade(Integer.parseInt(Manipular10.tupla.getIN_ATIV_PESQUISA_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_PESQUISA_NAO_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_EXTENSAO_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_EXTENSAO_NAO_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_MONITORIA_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_MONITORIA_NAO_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_ESTAG_N_OBRIG_REM()), Integer.parseInt(Manipular10.tupla.getIN_ATIV_ESTAG_N_OBRIG_NAO_REM()));
        catAdm        = new CategoriaAdministrativa(Integer.parseInt(Manipular10.tupla.getCO_CATEGORIA_ADMINISTRATIVA()), Manipular10.tupla.getDS_CATEGORIA_ADMINISTRATIVA());
        corRaca       = new CorRacaAluno(Integer.parseInt(Manipular10.tupla.getCO_COR_RACA_ALUNO()));
        curso         = new Curso(Integer.parseInt(Manipular10.tupla.getCO_CURSO()), Manipular10.tupla.getNO_CURSO(), Integer.parseInt(Manipular10.tupla.getCO_NIVEL_ACADEMICO()), Integer.parseInt(Manipular10.tupla.getCO_MODALIDADE_ENSINO()));
        financeiro    = new Financeiro(Integer.parseInt(Manipular10.tupla.getIN_FINANC_ESTUDANTIL()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_EXTERNAS()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_EXTERNAS_REEMB()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_IES()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_IES_REEMB()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_MUNICIPAL()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_MUNICIPAL_REEMB()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_ESTADUAL()), Integer.parseInt(Manipular10.tupla.getIN_FINANC_ESTADUAL_REEMB()), Integer.parseInt(Manipular10.tupla.getIN_PROUNI_INTEGRAL()), Integer.parseInt(Manipular10.tupla.getIN_PROUNI_PARCIAL()), Integer.parseInt(Manipular10.tupla.getIN_FIES()));
        grauAcademico = new GrauAcademico(Integer.parseInt(Manipular10.tupla.getCO_GRAU_ACADEMICO()));
        ingresso      = new Ingresso(Integer.parseInt(Manipular10.tupla.getIN_ING_VESTIBULAR()), Integer.parseInt(Manipular10.tupla.getIN_ING_ENEM()), Integer.parseInt(Manipular10.tupla.getIN_ING_CONVENIO_PECG()));
        ies           = new InstitutoEnsinoSuperior(Integer.parseInt(Manipular10.tupla.getCO_IES()), Manipular10.tupla.getNO_IES());
        matricula     = new Matricula(Integer.parseInt(Manipular10.tupla.getIN_MATRICULA()), Integer.parseInt(Manipular10.tupla.getIN_CONCLUINTE()), Integer.parseInt(Manipular10.tupla.getIN_INGRESSO()), Manipular10.tupla.getDT_INGRESSO_CURSO(), Integer.parseInt(Manipular10.tupla.getANO_INGRESSO()));
        nacionalidade = new NacionalidadeAluno(Integer.parseInt(Manipular10.tupla.getCO_NACIONALIDADE_ALUNO()));
        necessidade   = new NecessidadeEspecial(Integer.parseInt(Manipular10.tupla.getIN_CEGUEIRA()), Integer.parseInt(Manipular10.tupla.getIN_BAIXA_VISAO()), Integer.parseInt(Manipular10.tupla.getIN_SURDEZ()), Integer.parseInt(Manipular10.tupla.getIN_DEF_AUDITIVA()), Integer.parseInt(Manipular10.tupla.getIN_DEF_FISICA()), Integer.parseInt(Manipular10.tupla.getIN_SURDOCEGUEIRA()), Integer.parseInt(Manipular10.tupla.getIN_DEF_MULTIPLA()), Integer.parseInt(Manipular10.tupla.getIN_DEF_MENTAL()));
        orgAcademica  = new OrganizacaoAcademica(Integer.parseInt(Manipular10.tupla.getCO_ORGANIZACAO_ACADEMICA()), Manipular10.tupla.getDS_ORGANIZACAO_ACADEMICA());
        reserva       = new Reserva(Integer.parseInt(Manipular10.tupla.getIN_RESERVA_VAGAS()), Integer.parseInt(Manipular10.tupla.getIN_RESERVA_ENSINO_PUBLICO()), Integer.parseInt(Manipular10.tupla.getIN_RESERVA_ETNICO()), Integer.parseInt(Manipular10.tupla.getIN_RESERVA_DEFICIENCIA()), Integer.parseInt(Manipular10.tupla.getIN_RESERVA_RENDA_FAMILIAR()), Integer.parseInt(Manipular10.tupla.getIN_RESERVA_OUTROS()));

        new DAO.InstitutoEnsinoSuperior(ies, orgAcademica.getCO_ORGANIZACAO_ACADEMICA(), catAdm.getCO_CATEGORIA_ADMINISTRATIVA());
        new DAO.Curso(curso, grauAcademico.getCO_GRAU_ACADEMICO());
        new DAO.Aluno(aluno, corRaca.getCO_COR_RACA_ALUNO(), nacionalidade.getCO_NACIONALIDADE_ALUNO());
        new DAO.Matricula(matricula, aluno.getCO_ALUNO(), ies.getCO_IES(), curso.getCO_CURSO(), alunoSituacao.getCO_ALUNO_SITUACAO());
        new DAO.NecessidadeEspecial(necessidade, aluno.getCO_ALUNO());
        new DAO.Financeiro(financeiro, aluno.getCO_ALUNO());
        new DAO.Reserva(reserva, aluno.getCO_ALUNO());
        new DAO.Apoio(apoio, aluno.getCO_ALUNO());
        new DAO.Atividade(atividade, aluno.getCO_ALUNO());
        new DAO.Ingresso(ingresso, aluno.getCO_ALUNO());
    }
}
