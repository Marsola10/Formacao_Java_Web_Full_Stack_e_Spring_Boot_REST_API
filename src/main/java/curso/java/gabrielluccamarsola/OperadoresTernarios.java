package curso.java.gabrielluccamarsola;

public class OperadoresTernarios {
	public static void main(String[] args) {
		// Operadores Ternários são para microvalidações
		String saidaResultado;

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		saidaResultado = media >= 70 ? "Aluno Aprovado": (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Reprovado";
		
		System.out.println(saidaResultado);
		
		
		
		
	}

}
