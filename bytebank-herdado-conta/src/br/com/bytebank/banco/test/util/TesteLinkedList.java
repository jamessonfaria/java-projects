package br.com.bytebank.banco.test.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		List<Conta> lista = new LinkedList<>();
		
		Conta cc = new ContaCorrente(1,111);
		Conta cc2 = new ContaCorrente(2,222);
		
		lista.add(cc);
		lista.add(cc2);

		System.out.println("tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("tamanho: " + lista.size());

	
		Conta cc3 = new ContaCorrente(3,333);
		Conta cc4 = new ContaCorrente(4,444);
		
		lista.add(cc3);
		lista.add(cc4);
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------------");
		
		for (Conta item : lista) {
			System.out.println(item);
		}
		
	}
	
}
