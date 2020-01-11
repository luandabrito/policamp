
public class ContaCorrente {
		// Atributos da Classe
		String numero;
		String agencia;
		String banco;
		String titular;
		String cpf;
		float saldo;
		
		//M�todos ou Fun��es da Classe
		void deposito(float valor) {
			this.saldo = this.saldo + valor;			
		}
		
		float getSaldo() {
			return this.saldo;
		}
		
		boolean transferencia(String destino, float valor) {
			if (this.saldo >= valor) {
				System.out.println("Transferindo " + valor + " para " + destino);
				this.saldo = this.saldo - valor;
				return true;
			} else {
				System.out.println("N�o possui saldo");
				return false;
			}
		}
		
}
