
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}