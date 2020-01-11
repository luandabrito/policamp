import java.util.Date;

public class Mensagem {
	String destinatario;
	Date envio;
	String texto;
	static String erro;
	
	//Construtor
	public Mensagem() {
	}
	
	public Mensagem(String dest, Date env, String texto, String erro) {
		this.destinatario = dest;
		this.envio = env;
		this.texto = texto;
		this.erro = erro;
	}

}
