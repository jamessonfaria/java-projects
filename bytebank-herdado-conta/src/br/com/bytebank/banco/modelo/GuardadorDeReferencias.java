package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadedeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
	
}
