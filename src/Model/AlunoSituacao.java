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
public class AlunoSituacao {
    private int CO_ALUNO_SITUACAO;
    private String NO_ALUNO_SITUACAO;

    public AlunoSituacao(int CO_ALUNO_SITUACAO, String NO_ALUNO_SITUACAO) {
        this.CO_ALUNO_SITUACAO = CO_ALUNO_SITUACAO;
        this.NO_ALUNO_SITUACAO = NO_ALUNO_SITUACAO;
    }

    public AlunoSituacao(int CO_ALUNO_SITUACAO) {
        this.CO_ALUNO_SITUACAO = CO_ALUNO_SITUACAO;
    }

    public int getCO_ALUNO_SITUACAO() {
        return CO_ALUNO_SITUACAO;
    }

    public void setCO_ALUNO_SITUACAO(int CO_ALUNO_SITUACAO) {
        this.CO_ALUNO_SITUACAO = CO_ALUNO_SITUACAO;
    }

    public String getNO_ALUNO_SITUACAO() {
        return NO_ALUNO_SITUACAO;
    }

    public void setNO_ALUNO_SITUACAO(String NO_ALUNO_SITUACAO) {
        this.NO_ALUNO_SITUACAO = NO_ALUNO_SITUACAO;
    }
    
    
}
