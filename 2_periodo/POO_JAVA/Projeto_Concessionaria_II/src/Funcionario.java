import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa implements ManterCadastro <Funcionario>{
	
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	@Override
	public Funcionario incluir(Scanner sc) {
		
		System.out.println("\nIncluir Funcionário");		
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Informe a Matrícula: ");
		String matricula = sc.nextLine();
		
		setNome(nome);
		setCpf(cpf);
		setMatricula(matricula);
		System.out.println("Funcionário cadastrado!");
		
		return this;
	}
	
	@Override
	public Funcionario alterar(Scanner sc) {
		System.out.println("\nAlterar dados do Funcionário " + getNome() + ":");
		System.out.println("Novo nome: ");
		String nome = sc.nextLine();
		System.out.println("Novo CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Nova matrícula: ");
		String matricula = sc.nextLine();
		
		setNome(nome);
		setCpf(cpf);
		setMatricula(matricula);
		System.out.println("Dados do cliente alterado!");
		
		return this;
	}
	
	@Override
	public Funcionario excluir(Scanner sc) {
		System.out.println("Confirma excluir o funcionário " + getNome() + "? Sim ou Não");
		String opcao = sc.nextLine();
		if (opcao.equalsIgnoreCase("Sim")) {
			System.out.println("Funcionário excluído!");
				return this;
		}else {
			System.out.println("Funcionário não excluído.");
			return null;
		}
	}
	
	@Override
	public void escrever(ArrayList<Funcionario> funcionarioList) throws Exception {
		BufferedWriter write = new BufferedWriter(new FileWriter("ArquivoFuncionarios.txt"));
		
		for(Funcionario f : funcionarioList) {
			String str = f.getNome() + ";" + f.getCpf() + ";" + f.getMatricula() + "\n";
			
			write.write(str);
		}
		write.close();	
		
	}

	@Override
	public void ler(ArrayList<Funcionario> funcionarioList) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("ArquivoFuncionarios.txt"));
		
		String linha;
		while ((linha = reader.readLine()) != null){
			String[] str = linha.split(";");
			Funcionario f = new Funcionario();
			f.setNome(str[0]);
			f.setCpf(str[1]);
			f.setMatricula(str[2]);
			funcionarioList.add(f);
		}//fecha while
		reader.close();
		
	}

	
	@Override
	public void listar(ArrayList<Funcionario> funcionarioList) throws Exception {
		System.out.println("\nFuncionários Cadastrados: ");
		for (Funcionario c : funcionarioList) {
			String str = "Nome: " + c.getNome() + ", CPF: " + c.getCpf() + ", Matrícula: " + c.getMatricula();
			System.out.println(str);
		}
		
	}
	

}
