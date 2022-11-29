/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcomp.ufs.br.poo.cinema.Arquivos;


import dcomp.ufs.br.poo.cinema.Pessoass.Cliente;
import dcomp.ufs.br.poo.cinema.Recursos.Filme;
import dcomp.ufs.br.poo.cinema.Recursos.Sessao;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Matheus S M
 */
public class EscrevenoArquivo {
    
    public void arquivoFilme(Filme filme , String caminho){
          try {        
           FileWriter fw = new FileWriter( caminho, true );
           BufferedWriter bw = new BufferedWriter( fw );

           bw.write(Integer.toString(filme.getCodigo()) + " : " + filme.getNome() + " : " + filme.getGenero() 
                   + " : "  + filme.getFaixaEtaria() + " : " + filme.getDuracao() + " : ");
           bw.close();
           fw.close();
         
       } catch (FileNotFoundException ex) {
           System.out.println("Error");
       } catch (IOException ex) {
            System.out.println("Error a abrir: ");
        } 
     }
    
    public void arquivoCliente(Cliente clie , String caminho){
       try {    
           FileWriter fw = new FileWriter( caminho , true );
           BufferedWriter bw = new BufferedWriter( fw );

           bw.write(Integer.toString(clie.getIdentificador())+ " : " + clie.getNome() + " : " + Integer.toString(clie.getIdade())+ " : ");
           bw.close();
           fw.close();
         
       } catch (FileNotFoundException ex) {
           System.out.println("error");
       } catch (IOException ex) {
            System.out.println("Error a abrir: ");
        }
    }
    
    public void arquivoSessao(List<Sessao> ses){
        try {
            FileOutputStream arqui =  new FileOutputStream("Sessoes.txt");
            try (ObjectOutputStream obj = new ObjectOutputStream(arqui)) {
                obj.writeObject(ses);
                obj.flush(); 
            }
        } catch (IOException ex) {
            System.out.println("error1");
        }  
    }
}
