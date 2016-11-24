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
public class Atividade {

    public Atividade(Model.Atividade a, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into atividade (co_aluno,"
                                        + "  in_ativ_pesquisa_rem, "
                                        + "  in_ativ_pesquisa_nao_rem,"
                                        + "  in_ativ_extensao_rem,"
                                        + "  in_ativ_extensao_nao_rem,"
                                        + "  in_ativ_monitoria_rem,"
                                        + "  in_ativ_monitoria_nao_rem,"
                                        + "  in_ativ_estag_n_obrig_rem,"
                                        + "  in_ativ_estag_n_obrig_nao_rem)"
                                        + "  values(?, ?, ?, ?, ?, ?, ? ,?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);

            stm.setLong(1, aluno);
            stm.setInt(2, a.getIN_ATIV_PESQUISA_REM());
            stm.setInt(3, a.getIN_ATIV_PESQUISA_NAO_REM());
            stm.setInt(4, a.getIN_ATIV_EXTENSAO_REM());
            stm.setInt(5, a.getIN_ATIV_MONITORIA_NAO_REM());
            stm.setInt(6, a.getIN_ATIV_MONITORIA_REM());
            stm.setInt(7, a.getIN_ATIV_MONITORIA_NAO_REM());
            stm.setInt(8, a.getIN_ATIV_ESTAG_N_OBRIG_REM());
            stm.setInt(9, a.getIN_ATIV_ESTAG_N_OBRIG_NAO_REM());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Atividade Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
    
}
