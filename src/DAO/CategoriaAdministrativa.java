/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author elivelton
 */
public class CategoriaAdministrativa {
    public CategoriaAdministrativa(Model.CategoriaAdministrativa c){
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into categoria_administrativa (co_categoria_administrativa, ds_categoria_administrativa) values(?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setInt(1, c.getCO_CATEGORIA_ADMINISTRATIVA());
            stm.setString(2, c.getDS_CATEGORIA_ADMINISTRATIVA());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Categoria Administrativa Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
