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
public class Aluno {
    private long CO_ALUNO;
    private int IN_SEXO_ALUNO;
    private int CO_PAIS_ORIGEM_ALUNO;
    private int NU_ANO_ALUNO_NASC;
    private int NU_DIA_ALUNO_NASC;
    private int NU_MES_ALUNO_NASC;
    private int NU_IDADE_ALUNO;

    public Aluno(long CO_ALUNO, int IN_SEXO_ALUNO, int CO_PAIS_ORIGEM_ALUNO, int NU_ANO_ALUNO_NASC, int NU_DIA_ALUNO_NASC, int NU_MES_ALUNO_NASC, int NU_IDADE_ALUNO) {
        this.CO_ALUNO = CO_ALUNO;
        this.IN_SEXO_ALUNO = IN_SEXO_ALUNO;
        this.CO_PAIS_ORIGEM_ALUNO = CO_PAIS_ORIGEM_ALUNO;
        this.NU_ANO_ALUNO_NASC = NU_ANO_ALUNO_NASC;
        this.NU_DIA_ALUNO_NASC = NU_DIA_ALUNO_NASC;
        this.NU_MES_ALUNO_NASC = NU_MES_ALUNO_NASC;
        this.NU_IDADE_ALUNO = NU_IDADE_ALUNO;
    }
    
    public long getCO_ALUNO() {
        return CO_ALUNO;
    }

    public void setCO_ALUNO(long CO_ALUNO) {
        this.CO_ALUNO = CO_ALUNO;
    }

    public int getIN_SEXO_ALUNO() {
        return IN_SEXO_ALUNO;
    }

    public void setIN_SEXO_ALUNO(int IN_SEXO_ALUNO) {
        this.IN_SEXO_ALUNO = IN_SEXO_ALUNO;
    }

    public int getCO_PAIS_ORIGEM_ALUNO() {
        return CO_PAIS_ORIGEM_ALUNO;
    }

    public void setCO_PAIS_ORIGEM_ALUNO(int CO_PAIS_ORIGEM_ALUNO) {
        this.CO_PAIS_ORIGEM_ALUNO = CO_PAIS_ORIGEM_ALUNO;
    }

    public int getNU_ANO_ALUNO_NASC() {
        return NU_ANO_ALUNO_NASC;
    }

    public void setNU_ANO_ALUNO_NASC(int NU_ANO_ALUNO_NASC) {
        this.NU_ANO_ALUNO_NASC = NU_ANO_ALUNO_NASC;
    }

    public int getNU_DIA_ALUNO_NASC() {
        return NU_DIA_ALUNO_NASC;
    }

    public void setNU_DIA_ALUNO_NASC(int NU_DIA_ALUNO_NASC) {
        this.NU_DIA_ALUNO_NASC = NU_DIA_ALUNO_NASC;
    }

    public int getNU_MES_ALUNO_NASC() {
        return NU_MES_ALUNO_NASC;
    }

    public void setNU_MES_ALUNO_NASC(int NU_MES_ALUNO_NASC) {
        this.NU_MES_ALUNO_NASC = NU_MES_ALUNO_NASC;
    }

    public int getNU_IDADE_ALUNO() {
        return NU_IDADE_ALUNO;
    }

    public void setNU_IDADE_ALUNO(int NU_IDADE_ALUNO) {
        this.NU_IDADE_ALUNO = NU_IDADE_ALUNO;
    }
}