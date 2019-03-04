package br.com.nicolas.utils;

import br.com.nicolas.exceptions.SenhaInvalidaException;

public class AutenticaUtil {
	
	private int senha = 555;
	
	public void senha(int senha){
		
		if(!senhaCorreta(senha)) 
			throw new SenhaInvalidaException("Senha inválida");
		
		System.out.println("Autenticado com sucesso");
	}
	
	private boolean senhaCorreta(int senha) {
		return (this.senha == senha) ? true : false;
	}
}