import java.util.Scanner;

public class Teste_Presidente {

	public static void main(String[] args) {
		int valor = 1;
		int contagem[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		while (valor != 0) {
			System.out.println("\nInforme o número do candidato: ");
			System.out.println("1 - Fábio");
			System.out.println("2 - Vagnilson");
			System.out.println("3 - Daniel");
			System.out.println("4 - Oliveira");
			System.out.println("5 - Nulo");
			System.out.println("0 - Finalizar votação");
			valor = sc.nextInt();
			
			switch (valor) {
			case 1: contagem[valor]++ ; System.out.println("1 - Fábio"); break;
			case 2: contagem[valor]++ ;System.out.println("2 - Vagnilson"); break;
			case 3: contagem[valor]++ ;System.out.println("3 - Daniel"); break;
			case 4: contagem[valor]++ ;System.out.println("4 - Oliveira"); break;
			case 5: contagem[valor]++ ;System.out.println("5 - Nulo"); break;
			case 0: System.out.println("0 - Votação Finalizada"); break;
			default: System.out.println("Candidato inválido");
			}
			
		}// fim do while
		
		System.out.println("\nContagem da Votação: ");
		System.out.println("1 - Fábio, votos: " + contagem[1]);
		System.out.println("2 - Vagnilson, votos: " + contagem[2]);
		System.out.println("3 - Daniel, votos: " + contagem[3]);
		System.out.println("4 - Oliveira, votos: " + contagem[4]);
		System.out.println("5 - Nulo, votos: " + contagem[5]);
	}

}
