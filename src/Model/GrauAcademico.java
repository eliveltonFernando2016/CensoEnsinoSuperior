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
public class GrauAcademico {
    private int CO_GRAU_ACADEMICO;
    private String NO_GRAU_ACADEMICO;

    public GrauAcademico(int CO_GRAU_ACADEMICO, String NO_GRAU_ACADEMICO) {
        this.CO_GRAU_ACADEMICO = CO_GRAU_ACADEMICO;
        this.NO_GRAU_ACADEMICO = NO_GRAU_ACADEMICO;
    }

    public GrauAcademico(int CO_GRAU_ACADEMICO) {
        this.CO_GRAU_ACADEMICO = CO_GRAU_ACADEMICO;
    }

    public int getCO_GRAU_ACADEMICO() {
        return CO_GRAU_ACADEMICO;
    }

    public void setCO_GRAU_ACADEMICO(int CO_GRAU_ACADEMICO) {
        this.CO_GRAU_ACADEMICO = CO_GRAU_ACADEMICO;
    }

    public String getNO_GRAU_ACADEMICO() {
        return NO_GRAU_ACADEMICO;
    }

    public void setNO_GRAU_ACADEMICO(String NO_GRAU_ACADEMICO) {
        this.NO_GRAU_ACADEMICO = NO_GRAU_ACADEMICO;
    }
    
    
}
