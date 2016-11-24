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
public class CorRacaAluno {
    private int CO_COR_RACA_ALUNO;
    private String NO_COR_RACA_ALUNO;

    public CorRacaAluno(int CO_COR_RACA_ALUNO, String NO_COR_RACA_ALUNO) {
        this.CO_COR_RACA_ALUNO = CO_COR_RACA_ALUNO;
        this.NO_COR_RACA_ALUNO = NO_COR_RACA_ALUNO;
    }

    public CorRacaAluno(int CO_COR_RACA_ALUNO) {
        this.CO_COR_RACA_ALUNO = CO_COR_RACA_ALUNO;
    }

    public int getCO_COR_RACA_ALUNO() {
        return CO_COR_RACA_ALUNO;
    }

    public void setCO_COR_RACA_ALUNO(int CO_COR_RACA_ALUNO) {
        this.CO_COR_RACA_ALUNO = CO_COR_RACA_ALUNO;
    }

    public String getNO_COR_RACA_ALUNO() {
        return NO_COR_RACA_ALUNO;
    }

    public void setNO_COR_RACA_ALUNO(String NO_COR_RACA_ALUNO) {
        this.NO_COR_RACA_ALUNO = NO_COR_RACA_ALUNO;
    }
    
    
}
