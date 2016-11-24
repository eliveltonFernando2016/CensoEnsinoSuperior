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
public class Curso {

    public Curso(Model.Curso c, int grau) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into curso (co_curso, no_curso, co_nivel_academico, co_modalidade_ensino, grau_academico) values(?, ?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setInt(1, c.getCO_CURSO());
            stm.setString(2, c.getNO_CURSO());
            stm.setInt(3, c.getCO_NIVEL_ACADEMICO());
            stm.setInt(4, c.getCO_MODALIDADE_ENSINO());
            stm.setInt(5, grau);

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Curso Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
