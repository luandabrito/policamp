import java.util.ArrayList;
import java.util.Scanner;

public interface ManterCadastro <T> {
	
	public T incluir(Scanner sc);
	
	public T alterar(Scanner sc);
	
	public T excluir(Scanner sc);
	
	public void escrever(ArrayList<T> List) throws Exception;
	
	public void ler(ArrayList<T> List) throws Exception;
	
	public void listar(ArrayList<T> List) throws Exception;

}
