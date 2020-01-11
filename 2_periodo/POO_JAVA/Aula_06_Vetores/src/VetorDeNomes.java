import java.util.Scanner;

public class VetorDeNomes {
	public static void main(String[] args) {
     	
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de nomes: ");
		int quant = sc.nextInt();
		sc.nextLine(); // consumir o buffer
		String[] nomes = new String[quant];
		
		for (int i =0; i < nomes.length; i++) {
		System.out.println("Informe o " + (i + 1) + "° nome:");
		nomes[i] = sc.nextLine();
		}
		
		for (int i =0; i < nomes.length; i++) {
			System.out.println("Nome i = " + i + ": " + nomes[i]);
		}
	}
}
