
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EntraNomesSet {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Pessoa> pessoas = new TreeSet<>();
		
		while(true){
			Pessoa p = entraPessoa(sc);
			if (p == null) {
				return;
			}
			pessoas.add(p);
		}
		sc.close();
		System.out.println("Nomes entrados:");
		for (Pessoa p : pessoas) {
			System.out.println(p.getNome() + "CPF: " + p.getCpf());
		}
	}// fecha main

	private static Pessoa entraPessoa(Scanner sc) {

		System.out.print("Entre com o nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o CPF: ");
		String cpf = sc.nextLine();
		System.out.print("Entre com o sexo: ");
		String sexo = sc.nextLine();
		System.out.print("Entre com a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		Pessoa p = new Pessoa();
		
		p.setNome(nome);
		p.setCpf(cpf);
		p.setSexo(sexo);
		p.setIdade(idade);	
		
		return p;
	}
}
