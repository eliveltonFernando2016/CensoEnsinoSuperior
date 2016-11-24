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
public class Financeiro {

    public Financeiro(Model.Financeiro f, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into financeiro (aluno,"
                                            + "   in_financ_estudantil,"
                                            + "   in_financ_externas,"
                                            + "   in_financ_externas_reemb,"
                                            + "   in_financ_ies,"
                                            + "   in_financ_ies_reemb,"
                                            + "   in_financ_municipal,"
                                            + "   in_financ_municipal_reemb,"
                                            + "   in_financ_estadual,"
                                            + "   in_financ_estadual_reemb,"
                                            + "   in_prouni_integral,"
                                            + "   in_prouni_parcial,"
                                            + "   in_fies)"
                                            + "   values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setLong(1, aluno);
            stm.setInt(2, f.getIN_FINANC_ESTADUAL());
            stm.setInt(3, f.getIN_FINANC_EXTERNAS());
            stm.setInt(4, f.getIN_FINANC_EXTERNAS_REEMB());
            stm.setInt(5, f.getIN_FINANC_IES());
            stm.setInt(6, f.getIN_FINANC_IES_REEMB());
            stm.setInt(7, f.getIN_FINANC_MUNICIPAL());
            stm.setInt(8, f.getIN_FINANC_MUNICIPAL_REEMB());
            stm.setInt(9, f.getIN_FINANC_ESTADUAL());
            stm.setInt(10, f.getIN_FINANC_ESTADUAL_REEMB());
            stm.setInt(11, f.getIN_PROUNI_INTEGRAL());
            stm.setInt(12, f.getIN_PROUNI_PARCIAL());
            stm.setInt(13, f.getIN_FIES());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Financeiro Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
