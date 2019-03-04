package bytebank;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		Conta nicolas = new Conta();
		
		nicolas.deposita(200);
		
		System.out.println(nicolas.getSaldo());
	}
}