
public class TesteConexao {
	
	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		}
		
		
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexao");
//		}finally {
//			if(con != null)
//				con.close();
//		}
	}
}
