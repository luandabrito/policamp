import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Servico implements ManterCadastro <Servico>{
	
	private String nomeServico;
	private float valorServico;

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	public float getValorServico() {
		return valorServico;
	}

	public void setValorServico(float valorServico) {
		this.valorServico = valorServico;
	}

	@Override
	public Servico incluir(Scanner sc) {
		
		System.out.println("\nIncluir Servi�o");		
		System.out.println("Informe o nome do servi�o: ");
		String nomeServico = sc.nextLine();
		System.out.println("Informe o valor do servi�o: ");
		float valorServico = sc.nextFloat();
		sc.nextLine();
	
		setNomeServico(nomeServico);
		setValorServico(valorServico);
		
		System.out.println("Servi�o cadastrado!");
		
		return this;
	}

	@Override
	public Servico alterar(Scanner sc) {
		
		System.out.println("\nAlterar dados do Servi�o " + getNomeServico() + ":");		
		System.out.println("Informe o novo nome do servi�o: ");
		String nomeServico = sc.nextLine();
		System.out.println("Informe o novo valor do servi�o: ");
		float valorServico = sc.nextFloat();
		sc.nextLine();
	
		setNomeServico(nomeServico);
		setValorServico(valorServico);
		
		System.out.println("Dados do servi�o alterado!");
		
		return this;
	}

	@Override
	public Servico excluir(Scanner sc) {
		System.out.println("Confirma excluir o servi�o " + getNomeServico() + "? Sim ou N�o");
		String opcao = sc.nextLine();
		if (opcao.equalsIgnoreCase("Sim")) {
			System.out.println("Servi�o exclu�do!");
				return this;
		}else {
			System.out.println("Servi�o n�o exclu�do.");
			return null;
		}
	}
	
	@Override
	public void escrever(ArrayList<Servico> servicoList) throws Exception {
		BufferedWriter write = new BufferedWriter(new FileWriter("ArquivoServicos.txt"));
		
		for(Servico s : servicoList) {
			String str = s.getNomeServico() + ";" + s.getValorServico() + "\n";
			
			write.write(str);
		}
		write.close();	
		
	}
	
	@Override
	public void ler(ArrayList<Servico> servicoList) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("ArquivoServicos.txt"));
		
		String linha;
		while ((linha = reader.readLine()) != null){
			String[] str = linha.split(";");
			Servico s = new Servico();
			s.setNomeServico(str[0]);
			s.setValorServico(Float.parseFloat(str[1]));
			servicoList.add(s);
		}//fecha while
		reader.close();
		
	}

	@Override
	public void listar(ArrayList<Servico> servicoList) throws Exception {
		System.out.println("\nServicos Dispon�veis: ");
		for (Servico s : servicoList) {
			String str = "Nome do Servi�o: " + s.getNomeServico() + ", Valor: " + s.getValorServico();
			System.out.println(str);
		}
		
	}
	
}// fecha a class
