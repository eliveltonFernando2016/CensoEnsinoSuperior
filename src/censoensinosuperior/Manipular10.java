/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censoensinosuperior;

import Model.Tupla10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elivelton
 */
public class Manipular10 extends Thread{
    Thread th;
    private SeparaClasse separa = null;
    public static Tupla10 tupla = null;

    @Override
    public void run(){
        String linha;                                                           // Cria variável para armazenar a linha do arquivo a ser lido
        String operacoes;

        try {
            FileReader reader = new FileReader("/home/elivelton/Documentos/Microdados Censo Ensino Superior Inep/2010/DADOS/DM_ALUNO.csv");
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                operacoes = linha.replace("||", "| ").replace(",,", "\0");
                st = new StringTokenizer(operacoes, "|");

                tupla = new Tupla10(
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim(),
                    st.nextToken().trim()
                );
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start() {
	if (th == null) {
            th = new Thread (this);
            th.start ();
        }
    }
}