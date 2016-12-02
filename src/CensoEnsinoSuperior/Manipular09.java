package CensoEnsinoSuperior;

import Model.Tupla;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manipular09{

    public void Run(){
        String linha;                                                           // Cria variável para armazenar a linha do arquivo a ser lido
        Tupla tupla = null;

        try {
            FileReader reader = new FileReader("/home/elivelton/Documentos/Microdados Censo Ensino Superior Inep/2009/DADOS/DM_ALUNO.csv");
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                st = new StringTokenizer(linha, "|");                           // Define token de separação.
                tupla = new Tupla(
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
                //new SeparaClasse(tupla);
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular09.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}