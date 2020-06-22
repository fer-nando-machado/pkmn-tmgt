package pkmn;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Arquivo {
    
    public static void escreverLinha(String caminho, String conteudo, boolean acrescimo) throws IOException{
        PrintWriter writer = new PrintWriter(new FileWriter(new File(caminho),acrescimo));
        writer.println(conteudo);
        writer.close();    
    }
    
    public static String lerLinha(String caminho) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(new File(caminho)));
        String conteudo = reader.readLine();
        reader.close();
        return(conteudo);
    }  
    
    public static void limparArquivo(String caminho){
        File file = new File(caminho);
        file.delete();
    }
    
    public static boolean verificarArquivo(String caminho){
        File file = new File(caminho);
        return(file.exists());
    }
    
    
    
}
