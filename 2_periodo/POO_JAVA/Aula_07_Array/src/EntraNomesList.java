import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class EntraNomesList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nomes = new LinkedList<String>();
		
		while(true){
		
			System.out.print("Entre com o nome (Enter para parar): ");
			String str = sc.nextLine();
			if(str == null || str.trim().isEmpty()) {
				break;
			}
			nomes.add(str);
		}
		
		Collections.sort(nomes); // listar os nomes ordenados
		
		System.out.println("Os nomes entrados foram:");
			
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}	
		sc.close();
	}

}
