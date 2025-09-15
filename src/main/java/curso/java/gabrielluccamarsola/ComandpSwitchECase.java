package curso.java.gabrielluccamarsola;

public class ComandpSwitchECase {
	public static void main (String[] args) {
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
	int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
			
			
		default:
				System.out.println("Outro dia qualquer");
			break;
		}
	
	}

}
