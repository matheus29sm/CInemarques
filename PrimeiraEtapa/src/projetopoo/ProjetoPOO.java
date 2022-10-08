/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

/**
 *
 * @author Matheus S M
 */
import java.util.Scanner;

public class ProjetoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Loja lojao = new Loja();
        Produto produto[] = new Produto[1000];
        Cliente[] cliente = new Cliente[1000];  
        Venda [] venda = new Venda[1000];
        Estoque estocado = new Estoque();
        int comando;

        do {
            System.out.println("\nSelecione a opcao\n"
                + "1- Cadastrar Produtos\n"
                + "2- Listar Produtos\n"
                + "3- Listar Produtos Disponiveis no Estoque\n"
                + "4- Listar Produtos Esgotados no Estoque\n"
                + "5- Aumentar Quantidade do Produto\n"
                + "6- Cadastrar Cliente\n"
                + "7- Listar Clientes\n"
                + "8- Cadastrar Vendas\n"
                + "9- Listar Vendas\n"
                + "10-Listar Vendas por cliente\n"
                + "0- Encerrar Programa\n");

            comando = keyboard.nextInt();

            switch (comando) {
                case 1:
                    lojao.cadastrarProduto(produto);
                    break;
                case 2:
                    lojao.todosProdutos(produto);                  
                    break;
                case 3:
                    estocado.listarProdDisponiveis(produto);                  
                    break;
                case 4:
                    estocado.listarProdEsgotados(produto);                  
                    break;
                case 5:
                    estocado.aumentarEstoq(produto);      
                    break;
                case 6:
                    lojao.cadastrarCliente(cliente);                  
                    break;
                case 7:
                    lojao.listarClientes(cliente);
                    break;
                case 8:
                    lojao.cadastraVenda(venda,cliente,produto);
                    break;
                case 9:
                    lojao.listarVendas(venda);
                    break;
                case 10 :
                    lojao.listarVendasCliente(venda, cliente);
                    break;
                case 0:
                    System.out.println("Programa Encerrado");
                    break;
            }

        } while (comando != 0);
    }
    
}
