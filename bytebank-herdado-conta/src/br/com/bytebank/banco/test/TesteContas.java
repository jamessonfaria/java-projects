package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(1, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(2, 222);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		System.out.println(Conta.getTotal());

	}

}
