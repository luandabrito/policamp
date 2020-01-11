import java.util.Date;

public class TesteMensagem {
	public static void main(String[] args) {
		Mensagem m1 = new Mensagem();
		m1.destinatario = "Grupo familia";
		m1.envio = new Date();
		m1.texto = "Bom dia";
		m1.erro = "OK";
		
		Mensagem m2 = new Mensagem();
		m2.destinatario = "Grupo amigos";
		m2.envio = new Date();
		m2.texto = "Churrasco hoje";
		m2.erro = "Sem rede";
		
		Mensagem m3 = new Mensagem("Gremista", new Date(), "2019 na luta", "Copa do Brasil");
		
		imprimir(m1);
		imprimir(m2);
		imprimir(m3);
		
	}
	
	static void imprimir(Mensagem m) {
		System.out.println("\nMensagem: " + " \nDestinatario: " + m.destinatario + "\nEnvio: " + m.envio + "\nTexto: " + m.texto + "\nErro: " + m.erro);
	}

}
