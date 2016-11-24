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
public class OrganizacaoAcademica {
    private int CO_ORGANIZACAO_ACADEMICA;
    private String NO_ORGANIZACAO_ACADEMICA;

    public OrganizacaoAcademica(int CO_ORGANIZACAO_ACADEMICA, String NO_ORGANIZACAO_ACADEMICA) {
        this.CO_ORGANIZACAO_ACADEMICA = CO_ORGANIZACAO_ACADEMICA;
        this.NO_ORGANIZACAO_ACADEMICA = NO_ORGANIZACAO_ACADEMICA;
    }

    public int getCO_ORGANIZACAO_ACADEMICA() {
        return CO_ORGANIZACAO_ACADEMICA;
    }

    public void setCO_ORGANIZACAO_ACADEMICA(int CO_ORGANIZACAO_ACADEMICA) {
        this.CO_ORGANIZACAO_ACADEMICA = CO_ORGANIZACAO_ACADEMICA;
    }

    public String getNO_ORGANIZACAO_ACADEMICA() {
        return NO_ORGANIZACAO_ACADEMICA;
    }

    public void setNO_ORGANIZACAO_ACADEMICA(String NO_ORGANIZACAO_ACADEMICA) {
        this.NO_ORGANIZACAO_ACADEMICA = NO_ORGANIZACAO_ACADEMICA;
    }
    
    
}
