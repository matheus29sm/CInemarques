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
public class Loja {
    public void cadastrarProduto(Produto [] pa) {   
	Scanner keyboard = new Scanner (System.in);
	int i = 0;
        String saida = null;
        do{
        	if(pa[i] == null) {
		        pa[i] = new Produto();
		        pa[i].setCodigo(i + 100);
                        System.out.print("Nome do Produto: ");
		        pa[i].setNome(keyboard.nextLine());
                        System.out.print("Preco: ");
		        pa[i].setPreco(Double.parseDouble(keyboard.nextLine()));
                        System.out.print("Quantidaade: ");
		        pa[i].setQuantidade(Integer.parseInt(keyboard.nextLine()));
		        
		        System.out.println("Adiciona outro produto Sim ou Nao?");
		        saida = keyboard.nextLine();
		        i++;
        	}
        	else {
        		i++;
        		saida = "Sim";
        	}      		
        }
        while(saida.equals("Sim") || saida.equals("sim"));
	}
		  
    public void todosProdutos(Produto[] prod) {
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] != null) {
                System.out.println(prod[i].toString());
            }
        }
    }

    public void cadastrarCliente(Cliente[] clie) {

        Scanner ent = new Scanner(System.in);
        int i = 0;
        String saida = null;
        do {
            if (clie[i] == null) {
                clie[i] = new Cliente();
                System.out.print("Cliente: ");
                clie[i].setNome(ent.nextLine());
                clie[i].setCodigo(i + 1000);
                i++;
                System.out.println("Adiciona outro cliente Sim ou Nao");
                saida = ent.nextLine();
            } else {
                i++;
                saida = "Sim";
            }
        } while (saida.equals("Sim") || saida.equals("sim"));
    }

    public void listarClientes(Cliente[] clie) {
        for (int i = 0; i < clie.length; i++) {
            if (clie[i] != null) {
                System.out.println(clie[i].toString());
            }
        }
    }

    public void listarVendas(Venda[] venda) {

        for (int i = 0; i < venda.length; i++) {
            if (venda[i] != null) {
                System.out.print(venda[i].toString());
                Item[] itens = venda[i].getItem();
                for (int j = 0; j < itens.length; j++) {
                    if (itens[j] != null) {
                        System.out.print(itens[j].toString());
                    }
                }
                System.out.println("\n");
            }    
        }
    }
    
    public void cadastraVenda(Venda [] venda , Cliente [] clie , Produto [] prod){
        Scanner ent = new Scanner(System.in);
        Data data = new Data();
        int i = 0;
        String saida = null;
        do {
            if (venda[i] == null) {
                String nome_cliente = procuraCliente(clie); 
                venda[i] = new Venda();                       
                venda[i].getCliente().setNome(nome_cliente);
                venda[i].setCodigoVenda(i + 100);
                venda[i].setData(data.gerarData());
                venda[i].setItem(venda[i].listaDeCompras(prod));               
                i++;
                System.out.println("Adiciona outra venda Sim ou Nao?");
                saida = ent.nextLine();
            } else {
                i++;
                saida = "Sim";
            }
        } 
        while (saida.equals("Sim") || saida.equals("sim"));
        
    }

    public void listarVendasCliente(Venda[] venda , Cliente [] clie ) {
        String nome_cliente = procuraCliente(clie);
        for (int i = 0;i< venda.length; i++) {
            if (venda[i] != null && nome_cliente.equals(venda[i].getCliente().getNome())) {
                System.out.println(venda[i].toString());
                Item[] itens = venda[i].getItem();
                for (int j = 0; j < itens.length; j++) {
                    if (itens[j] != null) {
                        System.out.println(itens[j].toString());

                    }  
                }
            }
        }

    }
    
    
    private String procuraCliente(Cliente [] cliente){
        Scanner entrada = new Scanner(System.in);
        listarClientes(cliente);
        System.out.println("Qual o codigo do cliente que fez a compra");
        int cod = entrada.nextInt();       
        for(int i = 0 ; i < cliente.length ; i++){
            if(cliente[i].getCodigo() == cod){
                return cliente[i].getNome();
            }
        }
        return "";
    }
}
