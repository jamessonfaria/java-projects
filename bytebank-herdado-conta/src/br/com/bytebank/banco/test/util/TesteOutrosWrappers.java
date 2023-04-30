package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(90); // autoboxing
		int valor = idadeRef.intValue(); // unboxing

		Double dRef = Double.valueOf(valor); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number numero = Integer.valueOf(13);
		System.out.println(numero);
		
		List<Number> lista = new ArrayList<>();
		lista.add(100);
		lista.add(32.6);
		lista.add(11.5f);
		
	}

}
