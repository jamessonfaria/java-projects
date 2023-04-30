package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(1,111);
		Conta cc2 = new ContaCorrente(2,222);
		Cliente cli = new Cliente();
		
		guardador.adicionar(cc);
		guardador.adicionar(cc2);
		guardador.adicionar(cli);		
		
		int tamanho = guardador.getQuantidadedeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
