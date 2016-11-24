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
public class Reserva {

    public Reserva(Model.Reserva r, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into reserva (aluno,"
                                            + "   in_reserva_vagas,"
                                            + "   in_reserva_ensino_publico,"
                                            + "   in_reserva_etnico,"
                                            + "   in_reserva_deficiencia,"
                                            + "   in_reserva_renda_familiar,"
                                            + "   in_reserva_outros)"
                                            + "   values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);
            
            stm.setLong(1, aluno);
            stm.setInt(2, r.getIN_RESERVA_VAGAS());
            stm.setInt(3, r.getIN_RESERVA_ENSINO_PUBLICO());
            stm.setInt(4, r.getIN_RESERVA_ETNICO());
            stm.setInt(5, r.getIN_RESERVA_DEFICIENCIA());
            stm.setInt(6, r.getIN_RESERVA_RENDA_FAMILIAR());
            stm.setInt(7, r.getIN_RESERVA_OUTROS());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Reserva Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
}
