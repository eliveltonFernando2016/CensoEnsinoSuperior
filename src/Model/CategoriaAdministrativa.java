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
public class CategoriaAdministrativa {
    private int CO_CATEGORIA_ADMINISTRATIVA;
    private String DS_CATEGORIA_ADMINISTRATIVA;

    public CategoriaAdministrativa(int CO_CATEGORIA_ADMINISTRATIVA, String DS_CATEGORIA_ADMINISTRATIVA) {
        this.CO_CATEGORIA_ADMINISTRATIVA = CO_CATEGORIA_ADMINISTRATIVA;
        this.DS_CATEGORIA_ADMINISTRATIVA = DS_CATEGORIA_ADMINISTRATIVA;
    }

    public CategoriaAdministrativa(int CO_CATEGORIA_ADMINISTRATIVA) {
        this.CO_CATEGORIA_ADMINISTRATIVA = CO_CATEGORIA_ADMINISTRATIVA;
    }

    public int getCO_CATEGORIA_ADMINISTRATIVA() {
        return CO_CATEGORIA_ADMINISTRATIVA;
    }

    public void setCO_CATEGORIA_ADMINISTRATIVA(int CO_CATEGORIA_ADMINISTRATIVA) {
        this.CO_CATEGORIA_ADMINISTRATIVA = CO_CATEGORIA_ADMINISTRATIVA;
    }

    public String getDS_CATEGORIA_ADMINISTRATIVA() {
        return DS_CATEGORIA_ADMINISTRATIVA;
    }

    public void setDS_CATEGORIA_ADMINISTRATIVA(String DS_CATEGORIA_ADMINISTRATIVA) {
        this.DS_CATEGORIA_ADMINISTRATIVA = DS_CATEGORIA_ADMINISTRATIVA;
    }
    
    
}
