import java.util.Scanner;

public class Concessionaria {
	
		Scanner sc = new Scanner (System.in);
		private Cliente cliente = new Cliente();
		
		public static void main(String[] args) {
				Concessionaria obj = new Concessionaria();
				obj.menu();

	}
		public void menu() {
			
				while(true) {
					System.out.println("       MENU");
					System.out.println("1 - Incluir/ Alterar/ Excluir Cliente");
					System.out.println("2 - Incluir/ Alterar/ Excluir Veículo");
					System.out.println("3 - Comprar veículo usado");
					System.out.println("4 - Vender veículo novo");
					System.out.println("5 - Solicitar serviços");
					System.out.println("6 - Sair ");
					int opcao = sc.nextInt();
					sc.nextLine(); //Limpa o buffer
					if (opcao == 5) {
						break;
					} else if (opcao == 1) {
						incluirCliente(sc);
					} else if (opcao == 2) {
						alterarCliente(sc);
					} else if (opcao == 3) {
						excluirCliente(sc);
					} else if (opcao == 4) {
						listarClientes(sc);
					}
					
				}// fim do while menu
				
				sc.close();
		} // Fim do menu
			
		public void incluirCliente(Scanner sc) {
			System.out.println("Incluir cliente");
			System.out.println("Informe o nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe o CPF: ");
			String cpf = sc.nextLine();
			System.out.println("Informe o número da CNH: ");
			String cnh = sc.nextLine();
			
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setCnh(cnh);
			System.out.println("Cliente cadastrado!");
			
		} // Fim do incluir
		
		public void alterarCliente(Scanner sc) {
			System.out.println("Alterar dados do cliente " + cliente.getNome());
			System.out.println("Novo nome: ");
			String nome = sc.nextLine();
			System.out.println("Novo número CPF: ");
			String cpf = sc.nextLine();
			System.out.println("Novo número CNHF: ");
			String cnh = sc.nextLine();
			
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setCnh(cnh);
			System.out.println("Dados do cliente alterado!");
		
		} // Fim do alterar
		
		public void excluirCliente(Scanner sc) {
			System.out.println("Confirma excluir o cliente " + cliente.getNome() + "?");
			String opcao = sc.nextLine();
			if (opcao.equalsIgnoreCase("Sim")) {
					cliente.setNome(null);
					cliente.setCpf(null);
					cliente.setCnh(null);
			}
		} // Fim do excluir
		
		public void listarClientes(Scanner sc) {
			System.out.println("Listar clientes");
			System.out.println("\nNome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("CNH: " + cliente.getCnh());
			System.out.println("\nFim da listagem.\n");
		
		} // Fim do listar
			
} // Fim da Classe
