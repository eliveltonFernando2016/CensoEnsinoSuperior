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
public class NacionalidadeAluno {
    private int CO_NACIONALIDADE_ALUNO;
    private String NO_NACIONALIDADE_ALUNO;

    public NacionalidadeAluno(int CO_NACIONALIDADE_ALUNO, String NO_NACIONALIDADE_ALUNO) {
        this.CO_NACIONALIDADE_ALUNO = CO_NACIONALIDADE_ALUNO;
        this.NO_NACIONALIDADE_ALUNO = NO_NACIONALIDADE_ALUNO;
    }

    public NacionalidadeAluno(int CO_NACIONALIDADE_ALUNO) {
        this.CO_NACIONALIDADE_ALUNO = CO_NACIONALIDADE_ALUNO;
    }

    public int getCO_NACIONALIDADE_ALUNO() {
        return CO_NACIONALIDADE_ALUNO;
    }

    public void setCO_NACIONALIDADE_ALUNO(int CO_NACIONALIDADE_ALUNO) {
        this.CO_NACIONALIDADE_ALUNO = CO_NACIONALIDADE_ALUNO;
    }

    public String getNO_NACIONALIDADE_ALUNO() {
        return NO_NACIONALIDADE_ALUNO;
    }

    public void setNO_NACIONALIDADE_ALUNO(String NO_NACIONALIDADE_ALUNO) {
        this.NO_NACIONALIDADE_ALUNO = NO_NACIONALIDADE_ALUNO;
    }
    
    
}
