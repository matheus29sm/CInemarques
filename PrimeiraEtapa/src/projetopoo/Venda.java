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
public class Venda {
    private int codigoVenda; 
    private Cliente cliente;	
    private String data;
    private Item [] item;
        
        public Venda(){
            this.cliente = new Cliente();
            this.item = new Item[100];
        }
	
	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigo) {
		this.codigoVenda = codigo;
	}
        
        public String getData() {
            return this.data;
        }
        
        public void setData(String data){
            this.data = data;
        }

	public Cliente getCliente() {
            return this.cliente;
	}
        
        public Item [] getItem() {
            return item;
        }
        
        public void setItem(Item [] item) {
            this.item = item;
        }
 
	
	public Item[] listaDeCompras(Produto [] prod) {
            Scanner entrada = new Scanner(System.in);
            Item [] item = new Item[100];
            Estoque situacao = new Estoque();
            String saida = null;
            int k = 0;
            do{
                System.out.print("Informe a quantidade comprada: ");
                int itemcp = Integer.parseInt(entrada.nextLine());
                Produto item_comprado = procuraProduto(prod);
                boolean  possivel = situacao.retirarEstoq(itemcp, item_comprado);
                if(possivel){
                    item[k] = new Item();
                    item[k].setQuantidadeComprada(itemcp);              
                    item[k].setCodigo(item_comprado.getCodigo());
                    item[k].setNome(item_comprado.getNome());
                    item[k].setPreco(item_comprado.getPreco());
                    item[k].setPrecototal(itemcp * item[k].getPreco());
                }
                
                if(k < item.length ){
                    System.out.println("Adiciona outro item Sim ou Nao?");
                    saida = entrada.nextLine();
                }
                k++;
            }
            while(saida.equals("sim") || saida.equals("Sim")); 
            return item;
	}
        
        @Override
        public String toString(){         
            return  "________________________"
                    +"\nCodigo: "+ getCodigoVenda() 
                    +"\nCliente: "+ getCliente().getNome()
                    +"\nData: " + getData()
                    + "\n________________________";
                    
        }
        
        private Produto procuraProduto(Produto [] prod){
            Scanner entrada = new Scanner(System.in);
            Produto comprado =  null; 
            for(int j = 0 ; j < prod.length ; j++){
                    if(prod[j] != null){
                        System.out.print("\n"+prod[j].getNome() + " codigo " +prod[j].getCodigo()+"\n");
                    }
            }
            
            System.out.println("\nQual o codigo do  produto ? ");
            int produto = entrada.nextInt();
            for(int p = 0 ; p < prod.length; p++ ){
                if (prod[p] != null && prod[p].getCodigo() == produto){
                    comprado = prod[p];
                }
            }
            return comprado;
        }
}
