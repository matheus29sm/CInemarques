/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.text.DecimalFormat;

/**
 *
 * @author Matheus S M
 */
public class Produto {
    private int codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
        @Override
	public String toString(){
            DecimalFormat nova = new DecimalFormat("0.00"); 
            return "________________________"
                    +"\nCodigo: "+ getCodigo() 
                    +"\nProduto: "+ getNome()
                    +"\nPreco: "+ nova.format(getPreco())
                    +"\nQuantidade "+ getQuantidade()
                    + "\n________________________";
        }
}
