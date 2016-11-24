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
public class Ingresso {

    public Ingresso(Model.Ingresso ing, long aluno) {
        ConexaoBD con = new ConexaoBD();
        Connection conectar = con.conexao();

        try {
            String sql = "insert into ingresso (co_aluno,"
                                        + "  in_ing_vestibular, "
                                        + "  in_ing_enem,"
                                        + "  in_ing_convenio_pecg)"
                                        + "  values(?, ?, ?, ?)";
            PreparedStatement stm = conectar.prepareStatement(sql);

            stm.setLong(1, aluno);
            stm.setInt(2, ing.getIN_ING_VESTIBULAR());
            stm.setInt(3, ing.getIN_ING_ENEM());
            stm.setInt(4, ing.getIN_ING_CONVENIO_PECG());

            stm.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inserção Ingresso Falhou!");
        } finally{
            con.desconexao(conectar);
        }
    }
    
}
