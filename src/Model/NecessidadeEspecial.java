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
public class NecessidadeEspecial {
    private int IN_CEGUEIRA;
    private int IN_BAIXA_VISAO;
    private int IN_SURDEZ;
    private int IN_DEF_AUDITIVA;
    private int IN_DEF_FISICA;
    private int IN_SURDOCEGUEIRA;
    private int IN_DEF_MULTIPLA;
    private int IN_DEF_MENTAL;

    public NecessidadeEspecial(int IN_CEGUEIRA, int IN_BAIXA_VISAO, int IN_SURDEZ, int IN_DEF_AUDITIVA, int IN_DEF_FISICA, int IN_SURDOCEGUEIRA, int IN_DEF_MULTIPLA, int IN_DEF_MENTAL) {
        this.IN_CEGUEIRA = IN_CEGUEIRA;
        this.IN_BAIXA_VISAO = IN_BAIXA_VISAO;
        this.IN_SURDEZ = IN_SURDEZ;
        this.IN_DEF_AUDITIVA = IN_DEF_AUDITIVA;
        this.IN_DEF_FISICA = IN_DEF_FISICA;
        this.IN_SURDOCEGUEIRA = IN_SURDOCEGUEIRA;
        this.IN_DEF_MULTIPLA = IN_DEF_MULTIPLA;
        this.IN_DEF_MENTAL = IN_DEF_MENTAL;
    }

    public int getIN_CEGUEIRA() {
        return IN_CEGUEIRA;
    }

    public void setIN_CEGUEIRA(int IN_CEGUEIRA) {
        this.IN_CEGUEIRA = IN_CEGUEIRA;
    }

    public int getIN_BAIXA_VISAO() {
        return IN_BAIXA_VISAO;
    }

    public void setIN_BAIXA_VISAO(int IN_BAIXA_VISAO) {
        this.IN_BAIXA_VISAO = IN_BAIXA_VISAO;
    }

    public int getIN_SURDEZ() {
        return IN_SURDEZ;
    }

    public void setIN_SURDEZ(int IN_SURDEZ) {
        this.IN_SURDEZ = IN_SURDEZ;
    }

    public int getIN_DEF_AUDITIVA() {
        return IN_DEF_AUDITIVA;
    }

    public void setIN_DEF_AUDITIVA(int IN_DEF_AUDITIVA) {
        this.IN_DEF_AUDITIVA = IN_DEF_AUDITIVA;
    }

    public int getIN_DEF_FISICA() {
        return IN_DEF_FISICA;
    }

    public void setIN_DEF_FISICA(int IN_DEF_FISICA) {
        this.IN_DEF_FISICA = IN_DEF_FISICA;
    }

    public int getIN_SURDOCEGUEIRA() {
        return IN_SURDOCEGUEIRA;
    }

    public void setIN_SURDOCEGUEIRA(int IN_SURDOCEGUEIRA) {
        this.IN_SURDOCEGUEIRA = IN_SURDOCEGUEIRA;
    }

    public int getIN_DEF_MULTIPLA() {
        return IN_DEF_MULTIPLA;
    }

    public void setIN_DEF_MULTIPLA(int IN_DEF_MULTIPLA) {
        this.IN_DEF_MULTIPLA = IN_DEF_MULTIPLA;
    }

    public int getIN_DEF_MENTAL() {
        return IN_DEF_MENTAL;
    }

    public void setIN_DEF_MENTAL(int IN_DEF_MENTAL) {
        this.IN_DEF_MENTAL = IN_DEF_MENTAL;
    }
    
    
}
