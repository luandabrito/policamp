import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa implements ManterCadastro <Cliente>{

	private String cnh;
	

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Cliente incluir(Scanner sc) {
		
		System.out.println("\nIncluir Cliente");		
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Informe o número da CNH: ");
		String cnh = sc.nextLine();
		
		setNome(nome);
		setCpf(cpf);
		setCnh(cnh);
		System.out.println("Cliente cadastrado!");
		
		return this;
	}

	public Cliente alterar(Scanner sc) {
		System.out.println("\nAlterar dados do cliente " + getNome() + ":");
		System.out.println("Novo nome: ");
		String nome = sc.nextLine();
		System.out.println("Novo número CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Novo número CNH: ");
		String cnh = sc.nextLine();
		
		setNome(nome);
		setCpf(cpf);
		setCnh(cnh);
		System.out.println("Dados do cliente alterado!");
		return this;
	}

	public Cliente excluir(Scanner sc) {
		System.out.println("Confirma excluir o cliente " + getNome() + "? Sim ou Não");
		String opcao = sc.nextLine();
		if (opcao.equalsIgnoreCase("Sim")) {
			System.out.println("Cliente excluído!");
				return this;
		}else {
			System.out.println("Cliente não excluído.");
			return null;
		}
	}
	
	public void escrever(ArrayList<Cliente> clienteList) throws Exception {
		
		BufferedWriter write = new BufferedWriter(new FileWriter("ArquivoClientes.txt"));
		
		for(Cliente c : clienteList) {
			String str = c.getNome() + ";" + c.getCpf() + ";" + c.getCnh() + "\n";
			
			write.write(str);
		}
		write.close();	
	}

	public void ler(ArrayList<Cliente> clienteList) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("ArquivoClientes.txt"));
		
		String linha;
		while ((linha = reader.readLine()) != null){
			String[] str = linha.split(";");
			Cliente c = new Cliente();
			c.setNome(str[0]);
			c.setCpf(str[1]);
			c.setCnh(str[2]);
			clienteList.add(c);
		}//fecha while
		reader.close();
	}

	@Override
	public void listar(ArrayList<Cliente> clienteList) throws Exception {
		System.out.println("\nClientes Cadastrados: ");
		for (Cliente c : clienteList) {
			String str = "Nome: " + c.getNome() + ", CPF: " + c.getCpf() + ", CNH: " + c.getCnh();
			System.out.println(str);
		}
	}
	
} //fecha a classe cliente
