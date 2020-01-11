import java.util.Scanner;

public class ErroDivisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int num = entraNumero(sc);
			sc.nextLine();
			
			int val = entraNumero(sc);
			sc.nextLine();
			
			float result = num / val;
			System.out.println("Divisão:" + result);
		} catch (Exception ex) {
				System.out.println("Ocorreu um erro" + ex.getMessage());
		} finally {
				sc.close();
				System.out.println("Programa encerrado");
		}
	}//fim da main
	
	public static int entraNumero(Scanner sc) {
		while (true) {
			try {
				System.out.println("Informe um número: ");
				int num = sc.nextInt();
				return num;
			} catch (Exception ex) {
				System.out.println("Erro no número");
				sc.nextLine();
			}
		}
	}
}
