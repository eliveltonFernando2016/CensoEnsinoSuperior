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
public class Curso {

    public Curso(Model.Curso c, int grau) {
        if(!CursoExistente(c.getCO_CURSO())){
            ConexaoBD con = new ConexaoBD();
            Connection conectar = con.conexao();

            try {
                String sql = "insert into curso (co_curso, no_curso, co_nivel_academico, co_modalidade_ensino, grau_academico) values(?, ?, ?, ?, ?)";
                PreparedStatement stm = conectar.prepareStatement(sql);

                stm.setInt(1, c.getCO_CURSO());
                stm.setString(2, c.getNO_CURSO());
                stm.setInt(3, c.getCO_NIVEL_ACADEMICO());
                stm.setInt(4, c.getCO_MODALIDADE_ENSINO());
                if(grau == -1){
                    stm.setInt(5, 5);
                }
                else{
                    stm.setInt(5, grau);
                }

                stm.execute();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Inserção Curso Falhou!");
            } finally{
                con.desconexao(conectar);
            }
        }
    }
    
    public boolean CursoExistente(int idCurso){
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();
        
        boolean existe = false;
        
        try {
            String sql = "select co_curso from curso WHERE co_curso = ?";
            PreparedStatement stm = conectar.prepareStatement(sql);

            stm.setInt(1, idCurso);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {                
                existe = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Verificação Curso Falhou!");
        } finally{
            con.desconexao(conectar);
        }
        
        return existe;
    }
}
