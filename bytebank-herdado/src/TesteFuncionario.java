public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Administrador administrador = new Administrador();
		administrador.setSenha(222);
		System.out.println(administrador.autentica(222));
	}

}