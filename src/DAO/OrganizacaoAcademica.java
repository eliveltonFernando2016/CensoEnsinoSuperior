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
public class OrganizacaoAcademica {

    public OrganizacaoAcademica(Model.OrganizacaoAcademica org) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into organizacao_academica (co_organizacao_academica, no_organizacao_academica) values(?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setInt(1, org.getCO_ORGANIZACAO_ACADEMICA());
            stm.setString(2, org.getNO_ORGANIZACAO_ACADEMICA());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Organização Acadêmica Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
