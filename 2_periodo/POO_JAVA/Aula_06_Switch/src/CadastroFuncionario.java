import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Cadastro de Funcion�rio");
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe a matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Informe o sal�rio: ");
		float salario = sc.nextFloat();
				
		Funcionario fun1 = new Funcionario();
		fun1.setNome(nome);
		fun1.setMatricula(matricula);
		fun1.setSalario(salario);
		
		try {
			validaFuncionario(fun1);
		} catch (Exception e) {
				System.out.println("Informa��o inv�lida: " + e.getMessage());
			//e.printStackTrace();
		}
		
		
		System.out.println("\nNome do funcion�rio(a): " + fun1.getNome() + "\nMatr�cula: " + fun1.getMatricula() + "\nSal�rio: " + fun1.getSalario());

	}//fim do maim

	private static void validaFuncionario(Funcionario fun1) throws Exception {
		if (fun1.getNome().trim().isEmpty()) {
			throw new Exception("Nome do Funcion�rio em branco");
		}
		if (fun1.getMatricula() < 0 ) {
				throw new Exception("Matr�cula do Funcion�rio inv�lida");
		}
		if (fun1.getSalario() <= 0) {
				throw new Exception("Sal�rio do Funcion�rio inv�lido");
		}
	}//fim do valida

}
