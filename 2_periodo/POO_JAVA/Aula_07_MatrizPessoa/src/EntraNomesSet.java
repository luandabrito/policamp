import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EntraNomesSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> nomes = new TreeSet<>();
		
		while(true){
			System.out.print("Entre com o nome (Enter para parar): ");
			String str = sc.nextLine();
			if(str == null || str.trim().isEmpty()) {
				break;
			}
			nomes.add(str);
		}
		sc.close();
		System.out.println("\nOs nomes entrados foram: \n");
		for (String nome : nomes) {
			System.out.println(nome);
		}	
		// Nomes ordenados de Z para A
		System.out.println("\nNomes ordenados de Z para A: \n");
		ArrayList<String> lista = new ArrayList<>();
		lista.addAll(nomes);
		Collections.reverse(lista);
		for (String nome : lista) {
			System.out.println(nome);
		}
	}
}
