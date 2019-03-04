public class Gerente extends Funcionario implements Autenticavel{
	
	private String login;
	private AutenticadorUtil autentica;
	
	public Gerente() {
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
		return super.getSalario();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}