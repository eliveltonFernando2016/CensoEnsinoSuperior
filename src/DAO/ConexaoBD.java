/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author elivelton
 */
public class ConexaoBD {
    public Connection conexao(){
        Connection myConn = null;

        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        
        return null;
    }

    public void desconexao(Connection conn){
        try {
            if (conn != null) {
               conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
