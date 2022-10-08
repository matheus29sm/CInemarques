/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Scanner;

/**
 *
 * @author Matheus S M
 */
public class Estoque {
    public void aumentarEstoq(Produto [] prod) {
		Scanner ent = new Scanner(System.in);               
                for(int j = 0 ; j < prod.length ; j++){
                    if(prod[j] != null){
                        System.out.println(prod[j].getNome() + " codigo " +prod[j].getCodigo());
                    }
                }
                System.out.println("\nQual o codigo do  produto desejar aumentar? ");
		int produto = ent.nextInt();
		for (int i = 0; i < prod.length; i++){
			if (prod[i] != null && prod[i].getCodigo() == produto){
                            System.out.print("Quantidade aumentada? ");
                            int aumentar = ent.nextInt();
			    prod[i].setQuantidade(prod[i].getQuantidade() + aumentar); 
				}
			}
		}
        
	public boolean retirarEstoq(int comprou, Produto prod) {
            boolean possibilidade;
            if (comprou <= prod.getQuantidade()) {
                prod.setQuantidade(prod.getQuantidade() - comprou);
                possibilidade = true;
            } else {
                System.out.println("\nProduto Indisponivel");
                possibilidade = false;
            }
            return possibilidade;
	}
        
	public void listarProdDisponiveis(Produto [] prod) {
		for (int i = 0; i < prod.length; i++) {
			if (prod[i] != null && 0 < prod[i].getQuantidade()) {
                            System.out.println(prod[i].toString());
                    }
		}
		
	}
        
	public void listarProdEsgotados(Produto [] prod) {
		for (int i = 0; i < prod.length; i++) {
			if (prod[i] != null && 0 == prod[i].getQuantidade()) {
                            System.out.println(prod[i].toString());
			}
		}
		System.out.println("");
	}
}
