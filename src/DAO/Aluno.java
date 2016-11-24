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
public class Aluno {

    public Aluno(Model.Aluno al, int cor, int nacio) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into aluno (co_aluno,"
                                        + "  in_sexo_aluno, "
                                        + "  cor_raca_aluno,"
                                        + "  nacionalidade_aluno,"
                                        + "  co_pais_origem_aluno,"
                                        + "  nu_ano_aluno_nasc,"
                                        + "  nu_dia_aluno_nasc,"
                                        + "  nu_mes_aluno_nasc,"
                                        + "  nu_idade_aluno)"
                        + " values(?, ?, ?, ?, ?, ?, ? ,? , ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setLong(1, al.getCO_ALUNO());
            stm.setInt(2, al.getIN_SEXO_ALUNO());
            stm.setInt(3, cor);
            stm.setInt(4, nacio);
            stm.setInt(5, al.getCO_PAIS_ORIGEM_ALUNO());
            stm.setInt(6, al.getNU_ANO_ALUNO_NASC());
            stm.setInt(7, al.getNU_DIA_ALUNO_NASC());
            stm.setInt(8, al.getNU_MES_ALUNO_NASC());
            stm.setInt(9, al.getNU_IDADE_ALUNO());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Aluno Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
