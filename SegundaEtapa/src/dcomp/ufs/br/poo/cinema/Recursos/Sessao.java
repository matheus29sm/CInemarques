/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcomp.ufs.br.poo.cinema.Recursos;

import java.io.Serializable;

/**
 *
 * @author Matheus S M
 */
public class Sessao implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private int numeroDaSala;
	private String dia;
	private int hora;
	private int minuto;
	private int capacidade;
	
	public double preco = 29;

	public int getNumeroDaSala() {
		return numeroDaSala;
	}

	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
        
	public boolean haCapacidade(int comprou, Sessao sessao) {
        boolean possibilidade;
        if (comprou <= sessao.getCapacidade()) {
            sessao.setCapacidade(sessao.getCapacidade() - comprou);
            possibilidade = true;
        } else {
            System.out.println("\nSessao Indisponivel");
            possibilidade = false;
        }
        return possibilidade;
        }
}
