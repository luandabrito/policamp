import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EntraPessoasMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Pessoa> pessoas = new TreeMap<>();
		while(true) {
			Pessoa p = entraPessoa(sc);
			if (p == null) {
				break;
			}
			pessoas.put(p.getCpf(), p);
		}//fecha while
		
		System.out.println("Pesquisar um CPF: ");
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		Pessoa p = pessoas.get(cpf);
		if (p != null) {
			System.out.println(p.getNome() + ", CPF: " + p.getCpf());
		}else {
			System.out.println("Pessoa não encontrada.");
		}
		
		sc.close();
		
	}// fecha main

	private static Pessoa entraPessoa(Scanner sc) {
		System.out.println("Entrar com uma pessoa.\n Enter para cancelar");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		if (nome.trim().isEmpty()) {
			return null;
		}
		System.out.println("Idade:");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.println("CPF:");
		String cpf = sc.nextLine();
		System.out.println("Sexo:");
		String sexo = sc.nextLine();
		
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setIdade(idade);
		p.setCpf(cpf);
		p.setSexo(sexo);
		return p;
	}//fecha entrarpessoa
}// fecha classe
