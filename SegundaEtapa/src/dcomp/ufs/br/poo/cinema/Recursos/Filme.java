package dcomp.ufs.br.poo.cinema.Recursos;


public class Filme{// extends Sessao {

	private int codigo;
	private String nome;
	private String genero;
	private String faixaEtaria;
	private String duracao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	@Override
	public String toString(){
        return "________________________"
                +"\nCodigo: "+ getCodigo() 
                +"\nFilme: "+ getNome()
                +"\nGenero: "+ getGenero()
                +"\nFaixa Etaria: "+ getFaixaEtaria()
                +"\nDuracao: "+ getDuracao()
                + "\n________________________";
    }
	
	
	
	
	
	
	
}
