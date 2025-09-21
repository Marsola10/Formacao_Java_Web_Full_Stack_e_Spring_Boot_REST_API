package curso.java.gabrielluccamarsola.fundamentos;

public class OperacoesLogicasAninhadas {
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operações lógicas aninhadas: São operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno está aprovado direto! Parabéns!");
				} else {
					System.out.println("Aluno está aprovado direto!");
			} 
				}else if(media >= 80) {
				System.out.println("Aluno aprovado!");
			}
				} else if (media <= 70) {
				System.out.println("Aluno em recuperação!");
			} else {
			System.out.println("Aluno reprovado!");
		} 
		
	}
}
