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
public class Item extends Produto {

    private int quantidadeComprada;
    private double precototal;

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoTotal() {
        return this.precototal;
    }

    public void setPrecototal(double precototal) {
        this.precototal = precototal;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("0.00");
        return "\n________________________"
                + "\nProduto: " + getNome()
                + "\nPreco " + decimal.format(getPreco())
                + "\nComprou Quantidade: " + getQuantidadeComprada()
                + "\nPreco Total: " + decimal.format(getPrecoTotal())
                + "\n________________________";
    }

}
