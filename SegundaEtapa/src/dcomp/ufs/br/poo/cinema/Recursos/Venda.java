package dcomp.ufs.br.poo.cinema.Recursos;

import dcomp.ufs.br.poo.cinema.Pessoass.Cliente;

public class Venda{
    
    private int codigoVenda;
    private Cliente cliente;
    private String data;
    private Ingresso ingresso;

    public Venda() {
        this.cliente = new Cliente();
        this.ingresso = new Ingresso();
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

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setItem(Ingresso item) {
        this.ingresso = item;
    }

    /*public Ingresso listaDeCompras(Filme filme) {

        Ingresso ingresso = new Ingresso();
        Sessao capacidade = new Sessao();
        String saida = null;
        int k = 0;
        do {
            System.out.print("Informe a quantidade comprada: ");
            int itemcp = Integer.parseInt(entrada.nextLine());
            Sessao item_comprado = procuraProduto(sessao);
            boolean possivel = capacidade.haCapacidade(itemcp, item_comprado);
            if (possivel) {
                ingresso = new Ingresso();
                ingresso.setQuantidadeComprada(itemcp);
                ingresso.setNome(item_comprado.getNumeroDaSala());
                ingresso.setPreco(item_comprado.getPreco());
                ingresso.setPrecototal(itemcp * ingresso.getPreco());
            }

        } while (saida.equals("sim") || saida.equals("Sim"));
        return ingresso;
    }

    private Sessao procuraProduto(Sessao[] sessao) {

        Sessao comprado = null;
        for (int j = 0; j < sessao.length; j++) {
            if (sessao[j] != null) {
                System.out.print("\n Sala " + sessao[j].getNumeroDaSala() + " Dia " + sessao[j].getDia() + "Horas: "
                        + sessao[j].getHora() + "Minutos: " + sessao[j].getMinuto());
            }
        }

        System.out.println("\nQual o Dia da Sessao? ");
        sessao
        for (int p = 0; p < sessao.length; p++) {
            if (sessao[p] != null && sessao[p].getDia() == sessao) {
                comprado = sessao[p];
            }
        }
        return comprado;
    }*/

}