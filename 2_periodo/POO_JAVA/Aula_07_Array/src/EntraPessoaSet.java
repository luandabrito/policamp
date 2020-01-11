import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EntraPessoaSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Pessoa> pessoas = new TreeSet<>();
		while(true) {
			Pessoa p = entraPessoa(sc);
			if (p == null) {
				break;
			}
			pessoas.add(p);
		}
		sc.close();
		System.out.println("Os nomes entrados foram:");
		for (Pessoa p : pessoas) {
			System.out.println(p.getNome()
					+ " CPF:" + p.getCpf());
		}
	}

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
	}
}
