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
public class InstitutoEnsinoSuperior {
    private int CO_IES;
    private String NO_IES;

    public InstitutoEnsinoSuperior(int CO_IES, String NO_IES) {
        this.CO_IES = CO_IES;
        this.NO_IES = NO_IES;
    }

    public int getCO_IES() {
        return CO_IES;
    }

    public void setCO_IES(int CO_IES) {
        this.CO_IES = CO_IES;
    }

    public String getNO_IES() {
        return NO_IES;
    }

    public void setNO_IES(String NO_IES) {
        this.NO_IES = NO_IES;
    }
}
