
public class ContaCorrente {
	
	private String numero;
	private Agencia agencia;
	private float saldo;
	private float especial;
	private Pessoa titular;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getEspecial() {
		return especial;
	}
	public void setEspecial(float especial) {
		this.especial = especial;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	
	

}
