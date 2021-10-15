package br.unitins.ds.a1;

public class Player {
	private String nome;
	private int pontuacao;
	private boolean parou;
	
	Player(String nome){
		this.setNome(nome);
	}
	Player(){
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	
	
	public boolean isParou() {
		return parou;
	}

	public void setParou(boolean parou) {
		this.parou = parou;
	}

	@Override
	public String toString() {
		return this.getNome() + " " +this.getPontuacao();
	}
}
