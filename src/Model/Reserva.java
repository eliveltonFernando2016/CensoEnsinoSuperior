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
public class Reserva {
    private int IN_RESERVA_VAGAS;
    private int IN_RESERVA_ENSINO_PUBLICO;
    private int IN_RESERVA_ETNICO;
    private int IN_RESERVA_DEFICIENCIA;
    private int IN_RESERVA_RENDA_FAMILIAR;
    private int IN_RESERVA_OUTROS;

    public Reserva(int IN_RESERVA_VAGAS, int IN_RESERVA_ENSINO_PUBLICO, int IN_RESERVA_ETNICO, int IN_RESERVA_DEFICIENCIA, int IN_RESERVA_RENDA_FAMILIAR, int IN_RESERVA_OUTROS) {
        this.IN_RESERVA_VAGAS = IN_RESERVA_VAGAS;
        this.IN_RESERVA_ENSINO_PUBLICO = IN_RESERVA_ENSINO_PUBLICO;
        this.IN_RESERVA_ETNICO = IN_RESERVA_ETNICO;
        this.IN_RESERVA_DEFICIENCIA = IN_RESERVA_DEFICIENCIA;
        this.IN_RESERVA_RENDA_FAMILIAR = IN_RESERVA_RENDA_FAMILIAR;
        this.IN_RESERVA_OUTROS = IN_RESERVA_OUTROS;
    }

    public int getIN_RESERVA_VAGAS() {
        return IN_RESERVA_VAGAS;
    }

    public void setIN_RESERVA_VAGAS(int IN_RESERVA_VAGAS) {
        this.IN_RESERVA_VAGAS = IN_RESERVA_VAGAS;
    }

    public int getIN_RESERVA_ENSINO_PUBLICO() {
        return IN_RESERVA_ENSINO_PUBLICO;
    }

    public void setIN_RESERVA_ENSINO_PUBLICO(int IN_RESERVA_ENSINO_PUBLICO) {
        this.IN_RESERVA_ENSINO_PUBLICO = IN_RESERVA_ENSINO_PUBLICO;
    }

    public int getIN_RESERVA_ETNICO() {
        return IN_RESERVA_ETNICO;
    }

    public void setIN_RESERVA_ETNICO(int IN_RESERVA_ETNICO) {
        this.IN_RESERVA_ETNICO = IN_RESERVA_ETNICO;
    }

    public int getIN_RESERVA_DEFICIENCIA() {
        return IN_RESERVA_DEFICIENCIA;
    }

    public void setIN_RESERVA_DEFICIENCIA(int IN_RESERVA_DEFICIENCIA) {
        this.IN_RESERVA_DEFICIENCIA = IN_RESERVA_DEFICIENCIA;
    }

    public int getIN_RESERVA_RENDA_FAMILIAR() {
        return IN_RESERVA_RENDA_FAMILIAR;
    }

    public void setIN_RESERVA_RENDA_FAMILIAR(int IN_RESERVA_RENDA_FAMILIAR) {
        this.IN_RESERVA_RENDA_FAMILIAR = IN_RESERVA_RENDA_FAMILIAR;
    }

    public int getIN_RESERVA_OUTROS() {
        return IN_RESERVA_OUTROS;
    }

    public void setIN_RESERVA_OUTROS(int IN_RESERVA_OUTROS) {
        this.IN_RESERVA_OUTROS = IN_RESERVA_OUTROS;
    }
    
    
}
