package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class VerificaSeExisteNaLista {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(123, 123);
		ContaPoupanca cp1 = new ContaPoupanca(2141, 76543);
		ContaCorrente cc2 = new ContaCorrente(51243, 123123);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cp1);
		
		ContaCorrente cc3 = new ContaCorrente(123, 123);
		
		boolean existe = lista.contains(cc3);
		
		
		System.out.println("Já existe? "+ existe);
		
		
	}

}
