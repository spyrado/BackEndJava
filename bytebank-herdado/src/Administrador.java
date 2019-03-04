public class Administrador extends Funcionario implements Autenticavel{

	private AutenticadorUtil autentica;
	
	public Administrador() {
		this.autentica = new AutenticadorUtil();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 199;
	}
}