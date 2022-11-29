/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcomp.ufs.br.poo.cinema.Pessoass;

import dcomp.ufs.br.poo.cinema.Pessoass.Pessoa;

/**
 *
 * @author Matheus S M
 */
public class Gerente extends Pessoa {
    
    private int indentificacao;

    public int getIndentificacao() {
        return indentificacao;
    }

    public void setIndentificacao(int indentificacao) {
        this.indentificacao = indentificacao;
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
    
    /*public void adicionarFilme(Filme [] filme){
		Scanner keyboard = new Scanner (System.in);
		int i = 0;
        String saida = null;
        do{
        	if(filme[i] == null) {
		        filme[i] = new Filme();
		        filme[i].setCodigo(i + 100);
                        System.out.print("Nome do Filme: ");
		        filme[i].setNome(keyboard.nextLine());
                        System.out.print("Genero do Filme: ");
		        filme[i].setClassificacaoIndicativa(keyboard.nextInt());
                        System.out.print("Duracao do Filme: ");
		        filme[i].setDuracao(keyboard.nextLine());
		        		System.out.println("Adiciona outro Filme: Sim ou Nao?");
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

	public void excluirFilme() {
		
	}
	public void adicionarSessao(Sessao [] sessao){
		Scanner keyboard = new Scanner (System.in);
		int i = 0;
        String saida = null;
        do{
        	if(sessao[i] == null) {
		        sessao[i] = new Sessao();
                        System.out.print("Nome do Filme: ");
		        sessao[i].setNomeDaSala("Sala: " + keyboard.nextLine());
                        System.out.print("Dia da Sessao: ");
		        sessao[i].setDia(keyboard.nextInt());
                        System.out.print("Hora da Sessao: ");
		        sessao[i].setHora(keyboard.nextInt());
		        		System.out.print("Minutos da Sessao: ");
		        sessao[i].setMinuto(keyboard.nextInt());
		        		System.out.print("Vagas na Sessao: 2 ");
		        sessao[i].setVagas(keyboard.nextInt());
		        
		        
		        System.out.println("Adiciona outra Sessao: Sim ou Nao?");
		        saida = keyboard.nextLine();
		        i++;
        	}
        	else {
        		i++;
        		saida = "Sim";
        	}      		
        }
        while(saida.equals("Sim") || saida.equals("sim"));
	}*/
	public void excluirSessao() {
		
	}
	public void criarDesconto() {
		
	}
	public void excluirDesconto() {
	}	        
}

