package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteBiblioteca {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(1, 111);
		cc.deposita(100.0);
		cc.saca(20.0);
		System.out.println(cc.getSaldo());
	}
}
