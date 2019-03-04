package br.com.bytebank.banco.teste;

public class GuardadorDeContas {
	
	private Object[] referencia;
	private int numeroDeObjetos;
	
	public GuardadorDeContas() {
		this.referencia = new Object[10];
		this.numeroDeObjetos = 0;
	}

	public void adiciona(Object objeto) {
		referencia[numeroDeObjetos] = objeto;
		this.numeroDeObjetos++;
	}
	
	public Object getConta(int numero) {
		return referencia[numero];
	}
	
	public int getQuantidadeDeObjetos() {
		return numeroDeObjetos;
	}
	
	
}
