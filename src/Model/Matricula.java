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
public class Matricula {
    private int IN_MATRICULA;
    private int IN_CONCLUINTE;
    private int IN_INGRESSO;
    private String DT_INGRESSO_CURSO;
    private int ANO_INGRESSO;

    public Matricula(int IN_MATRICULA, int IN_CONCLUINTE, int IN_INGRESSO, String DT_INGRESSO_CURSO, int ANO_INGRESSO) {
        this.IN_MATRICULA = IN_MATRICULA;
        this.IN_CONCLUINTE = IN_CONCLUINTE;
        this.IN_INGRESSO = IN_INGRESSO;
        this.DT_INGRESSO_CURSO = DT_INGRESSO_CURSO;
        this.ANO_INGRESSO = ANO_INGRESSO;
    }

    public int getIN_MATRICULA() {
        return IN_MATRICULA;
    }

    public void setIN_MATRICULA(int IN_MATRICULA) {
        this.IN_MATRICULA = IN_MATRICULA;
    }

    public int getIN_CONCLUINTE() {
        return IN_CONCLUINTE;
    }

    public void setIN_CONCLUINTE(int IN_CONCLUINTE) {
        this.IN_CONCLUINTE = IN_CONCLUINTE;
    }

    public int getIN_INGRESSO() {
        return IN_INGRESSO;
    }

    public void setIN_INGRESSO(int IN_INGRESSO) {
        this.IN_INGRESSO = IN_INGRESSO;
    }

    public String getDT_INGRESSO_CURSO() {
        return DT_INGRESSO_CURSO;
    }

    public void setDT_INGRESSO_CURSO(String DT_INGRESSO_CURSO) {
        this.DT_INGRESSO_CURSO = DT_INGRESSO_CURSO;
    }

    public int getANO_INGRESSO() {
        return ANO_INGRESSO;
    }

    public void setANO_INGRESSO(int ANO_INGRESSO) {
        this.ANO_INGRESSO = ANO_INGRESSO;
    }
}
