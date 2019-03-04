package bytebank;

public class TestaClasses {

	public static void main(String[] args) {
		
		
		Cliente nicolas = new Cliente();
		
		nicolas.nome = "Nicolas";
		nicolas.cpf = "222.222.222-22";
		nicolas.profissao = "programador";
		
		Conta contaDoNicolas = new Conta();
		
		contaDoNicolas.titular = nicolas;
		contaDoNicolas.deposita(100);
		
		System.out.println(contaDoNicolas.titular.nome);
		System.out.println(contaDoNicolas.getSaldo());

	}

}
