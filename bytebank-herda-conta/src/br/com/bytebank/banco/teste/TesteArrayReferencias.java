package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("333.333.222.99");
		
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		guardadorDeContas.adiciona(new ContaCorrente(123123, 12323));
		guardadorDeContas.adiciona(cliente);
		ContaCorrente cc = (ContaCorrente)guardadorDeContas.getConta(1);
		
		System.out.println(cc.getNumero());
		
	}

}