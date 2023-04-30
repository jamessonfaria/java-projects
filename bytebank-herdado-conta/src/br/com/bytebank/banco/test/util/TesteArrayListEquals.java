package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(1,111);
		Conta cc2 = new ContaCorrente(2,222);
		
		lista.add(cc);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(2,222);

		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
		
		for (Conta item : lista) {
			System.out.println(item);
		}
		
	}
	
}
