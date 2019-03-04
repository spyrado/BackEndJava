package br.com.nicolas.models;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private String genero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		
		return  "\n"+
				"----- DADOS COMO PESSOA -----"+
				"\nNome: "+ this.nome + 
				"\nIdade: " + this.idade + 
				"\nAltura: " + this.altura +
				"\nGenero: " + this.genero +
				"\n\n";
	}
	
}
