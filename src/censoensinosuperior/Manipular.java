package censoensinosuperior;

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
import Model.Tupla;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manipular {
    private Aluno aluno;
    private AlunoSituacao alunoSituacao;
    private Apoio apoio;
    private Atividade atividade;
    private CategoriaAdministrativa catAdm;
    private CorRacaAluno corRaca;
    private Curso curso;
    private Financeiro financeiro;
    private GrauAcademico grauAcademico;
    private Ingresso ingresso;
    private InstitutoEnsinoSuperior ies;
    private Matricula matricula;
    private NacionalidadeAluno nacionalidade;
    private NecessidadeEspecial necessidade;
    private OrganizacaoAcademica orgAcademica;
    private Reserva reserva;

    public void lerArquivo(String caminho) {
        String linha;                                                           // Cria variável para armazenar a linha do arquivo a ser lido
        Tupla tupla = null;

        try {
            FileReader reader = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                st = new StringTokenizer(linha, "|");                           // Define token de separação.
                
                tupla = new Tupla(
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim()
                );
                SeparaClasse(tupla);
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SeparaClasse(Tupla t){
        if("".equals(t.getCO_IES())) t.setCO_IES("-1");
        if("".equals(t.getCO_CATEGORIA_ADMINISTRATIVA())) t.setCO_CATEGORIA_ADMINISTRATIVA("-1");
        if("".equals(t.getCO_ORGANIZACAO_ACADEMICA())) t.setCO_ORGANIZACAO_ACADEMICA("-1");
        if("".equals(t.getCO_CURSO())) t.setCO_CURSO("-1");
        if("".equals(t.getCO_NIVEL_ACADEMICO())) t.setCO_NIVEL_ACADEMICO("-1");
        if("".equals(t.getCO_MODALIDADE_ENSINO())) t.setCO_MODALIDADE_ENSINO("-1");
        if("".equals(t.getCO_GRAU_ACADEMICO())) t.setCO_GRAU_ACADEMICO("-1");
        if("".equals(t.getCO_ALUNO_CURSO())) t.setCO_ALUNO_CURSO("-1");
        if("".equals(t.getCO_ALUNO())) t.setCO_ALUNO("-1");
        if("".equals(t.getCO_ALUNO_SITUACAO())) t.setCO_ALUNO_SITUACAO("-1");
        if("".equals(t.getIN_ING_VESTIBULAR())) t.setIN_ING_VESTIBULAR("-1");
        if("".equals(t.getIN_ING_ENEM())) t.setIN_ING_ENEM("-1");
        if("".equals(t.getIN_ING_CONVENIO_PECG())) t.setIN_ING_CONVENIO_PECG("-1");
        if("".equals(t.getIN_APOIO_SOCIAL())) t.setIN_APOIO_SOCIAL("-1");
        if("".equals(t.getIN_APOIO_ALIMENTACAO())) t.setIN_APOIO_ALIMENTACAO("-1");
        if("".equals(t.getIN_APOIO_MORADIA())) t.setIN_APOIO_MORADIA("-1");
        if("".equals(t.getIN_APOIO_TRANSPORTE())) t.setIN_APOIO_TRANSPORTE("-1");
        if("".equals(t.getIN_APOIO_MATERIAL_DIDATICO())) t.setIN_APOIO_MATERIAL_DIDATICO("-1");
        if("".equals(t.getIN_APOIO_BOLSA_PERMANENCIA())) t.setIN_APOIO_BOLSA_PERMANENCIA("-1");
        if("".equals(t.getIN_APOIO_BOLSA_TRABALHO())) t.setIN_APOIO_BOLSA_TRABALHO("-1");
        if("".equals(t.getIN_CEGUEIRA())) t.setIN_CEGUEIRA("-1");
        if("".equals(t.getIN_BAIXA_VISAO())) t.setIN_BAIXA_VISAO("-1");
        if("".equals(t.getIN_SURDEZ())) t.setIN_SURDEZ("-1");
        if("".equals(t.getIN_DEF_AUDITIVA())) t.setIN_DEF_AUDITIVA("-1");
        if("".equals(t.getIN_DEF_FISICA())) t.setIN_DEF_FISICA("-1");
        if("".equals(t.getIN_SURDOCEGUEIRA())) t.setIN_SURDOCEGUEIRA("-1");
        if("".equals(t.getIN_DEF_MULTIPLA())) t.setIN_DEF_MULTIPLA("-1");
        if("".equals(t.getIN_DEF_MENTAL())) t.setIN_DEF_MENTAL("-1");
        if("".equals(t.getIN_RESERVA_VAGAS())) t.setIN_RESERVA_VAGAS("-1");
        if("".equals(t.getIN_RESERVA_ENSINO_PUBLICO())) t.setIN_RESERVA_ENSINO_PUBLICO("-1");
        if("".equals(t.getIN_RESERVA_ETNICO())) t.setIN_RESERVA_ETNICO("-1");
        if("".equals(t.getIN_RESERVA_DEFICIENCIA())) t.setIN_RESERVA_DEFICIENCIA("-1");
        if("".equals(t.getIN_RESERVA_RENDA_FAMILIAR())) t.setIN_RESERVA_RENDA_FAMILIAR("-1");
        if("".equals(t.getIN_RESERVA_OUTROS())) t.setIN_RESERVA_OUTROS("-1");
        if("".equals(t.getIN_ATIV_PESQUISA_REM())) t.setIN_ATIV_PESQUISA_REM("-1");
        if("".equals(t.getIN_ATIV_PESQUISA_NAO_REM())) t.setIN_ATIV_PESQUISA_NAO_REM("-1");
        if("".equals(t.getIN_ATIV_EXTENSAO_REM())) t.setIN_ATIV_EXTENSAO_REM("-1");
        if("".equals(t.getIN_ATIV_EXTENSAO_NAO_REM())) t.setIN_ATIV_EXTENSAO_NAO_REM("-1");
        if("".equals(t.getIN_ATIV_MONITORIA_REM())) t.setIN_ATIV_MONITORIA_REM("-1");
        if("".equals(t.getIN_ATIV_MONITORIA_NAO_REM())) t.setIN_ATIV_MONITORIA_NAO_REM("-1");
        if("".equals(t.getIN_ATIV_ESTAG_N_OBRIG_REM())) t.setIN_ATIV_ESTAG_N_OBRIG_REM("-1");
        if("".equals(t.getIN_ATIV_ESTAG_N_OBRIG_NAO_REM())) t.setIN_ATIV_ESTAG_N_OBRIG_NAO_REM("-1");
        if("".equals(t.getIN_FINANC_ESTUDANTIL())) t.setIN_FINANC_ESTUDANTIL("-1");
        if("".equals(t.getIN_FINANC_EXTERNAS())) t.setIN_FINANC_EXTERNAS("-1");
        if("".equals(t.getIN_FINANC_EXTERNAS_REEMB())) t.setIN_FINANC_EXTERNAS_REEMB("-1");
        if("".equals(t.getIN_FINANC_IES())) t.setIN_FINANC_IES("-1");
        if("".equals(t.getIN_FINANC_IES_REEMB())) t.setIN_FINANC_IES_REEMB("-1");
        if("".equals(t.getIN_FINANC_MUNICIPAL())) t.setIN_FINANC_MUNICIPAL("-1");
        if("".equals(t.getIN_FINANC_MUNICIPAL_REEMB())) t.setIN_FINANC_MUNICIPAL_REEMB("-1");
        if("".equals(t.getIN_FINANC_ESTADUAL())) t.setIN_FINANC_ESTADUAL("-1");
        if("".equals(t.getIN_FINANC_ESTADUAL_REEMB())) t.setIN_FINANC_ESTADUAL_REEMB("-1");
        if("".equals(t.getIN_PROUNI_INTEGRAL())) t.setIN_PROUNI_INTEGRAL("-1");
        if("".equals(t.getIN_PROUNI_PARCIAL())) t.setIN_PROUNI_PARCIAL("-1");
        if("".equals(t.getIN_FIES())) t.setIN_FIES("-1");
        if("".equals(t.getIN_SEXO_ALUNO())) t.setIN_SEXO_ALUNO("-1");
        if("".equals(t.getCO_COR_RACA_ALUNO())) t.setCO_COR_RACA_ALUNO("-1");
        if("".equals(t.getCO_NACIONALIDADE_ALUNO())) t.setCO_NACIONALIDADE_ALUNO("-1");
        if("".equals(t.getCO_PAIS_ORIGEM_ALUNO())) t.setCO_PAIS_ORIGEM_ALUNO("-1");
        if("".equals(t.getNU_ANO_ALUNO_NASC())) t.setNU_ANO_ALUNO_NASC("-1");
        if("".equals(t.getNU_DIA_ALUNO_NASC())) t.setNU_DIA_ALUNO_NASC("-1");
        if("".equals(t.getNU_MES_ALUNO_NASC())) t.setNU_MES_ALUNO_NASC("-1");
        if("".equals(t.getNU_IDADE_ALUNO())) t.setNU_IDADE_ALUNO("-1");
        if("".equals(t.getIN_MATRICULA())) t.setIN_MATRICULA("-1");
        if("".equals(t.getIN_CONCLUINTE())) t.setIN_CONCLUINTE("-1");
        if("".equals(t.getIN_INGRESSO())) t.setIN_INGRESSO("-1");
        if("".equals(t.getDT_INGRESSO_CURSO())) t.setDT_INGRESSO_CURSO("-1");
        if("".equals(t.getANO_INGRESSO())) t.setANO_INGRESSO("-1");
        
        aluno = new Aluno(Long.parseLong(t.getCO_ALUNO()), Integer.parseInt(t.getIN_SEXO_ALUNO()), Integer.parseInt(t.getCO_PAIS_ORIGEM_ALUNO()), Integer.parseInt(t.getNU_ANO_ALUNO_NASC()), Integer.parseInt(t.getNU_DIA_ALUNO_NASC()), Integer.parseInt(t.getNU_MES_ALUNO_NASC()), Integer.parseInt(t.getNU_IDADE_ALUNO()));
        alunoSituacao = new AlunoSituacao(Integer.parseInt(t.getCO_ALUNO_SITUACAO()));
        apoio = new Apoio(Integer.parseInt(t.getIN_APOIO_SOCIAL()), Integer.parseInt(t.getIN_APOIO_ALIMENTACAO()), Integer.parseInt(t.getIN_APOIO_MORADIA()), Integer.parseInt(t.getIN_APOIO_TRANSPORTE()), Integer.parseInt(t.getIN_APOIO_MATERIAL_DIDATICO()), Integer.parseInt(t.getIN_APOIO_BOLSA_PERMANENCIA()), Integer.parseInt(t.getIN_APOIO_BOLSA_TRABALHO()));
        atividade = new Atividade(Integer.parseInt(t.getIN_ATIV_PESQUISA_REM()), Integer.parseInt(t.getIN_ATIV_PESQUISA_NAO_REM()), Integer.parseInt(t.getIN_ATIV_EXTENSAO_REM()), Integer.parseInt(t.getIN_ATIV_EXTENSAO_NAO_REM()), Integer.parseInt(t.getIN_ATIV_MONITORIA_REM()), Integer.parseInt(t.getIN_ATIV_MONITORIA_NAO_REM()), Integer.parseInt(t.getIN_ATIV_ESTAG_N_OBRIG_REM()), Integer.parseInt(t.getIN_ATIV_ESTAG_N_OBRIG_NAO_REM()));
        catAdm = new CategoriaAdministrativa(Integer.parseInt(t.getCO_CATEGORIA_ADMINISTRATIVA()), t.getDS_CATEGORIA_ADMINISTRATIVA());
        corRaca = new CorRacaAluno(Integer.parseInt(t.getCO_COR_RACA_ALUNO()));
        curso = new Curso(Integer.parseInt(t.getCO_CURSO()), t.getNO_CURSO(), Integer.parseInt(t.getCO_NIVEL_ACADEMICO()), Integer.parseInt(t.getCO_MODALIDADE_ENSINO()));
        financeiro = new Financeiro(Integer.parseInt(t.getIN_FINANC_ESTUDANTIL()), Integer.parseInt(t.getIN_FINANC_EXTERNAS()), Integer.parseInt(t.getIN_FINANC_EXTERNAS_REEMB()), Integer.parseInt(t.getIN_FINANC_IES()), Integer.parseInt(t.getIN_FINANC_IES_REEMB()), Integer.parseInt(t.getIN_FINANC_MUNICIPAL()), Integer.parseInt(t.getIN_FINANC_MUNICIPAL_REEMB()), Integer.parseInt(t.getIN_FINANC_ESTADUAL()), Integer.parseInt(t.getIN_FINANC_ESTADUAL_REEMB()), Integer.parseInt(t.getIN_PROUNI_INTEGRAL()), Integer.parseInt(t.getIN_PROUNI_PARCIAL()), Integer.parseInt(t.getIN_FIES()));
        grauAcademico = new GrauAcademico(Integer.parseInt(t.getCO_GRAU_ACADEMICO()));
        ingresso = new Ingresso(Integer.parseInt(t.getIN_ING_VESTIBULAR()), Integer.parseInt(t.getIN_ING_ENEM()), Integer.parseInt(t.getIN_ING_CONVENIO_PECG()));
        ies = new InstitutoEnsinoSuperior(Integer.parseInt(t.getCO_IES()), t.getNO_IES());
        matricula = new Matricula(Integer.parseInt(t.getIN_MATRICULA()), Integer.parseInt(t.getIN_CONCLUINTE()), Integer.parseInt(t.getIN_INGRESSO()), t.getDT_INGRESSO_CURSO(), Integer.parseInt(t.getANO_INGRESSO()));
        nacionalidade = new NacionalidadeAluno(Integer.parseInt(t.getCO_NACIONALIDADE_ALUNO()));
        necessidade = new NecessidadeEspecial(Integer.parseInt(t.getIN_CEGUEIRA()), Integer.parseInt(t.getIN_BAIXA_VISAO()), Integer.parseInt(t.getIN_SURDEZ()), Integer.parseInt(t.getIN_DEF_AUDITIVA()), Integer.parseInt(t.getIN_DEF_FISICA()), Integer.parseInt(t.getIN_SURDOCEGUEIRA()), Integer.parseInt(t.getIN_DEF_MULTIPLA()), Integer.parseInt(t.getIN_DEF_MENTAL()));
        orgAcademica = new OrganizacaoAcademica(Integer.parseInt(t.getCO_ORGANIZACAO_ACADEMICA()), t.getDS_ORGANIZACAO_ACADEMICA());
        reserva = new Reserva(Integer.parseInt(t.getIN_RESERVA_VAGAS()), Integer.parseInt(t.getIN_RESERVA_ENSINO_PUBLICO()), Integer.parseInt(t.getIN_RESERVA_ETNICO()), Integer.parseInt(t.getIN_RESERVA_DEFICIENCIA()), Integer.parseInt(t.getIN_RESERVA_RENDA_FAMILIAR()), Integer.parseInt(t.getIN_RESERVA_OUTROS()));

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