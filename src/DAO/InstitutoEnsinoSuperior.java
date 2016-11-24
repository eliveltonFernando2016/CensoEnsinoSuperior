/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author elivelton
 */
public class InstitutoEnsinoSuperior {

    public InstitutoEnsinoSuperior(Model.InstitutoEnsinoSuperior ies, int org, int cat) {
        if(!IesExistente(ies.getCO_IES())){
            ConexaoBD con = new ConexaoBD();
            Connection conectar = con.conexao();

            try {
                String sql = "insert into ies (co_ies, no_ies, organizacao_academica, categoria_administrativa) values(?, ?, ?, ?)";
                PreparedStatement stm = conectar.prepareStatement(sql);

                stm.setInt(1, ies.getCO_IES());
                stm.setString(2, ies.getNO_IES());
                stm.setInt(3, org);
                stm.setInt(4, cat);

                stm.execute();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Inserção IES Falhou!");
            } finally{
                con.desconexao(conectar);
            }
        }
    }
    
    public boolean IesExistente(int idIes){
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();
        
        boolean existe = false;
        
        try {
            String sql = "select co_ies from ies WHERE co_ies = ?";
            PreparedStatement stm = conectar.prepareStatement(sql);

            stm.setInt(1, idIes);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {                
                existe = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Verificação IES Falhou!");
        } finally{
            con.desconexao(conectar);
        }
        
        return existe;
    }
}
