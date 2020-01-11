import java.util.Scanner;

public class CarroUsado extends Veiculo {
	
	private String nomeProprietario;
	private float valorCompra;
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public CarroUsado comprar(Scanner sc){
		
		System.out.println("Informe o nome do proprietário atual: ");
		String nomeProprietario = sc.nextLine();
		System.out.println("Informe o valor de compra: ");
		float valorCompra = sc.nextFloat();
		sc.nextLine();
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
		estado = "Usado";	
		
		System.out.println("Veículo comprado e adicionado no estoque!");	
		
		return this;
	}
	
}
