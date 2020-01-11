import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo implements ManterCadastro <Veiculo>{

	private String placaVeiculo;
	private String cor;
	private String modelo;
	private int ano;
	private float valor;
	private int codigo;
	protected String estado;
	
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public Veiculo incluir(Scanner sc) {
		
		System.out.println("\nIncluir Veículo");		
		System.out.println("Informe um código numérico: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe a placa do veículo: ");
		String placaVeiculo = sc.nextLine();
		System.out.println("Informe a cor: ");
		String cor = sc.nextLine();
		System.out.println("Informe o modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Informe o ano: ");
		int ano = sc.nextInt();
		System.out.println("Informe o valor de venda: ");
		float valor = sc.nextFloat();
		sc.nextLine();
			
		setCodigo(codigo);
		setPlacaVeiculo(placaVeiculo);
		setCor(cor);
		setModelo(modelo);
		setAno(ano);
		setValor(valor);
		estado = "Novo";	
		
		System.out.println("Veículo cadastrado!");
		
		return this;
	}
	
	@Override
	public Veiculo alterar(Scanner sc) {
		
		System.out.println("\nAlterar dados do veículo " + getModelo() + ", código:" + getCodigo() + ":");
		System.out.println("O código não será alterado.");
		System.out.println("Informe a nova placa do veículo: ");
		String placaVeiculo = sc.nextLine();
		System.out.println("Informe a nova cor: ");
		String cor = sc.nextLine();
		System.out.println("Informe o novo modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Informe o novo ano: ");
		int ano = sc.nextInt();
		System.out.println("Informe o novo valor de venda: ");
		float valor = sc.nextFloat();
		sc.nextLine();
		
		setCodigo(codigo);
		setPlacaVeiculo(placaVeiculo);
		setCor(cor);
		setModelo(modelo);
		setAno(ano);
		setValor(valor);
		
		System.out.println("Dados do veículo alterado!");
				
		return this;
	}
	
	@Override
	public Veiculo excluir(Scanner sc) {
		System.out.println("Confirma a exclusão do veículo: Código " + getCodigo() + "? Sim ou Não");
		String opcao = sc.nextLine();
		if (opcao.equalsIgnoreCase("Sim")) {
			System.out.println("Veículo excluído!");
				return this;
		}else {
			System.out.println("Veículo não excluído.");
			return null;
		}
	}
	
	@Override
	public void escrever(ArrayList<Veiculo> veiculoList) throws Exception {
		BufferedWriter write = new BufferedWriter(new FileWriter("ArquivoVeiculos.txt"));
		
		for(Veiculo v : veiculoList) {
			String str = v.getPlacaVeiculo() + ";" + v.getCor() + ";" + v.getModelo() + ";" + v.getAno() + ";" + v.getValor() + ";" + v.getCodigo() + ";" + v.getEstado() + "\n";
			
			write.write(str);
		}
		write.close();	
		
	}
	
	@Override
	public void ler(ArrayList<Veiculo> veiculoList) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("ArquivoVeiculos.txt"));
		
		String linha;
		while ((linha = reader.readLine()) != null){
			String[] str = linha.split(";");
			Veiculo v = new Veiculo();
			v.setPlacaVeiculo(str[0]);
			v.setCor(str[1]);
			v.setModelo(str[2]);
			v.setAno(Integer.parseInt(str[3]));
			v.setValor(Float.parseFloat(str[4]));
			v.setCodigo(Integer.parseInt(str[5]));
			v.setEstado(str[6]);
			
			veiculoList.add(v);
		}//fecha while
		reader.close();
		
	}
	
	@Override
	public void listar(ArrayList<Veiculo> veiculoList) throws Exception {
		System.out.println("\nVeículo(s) Cadastrado(s): ");
		for (Veiculo v : veiculoList) {
			String str = "Código: " + v.getCodigo() + ", Carro " + v.getEstado() + ", Cor: " + v.getCor() + ", Modelo: " + v.getModelo() + ", Ano: " + v.getAno() + ", Valor: " + v.getValor() + ", Placa: " + v.getPlacaVeiculo();
			System.out.println(str);
		}
	}
	
	public void escreverVendidos(ArrayList<Veiculo> veiculoVendidoList) throws Exception {
		BufferedWriter write = new BufferedWriter(new FileWriter("ArquivoVeiculosVendidos.txt"));
		
		for(Veiculo v2 : veiculoVendidoList) {
			String str = v2.getPlacaVeiculo() + ";" + v2.getCor() + ";" + v2.getModelo() + ";" + v2.getAno() + ";" + v2.getValor() + ";" + v2.getCodigo() + ";" + v2.getEstado() + "\n";
			
			write.write(str);
		}
		write.close();	
		
	}
	
	public void lervendidos(ArrayList<Veiculo> veiculoVendidoList) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("ArquivoVeiculosVendidos.txt"));
		
		String linha;
		while ((linha = reader.readLine()) != null){
			String[] str = linha.split(";");
			Veiculo v2 = new Veiculo();
			v2.setPlacaVeiculo(str[0]);
			v2.setCor(str[1]);
			v2.setModelo(str[2]);
			v2.setAno(Integer.parseInt(str[3]));
			v2.setValor(Float.parseFloat(str[4]));
			v2.setCodigo(Integer.parseInt(str[5]));
			v2.setEstado(str[6]);
			
			veiculoVendidoList.add(v2);
		}//fecha while
		reader.close();
		
	}
	
	public void listarVendidos(ArrayList<Veiculo> veiculoVendidoList) throws Exception {
		System.out.println("\nVeículo(s) Vendido(s): ");
		for (Veiculo v : veiculoVendidoList) {
			String str = "Código: " + v.getCodigo() + ", Carro " + v.getEstado() + ", Cor: " + v.getCor() + ", Modelo: " + v.getModelo() + ", Ano: " + v.getAno() + ", Valor: " + v.getValor() + ", Placa: " + v.getPlacaVeiculo();
			System.out.println(str);
		}
	}
}
