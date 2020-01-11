import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Cadastro de Funcionário");
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe a matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Informe o salário: ");
		float salario = sc.nextFloat();
				
		Funcionario fun1 = new Funcionario();
		fun1.setNome(nome);
		fun1.setMatricula(matricula);
		fun1.setSalario(salario);
		
		try {
			validaFuncionario(fun1);
		} catch (Exception e) {
				System.out.println("Informação inválida: " + e.getMessage());
			//e.printStackTrace();
		}
		
		
		System.out.println("\nNome do funcionário(a): " + fun1.getNome() + "\nMatrícula: " + fun1.getMatricula() + "\nSalário: " + fun1.getSalario());

	}//fim do maim

	private static void validaFuncionario(Funcionario fun1) throws Exception {
		if (fun1.getNome().trim().isEmpty()) {
			throw new Exception("Nome do Funcionário em branco");
		}
		if (fun1.getMatricula() < 0 ) {
				throw new Exception("Matrícula do Funcionário inválida");
		}
		if (fun1.getSalario() <= 0) {
				throw new Exception("Salário do Funcionário inválido");
		}
	}//fim do valida

}
