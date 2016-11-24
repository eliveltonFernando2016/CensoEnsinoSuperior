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
public class Ingresso {
    private int IN_ING_VESTIBULAR;
    private int IN_ING_ENEM;
    private int IN_ING_CONVENIO_PECG;

    public Ingresso(int IN_ING_VESTIBULAR, int IN_ING_ENEM, int IN_ING_CONVENIO_PECG) {
        this.IN_ING_VESTIBULAR = IN_ING_VESTIBULAR;
        this.IN_ING_ENEM = IN_ING_ENEM;
        this.IN_ING_CONVENIO_PECG = IN_ING_CONVENIO_PECG;
    }

    public int getIN_ING_VESTIBULAR() {
        return IN_ING_VESTIBULAR;
    }

    public void setIN_ING_VESTIBULAR(int IN_ING_VESTIBULAR) {
        this.IN_ING_VESTIBULAR = IN_ING_VESTIBULAR;
    }

    public int getIN_ING_ENEM() {
        return IN_ING_ENEM;
    }

    public void setIN_ING_ENEM(int IN_ING_ENEM) {
        this.IN_ING_ENEM = IN_ING_ENEM;
    }

    public int getIN_ING_CONVENIO_PECG() {
        return IN_ING_CONVENIO_PECG;
    }

    public void setIN_ING_CONVENIO_PECG(int IN_ING_CONVENIO_PECG) {
        this.IN_ING_CONVENIO_PECG = IN_ING_CONVENIO_PECG;
    }
    
    
}
