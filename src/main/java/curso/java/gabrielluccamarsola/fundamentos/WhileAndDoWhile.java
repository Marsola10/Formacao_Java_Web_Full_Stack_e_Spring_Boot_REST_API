package curso.java.gabrielluccamarsola.fundamentos;

public class WhileAndDoWhile {
	public static void main(String[] args) {
		/* Estrutura de repetição While */
		int numero = 0;

		while (numero <= 10) { // Verifica e depois executa o código
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		/*-----------------------------------------*/

		int numero2 = 0;

		do { // primeiro executa, depois verifica;
			
			System.out.println("\nO número atual é: " + numero2);
			numero2++;
		
		} while (numero2 <= 60);
	}

}
