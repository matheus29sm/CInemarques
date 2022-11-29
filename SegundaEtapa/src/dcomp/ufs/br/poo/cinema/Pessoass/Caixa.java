/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcomp.ufs.br.poo.cinema.Pessoass;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matheus S M
 */
public class Caixa extends Pessoa {
    
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Cliente> cadastrarCliente( List<Cliente> cliente) {

        Scanner ent = new Scanner(System.in);
        
        Cliente clie =new Cliente();
        
        System.out.print("Nome do Cliente ");
        clie.setNome(ent.nextLine());
        System.out.print("Idade do Cliente ");
        clie.setIdade(ent.nextInt());
        cliente.add(clie);
        return cliente;
             
        
    }

	public void venderIngresso() {
		
	}
	public void checarIdentidade() {
		
	}
	public void imprimirCupom() {
		
	}
	   
}

