package curso.java.gabrielluccamarsola.fundamentos;

public class OperacoesLogicasIfAndElse {
	// Main é um método executável em Java
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno aprovado! " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação! " + media);
		} else {
			System.out.println("Aluno reprovado! " + media);
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * int mediaAluno = 70; String nome = "Gabriel";
		 * 
		 * if (mediaAluno >= 70 && nome.equals("Gabriel")) {
		 * System.out.println("Parabéns, você está aprovado!"); } else if (mediaAluno <=
		 * 70) { System.out.println("Você está reprovado!"); } else {
		 * System.out.println("Aluno não encontrado!"); }
		 */

		/*
		 * if (mediaAluno <= 70) {
		 * System.out.println("Sinto muito, você está reprovado!"); }
		 */

	}

}
