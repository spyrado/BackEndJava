package bytebank;

public class Conta{
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double dinheiro) {
		
		this.saldo += dinheiro;
	}
	
	public boolean saca(double dinheiro) {
		
		if(this.temDinheiro(dinheiro)) {
			
			this.saldo -= dinheiro;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double dinheiro, Conta destino) {
		
		if(this.temDinheiro(dinheiro)) {
			
			this.saca(dinheiro);
			destino.deposita(dinheiro);
			return true;
		}
		
		return false;
	}
	
	public boolean temDinheiro(double dinheiro) {
		
		return (this.saldo >= dinheiro) ? true : false;
	}

	public double getSaldo(){
		return this.saldo;
	}

}