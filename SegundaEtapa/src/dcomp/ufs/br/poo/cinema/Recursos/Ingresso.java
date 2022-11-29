package dcomp.ufs.br.poo.cinema.Recursos;


 public class Ingresso {

    private int quantidadeComprada;
    private double precototal;
    
    Sessao sessao = new Sessao();
    Filme filme = new Filme();
    
    public int getQuantidadeComprada() {
         return quantidadeComprada;
     }

    public void setQuantidadeComprada(int quantidadeComprada) {
         this.quantidadeComprada = quantidadeComprada;
     }

    public double getPrecoTotal(){
        return this.precototal;
    }
    
    public void setPrecototal(double precototal) {
    	this.precototal = precototal;
    }
        
        
}

