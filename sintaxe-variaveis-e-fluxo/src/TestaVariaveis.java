
/**
 * @author nick
 *
 */

public class TestaVariaveis {
	
	public static void main(String[] args) {
		
		// Mechendo com inteiros
		int idade = 37;
		System.out.println("Minha Idade: " + idade);
		
		// Mechendo com Tipos Flutuantes
		double divisao = 5.0 / 2;
		System.out.println("Resultado da divisao é " + divisao);
		
		// Fazendo um casting, de um tipo mais genérico, para um tipo mais específico.
		double salario = 1200.50;
		int valor = (int) salario;
		System.out.println("Salario: " + valor);
		
		// Tipos primitivos
		long numeroGrande = 12312312312l;
		short numeroPequeno = 1234;
		byte b = 127;
		
		/* O Java da erro se eu n der casting, ou colocar f no final, pois ele entende 
		 * que pode estorar o limite de bites desse float */
		float num = (float) 3.14;
		float numeroFloat = 3.14f;
	}
}
