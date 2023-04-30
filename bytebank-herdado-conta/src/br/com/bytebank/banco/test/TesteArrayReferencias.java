package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1, 111);
		contas[0] = cc1;
		ContaCorrente cc2 = new ContaCorrente(2, 222);
		contas[1] = cc2;
		
		
		System.out.println(contas[0]);
		System.out.println(contas[1]);
		
		ContaPoupanca cp1 = new ContaPoupanca(1312, 444444);
		
		
		Conta[] contasNew = new Conta[5];
		contasNew[0] = cc1;
		contasNew[1] = cp1;
		
		ContaPoupanca ref = (ContaPoupanca) contasNew[1];
		System.out.println(ref);
		
		Cliente cli = new Cliente();
		
		Object[] objetos = new Object[5];
		objetos[0] = cc1;
		objetos[1] = cp1;
		objetos[2] = cli;
		
	}

}
