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
public class Curso {
    private int CO_CURSO;
    private String NO_CURSO;
    private int CO_NIVEL_ACADEMICO;
    private int CO_MODALIDADE_ENSINO;

    public Curso(int CO_CURSO, String NO_CURSO, int CO_NIVEL_ACADEMICO, int CO_MODALIDADE_ENSINO) {
        this.CO_CURSO = CO_CURSO;
        this.NO_CURSO = NO_CURSO;
        this.CO_NIVEL_ACADEMICO = CO_NIVEL_ACADEMICO;
        this.CO_MODALIDADE_ENSINO = CO_MODALIDADE_ENSINO;
    }

    public int getCO_CURSO() {
        return CO_CURSO;
    }

    public void setCO_CURSO(int CO_CURSO) {
        this.CO_CURSO = CO_CURSO;
    }

    public String getNO_CURSO() {
        return NO_CURSO;
    }

    public void setNO_CURSO(String NO_CURSO) {
        this.NO_CURSO = NO_CURSO;
    }

    public int getCO_NIVEL_ACADEMICO() {
        return CO_NIVEL_ACADEMICO;
    }

    public void setCO_NIVEL_ACADEMICO(int CO_NIVEL_ACADEMICO) {
        this.CO_NIVEL_ACADEMICO = CO_NIVEL_ACADEMICO;
    }

    public int getCO_MODALIDADE_ENSINO() {
        return CO_MODALIDADE_ENSINO;
    }

    public void setCO_MODALIDADE_ENSINO(int CO_MODALIDADE_ENSINO) {
        this.CO_MODALIDADE_ENSINO = CO_MODALIDADE_ENSINO;
    }
}
