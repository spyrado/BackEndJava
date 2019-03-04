package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestandoCollections {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);
        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);
        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);
        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2); 
        lista.add(cc3);
        lista.add(cc4);
		
//        NumeroDaContaComparator5 comparator = new NumeroDaContaComparator5();
        
        lista.forEach(conta -> System.out.println(conta.getSaldo()));
        
//        lista.sort(new NumeroDaContaComparator());
        
        Collections.sort(lista);
        Collections.rotate(lista, 5);
        
        System.out.println("äsdasdasdas");
        
        lista.forEach(conta -> System.out.println(conta.getSaldo()));
		
	}

}

class NumeroDaContaComparator5 implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();
		
//		if(c1.getNumero() < c2.getNumero())
//			return -1;
//		if(c1.getNumero() > c2.getNumero())
//			return 1;
//		
//		return 0;
	}
	
}
