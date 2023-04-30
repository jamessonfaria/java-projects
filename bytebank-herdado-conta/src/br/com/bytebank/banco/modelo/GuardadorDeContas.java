package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Conta cc) {
		this.referencias[this.posicaoLivre] = cc;
		this.posicaoLivre++;
	}

	public int getQuantidadedeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int i) {
		return this.referencias[i];
	}
	
}
