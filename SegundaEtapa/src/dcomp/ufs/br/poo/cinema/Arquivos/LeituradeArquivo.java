package dcomp.ufs.br.poo.cinema.Arquivos;

import dcomp.ufs.br.poo.cinema.Recursos.Sessao;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class LeituradeArquivo {
     public String[] lerArquivoChar(String caminho) {
        String[] palavra = null;
        try {
            FileInputStream arq =  new FileInputStream(caminho);
            InputStreamReader inp = new InputStreamReader(arq);
            BufferedReader  seila = new BufferedReader(inp);
            
            String linha ;
            do{
                linha = seila.readLine();
                if(linha != null){
                    palavra = linha.split(":");  
                }
            }
            while(linha != null);
        }
        catch(IOException e){
            System.out.println("error");
        }
        return palavra;       
    }
     
    public int tamanhoarquivo(String caminho) {
         String[] palavra = null;
        try {
        FileReader ler = new FileReader(caminho);
        BufferedReader br = new BufferedReader( ler ); 
            while(br.ready()){
                String linha = br.readLine();
                palavra = linha.split(":");
            }
            br.close();
            ler.close();
        } catch (IOException ex) {
            System.out.println("Arquivo vazio ou invalido");
        }
        return palavra.length;
    } 
    
    public List<Sessao> lerArquivoSessao (String caminho){
        List<Sessao> sessao = new ArrayList();
        try {
            FileInputStream arqui =  new FileInputStream(caminho);
            try (ObjectInputStream obj = new ObjectInputStream(arqui)) {
                    sessao =  (List<Sessao>) obj.readObject();         
                    obj.close();
            }
            
        } catch (IOException ex) {
            System.out.println("error2");
        } catch (ClassNotFoundException ex) {
            System.out.println("bo");
        } 
        return sessao;
             
    }
}
