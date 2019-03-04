package br.com.nicolas.exceptions;

public class SenhaInvalidaException extends RuntimeException{

	private static final long serialVersionUID = 6678813829773754715L;
	
	
	public SenhaInvalidaException(String msg) {
		super(msg);
	}
}