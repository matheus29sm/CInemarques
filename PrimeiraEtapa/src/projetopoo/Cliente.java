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
public class Cliente {
    
    private String nome;
    private int codigo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "________________________"
                + "\nCodigo: " + getCodigo()
                + "\nCliente: " + getNome()
                + "\n________________________";
    }
}
