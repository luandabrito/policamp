
public class Transferencia extends Transacao {
	
	private String favorecido;
	private ContaCorrente destino;
	
	public String getFavorecido() {
		return favorecido;
	}
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	public ContaCorrente getDestino() {
		return destino;
	}
	public void setDestino(ContaCorrente destino) {
		this.destino = destino;
	}
	

}
