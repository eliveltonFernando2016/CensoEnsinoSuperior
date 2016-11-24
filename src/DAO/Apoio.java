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
public class Apoio {

    public Apoio(Model.Apoio a, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into apoio (co_aluno,"
                                        + "  in_apoio_social, "
                                        + "  in_apoio_alimentacao,"
                                        + "  in_apoio_moradia,"
                                        + "  in_apoio_transporte,"
                                        + "  in_apoio_material_didatico,"
                                        + "  in_apoio_bolsa_permanencia,"
                                        + "  in_apoio_bolsa_trabalho)"
                                        + "  values(?, ?, ?, ?, ?, ?, ? ,?)";
            PreparedStatement stm = conectar.prepareStatement(sql);

            stm.setLong(1, aluno);
            stm.setInt(2, a.getIN_APOIO_SOCIAL());
            stm.setInt(3, a.getIN_APOIO_ALIMENTACAO());
            stm.setInt(4, a.getIN_APOIO_MORADIA());
            stm.setInt(5, a.getIN_APOIO_TRANSPORTE());
            stm.setInt(6, a.getIN_APOIO_MATERIAL_DIDATICO());
            stm.setInt(7, a.getIN_APOIO_BOLSA_PERMANENCIA());
            stm.setInt(8, a.getIN_APOIO_BOLSA_TRABALHO());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Apoio Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
