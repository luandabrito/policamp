
public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private String cpf;
	private String sexo;
	private int idade;
	
	@Override
	public int compareTo(Pessoa o) {
		return cpf.compareTo(o.cpf);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimir() {
		System.out.println("\nNome: " + nome + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nIdade: " + idade);
		return;
		
	}
	
}
