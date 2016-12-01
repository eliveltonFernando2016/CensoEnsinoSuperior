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
public class Consulta {

    public Consulta() {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();
        Model.Aluno aluno = null;
        
        try {
            String sql = "SELECT * FROM aluno";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {                
                aluno = new Model.Aluno(rs.getLong("co_aluno"), rs.getInt("in_sexo_aluno"), rs.getInt("co_pais_origem_aluno"), rs.getInt("nu_ano_aluno_nasc"), rs.getInt("nu_dia_aluno_nasc"), rs.getInt("nu_mes_aluno_nasc"), rs.getInt("nu_idade_aluno"));
                System.out.println(aluno.getCO_ALUNO()+", "+aluno.getIN_SEXO_ALUNO()+", "+aluno.getCO_PAIS_ORIGEM_ALUNO()+", "+aluno.getNU_DIA_ALUNO_NASC()+"/"+aluno.getNU_MES_ALUNO_NASC()+"/"+aluno.getNU_ANO_ALUNO_NASC()+", "+aluno.getNU_IDADE_ALUNO());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.desconexao(conectar);
            System.out.println("Consulta de Alunos Falhou!");
        }
    }
    
}
