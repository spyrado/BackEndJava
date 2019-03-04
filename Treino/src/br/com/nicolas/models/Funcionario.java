package br.com.nicolas.models;

import br.com.nicolas.exceptions.SenhaInvalidaException;
import br.com.nicolas.interfaces.ObrigacoesFuncionario;
import br.com.nicolas.utils.AutenticaUtil;

public class Funcionario extends Pessoa implements ObrigacoesFuncionario{
	
	private String cargo;
	private double salario;
	private String carteiraDeTrabalho;
	private AutenticaUtil autentica;
	
	public Funcionario() {
		autentica = new AutenticaUtil();
	}
	
	// Obrigacao de funcionario
	@Override
	public void baterPonto(int senha){
		autentica.senha(senha);
	}
	
	
	// Getters e Setters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"----- DADOS COMO FUNCIONARIO -----"+
				"\nCargo: "+ this.cargo + 
				"\nSalario: " + this.salario + 
				"\nCarteira de Trabalho: " + this.carteiraDeTrabalho;
	}
	
}