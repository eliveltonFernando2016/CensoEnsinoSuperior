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
public class NecessidadeEspecial {
    public NecessidadeEspecial(Model.NecessidadeEspecial n, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into necessidade_especial (aluno,"
                                        + "  in_cegueira,"
                                        + "  in_baixa_visao,"
                                        + "  in_surdez,"
                                        + "  in_def_auditiva,"
                                        + "  in_def_fisica,"
                                        + "  in_surdocegueira,"
                                        + "  in_def_multipla,"
                                        + "  in_def_mental)"
                                        + "  values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setLong(1, aluno);
            stm.setInt(2, n.getIN_CEGUEIRA());
            stm.setInt(3, n.getIN_BAIXA_VISAO());
            stm.setInt(4, n.getIN_SURDEZ());
            stm.setInt(5, n.getIN_DEF_AUDITIVA());
            stm.setInt(6, n.getIN_DEF_FISICA());
            stm.setInt(7, n.getIN_SURDOCEGUEIRA());
            stm.setInt(8, n.getIN_DEF_MULTIPLA());
            stm.setInt(9, n.getIN_DEF_MENTAL());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Necessidade Especial Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
