import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EntraPessoasList {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pessoa> pessoasList = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		
		while (true) {
		cadastrarPessoa(sc);
		
		System.out.println("Que continuar cadastrando: 1- Sim ou 2- Não");
		int opcao = sc.nextInt();
		sc.nextLine();
				
		if(opcao == 2) {
			break;
		}
		
		} // fecha while
		
		for (int i = 0; i < pessoasList.size(); i++) {
			pessoasList.get(i).imprimir();
		}
		
	} //fecha o main

	private static void cadastrarPessoa(Scanner sc) {
		
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Entre com o nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Entre com o sexo: ");
		String sexo = sc.nextLine();
		System.out.print("Entre com a idade: ");
		int idade = sc.nextInt();
		
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setSexo(sexo);
		pessoa.setIdade(idade);	
		
		pessoasList.add(pessoa);
		
	} //fecha cadastrarPessoa

} //fecha a classe
