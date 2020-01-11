import java.util.Scanner;

public class MainMenu {
	
	private Agencia agencia = new Agencia();
	
	public static void main(String[] args) {
		MainMenu obj = new MainMenu();
		obj.menu();
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("MENU");
			System.out.println("1 - Incluir");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Listar");
			System.out.println("5 - Sair");
			int opcao = sc.nextInt();
			sc.nextLine(); // Limpa o buffer
			if (opcao ==  5) {
				break;
			} else if (opcao == 1) {
				incluirAgencia(sc);
			} else if (opcao == 2) {
				alterarAgencia(sc);
			} else if (opcao == 3) {
				excluirAgencia(sc);
			} else if (opcao == 4) {
				listarAgencia(sc);
			}
				
		}
		sc.close();
	}// Fim do menu
	
	public void incluirAgencia(Scanner sc) {
		System.out.println("Incluir ag�ncia banc�ria");
		System.out.println("N�mero: ");
		String numero = sc.nextLine();
		System.out.println("Local: ");
		String local = sc.nextLine();
		
		agencia.setNumero(numero);
		agencia.setLocal(local);
		System.out.println("Ag�ncia cadastrada!");
		
	} // Fim do incluir
	
	public void alterarAgencia(Scanner sc) {
		System.out.println("Alterar ag�ncia " + agencia.getNumero());
		System.out.println("Novo n�mero: ");
		String numero = sc.nextLine();
		System.out.println("Novo local: ");
		String local = sc.nextLine();
		
		agencia.setNumero(numero);
		agencia.setLocal(local);
		System.out.println("Ag�ncia alterada!");
	
	} // Fim do alterar
	
	public void excluirAgencia(Scanner sc) {
		System.out.println("Confirma excluir ag�ncia banc�ria " + agencia.getNumero());
		String opcao = sc.nextLine();
		if (opcao.equalsIgnoreCase("Sim")) {
				agencia.setNumero(null);
				agencia.setLocal(null);
		}
	} // Fim do excluir
	
	public void listarAgencia(Scanner sc) {
		System.out.println("Listar ag�ncias");
		System.out.println("\nNumero: " + agencia.getNumero());
		System.out.println("Local: " + agencia.getLocal());
		System.out.println("\nFim da listagem.\n");
	
	} // Fim do listar
	
}// Fim da classe
