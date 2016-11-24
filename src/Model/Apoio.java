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
public class Apoio {
    private int IN_APOIO_SOCIAL;
    private int IN_APOIO_ALIMENTACAO;
    private int IN_APOIO_MORADIA;
    private int IN_APOIO_TRANSPORTE;
    private int IN_APOIO_MATERIAL_DIDATICO;
    private int IN_APOIO_BOLSA_PERMANENCIA;
    private int IN_APOIO_BOLSA_TRABALHO;

    public Apoio(int IN_APOIO_SOCIAL, int IN_APOIO_ALIMENTACAO, int IN_APOIO_MORADIA, int IN_APOIO_TRANSPORTE, int IN_APOIO_MATERIAL_DIDATICO, int IN_APOIO_BOLSA_PERMANENCIA, int IN_APOIO_BOLSA_TRABALHO) {
        this.IN_APOIO_SOCIAL = IN_APOIO_SOCIAL;
        this.IN_APOIO_ALIMENTACAO = IN_APOIO_ALIMENTACAO;
        this.IN_APOIO_MORADIA = IN_APOIO_MORADIA;
        this.IN_APOIO_TRANSPORTE = IN_APOIO_TRANSPORTE;
        this.IN_APOIO_MATERIAL_DIDATICO = IN_APOIO_MATERIAL_DIDATICO;
        this.IN_APOIO_BOLSA_PERMANENCIA = IN_APOIO_BOLSA_PERMANENCIA;
        this.IN_APOIO_BOLSA_TRABALHO = IN_APOIO_BOLSA_TRABALHO;
    }

    public int getIN_APOIO_SOCIAL() {
        return IN_APOIO_SOCIAL;
    }

    public void setIN_APOIO_SOCIAL(int IN_APOIO_SOCIAL) {
        this.IN_APOIO_SOCIAL = IN_APOIO_SOCIAL;
    }

    public int getIN_APOIO_ALIMENTACAO() {
        return IN_APOIO_ALIMENTACAO;
    }

    public void setIN_APOIO_ALIMENTACAO(int IN_APOIO_ALIMENTACAO) {
        this.IN_APOIO_ALIMENTACAO = IN_APOIO_ALIMENTACAO;
    }

    public int getIN_APOIO_MORADIA() {
        return IN_APOIO_MORADIA;
    }

    public void setIN_APOIO_MORADIA(int IN_APOIO_MORADIA) {
        this.IN_APOIO_MORADIA = IN_APOIO_MORADIA;
    }

    public int getIN_APOIO_TRANSPORTE() {
        return IN_APOIO_TRANSPORTE;
    }

    public void setIN_APOIO_TRANSPORTE(int IN_APOIO_TRANSPORTE) {
        this.IN_APOIO_TRANSPORTE = IN_APOIO_TRANSPORTE;
    }

    public int getIN_APOIO_MATERIAL_DIDATICO() {
        return IN_APOIO_MATERIAL_DIDATICO;
    }

    public void setIN_APOIO_MATERIAL_DIDATICO(int IN_APOIO_MATERIAL_DIDATICO) {
        this.IN_APOIO_MATERIAL_DIDATICO = IN_APOIO_MATERIAL_DIDATICO;
    }

    public int getIN_APOIO_BOLSA_PERMANENCIA() {
        return IN_APOIO_BOLSA_PERMANENCIA;
    }

    public void setIN_APOIO_BOLSA_PERMANENCIA(int IN_APOIO_BOLSA_PERMANENCIA) {
        this.IN_APOIO_BOLSA_PERMANENCIA = IN_APOIO_BOLSA_PERMANENCIA;
    }

    public int getIN_APOIO_BOLSA_TRABALHO() {
        return IN_APOIO_BOLSA_TRABALHO;
    }

    public void setIN_APOIO_BOLSA_TRABALHO(int IN_APOIO_BOLSA_TRABALHO) {
        this.IN_APOIO_BOLSA_TRABALHO = IN_APOIO_BOLSA_TRABALHO;
    }
    
    
}
