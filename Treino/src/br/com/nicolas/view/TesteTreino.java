package br.com.nicolas.view;

import br.com.nicolas.models.Funcionario;

public class TesteTreino {

	public static void main(String[] args) {
		
		Funcionario nicolas = new Funcionario();
		
		// Dados como Pessoa
		nicolas.setNome("Nicolas");
		nicolas.setIdade(24);
		nicolas.setAltura(1.70);
		nicolas.setGenero("Masculino");
		
		// Dados como Funcionario
		nicolas.setCargo("Desenvolvedor");
		nicolas.setSalario(5000);
		nicolas.setCarteiraDeTrabalho("222.22222.22-3");
		
		//Obrigacoes do Funcionario
		nicolas.baterPonto(555);
		
		System.out.println(nicolas);
		
	}
}