
public class Cliente implements Autenticavel {
	
	private AutenticadorUtil autentica;
	
	public Cliente() {
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

}