package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int idade = 90; // Integer
		Integer idadeRef = Integer.valueOf(idade);
		int valor = idadeRef.intValue();
		System.out.println(valor);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		List numeros = new ArrayList();
		numeros.add(idadeRef);
		numeros.add(idade); // Autoboxing
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(numeros.size());
				
		String s = args[0];	//"10"
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		
		
	}
	
}
