/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CensoEnsinoSuperior;

import Model.Tupla10;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elivelton
 */
public class Manipular10 {

    private SeparaClasse separa = new SeparaClasse();
    public static Tupla10 tupla = null;

    public void run() {
        FileReader reader;
        String linha = null;
        int i=0;

        try {
            reader = new FileReader("/home/elivelton/Documentos/Microdados Censo Ensino Superior Inep/2010/DADOS/DM_ALUNO.csv");
            BufferedReader leitor = new BufferedReader(reader);

            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.replace(",,", "").replace(",", "").split("\\|");

                tupla = new Tupla10(
                    campos[i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[++i],
                    campos[i]
                );

                separa.run();

                i=0;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipular10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manipular10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
