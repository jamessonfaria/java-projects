package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(true);
		
		println();
		println(10);
		println(false);
		
		ContaCorrente cc = new ContaCorrente(11, 111);
		ContaPoupanca cp = new ContaPoupanca(22, 22);
		Cliente c = new Cliente();
		
		println(cc);
		println(cp);
		println(c);
		
		System.out.println(cc);
		System.out.println(cp);
	}
	
	static void println(Object o) {
	}

	static void println() {
	}

	static void println(int a) {
	}
	
	static void println(boolean valor) {
	}
	
}
