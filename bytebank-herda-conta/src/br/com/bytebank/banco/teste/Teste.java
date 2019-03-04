package br.com.bytebank.banco.teste;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
//		ArrayList<Integer> numeros = new ArrayList<Integer>();
//		
//		numeros.add(23);
//		numeros.add(67);
//		numeros.add(54);
//		numeros.add(42);
//		numeros.add(12);
//		
//		numeros.forEach(numero -> System.out.println(numero));
		
//		double num = Integer.valueOf("22").doubleValue();
//		
//		
//		System.out.println(num);
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
		
		Integer iRef = Integer.valueOf(29); // autoboxing
		System.out.println(iRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(29.5); // autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.FALSE; // autoboxing
		System.out.println(bRef.booleanValue()); // unboxing
		
		ArrayList<Number> listaDeNumeros = new ArrayList<Number>();
		
		listaDeNumeros.add(33);
		listaDeNumeros.add(34.5);
		listaDeNumeros.add(33);
		
	}

}