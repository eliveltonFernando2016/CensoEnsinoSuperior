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
public class Matricula {

    public Matricula(Model.Matricula m, long aluno, int ies, int curso, int alunoSit) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into curso (in_matricula,"
                                        + "  in_concluinte,"
                                        + "  in_ingresso,"
                                        + "  dt_ingresso_curso,"
                                        + "  ano_ingresso,"
                                        + "  aluno,"
                                        + "  ies,"
                                        + "  curso,"
                                        + "  aluno_situacao)"
                                        + "  values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setInt(1, m.getIN_MATRICULA());
            stm.setInt(2, m.getIN_CONCLUINTE());
            stm.setInt(3, m.getIN_INGRESSO());
            stm.setString(4, m.getDT_INGRESSO_CURSO());
            stm.setInt(5, m.getANO_INGRESSO());
            stm.setLong(6, aluno);
            stm.setInt(7, ies);
            stm.setInt(8, curso);
            stm.setInt(9, alunoSit);

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Curso Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
