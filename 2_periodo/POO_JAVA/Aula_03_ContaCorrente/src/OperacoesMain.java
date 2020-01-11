import java.util.Scanner;

public class OperacoesMain {

	ContaCorrente cc1;
	ContaCorrente cc2;
		
	public static void main(String[] args) {
		//Criar o Objeto
		OperacoesMain obj = new OperacoesMain();
		obj.cc1 = new ContaCorrente();
		obj.cc2 = new ContaCorrente();
		
		obj.cc1.titular = "Maria";
		//obj.cc2.titular = "Jose";
		obj.cc1.deposito(1000);
		//obj.cc2.deposito(1500);
		
		obj.entrarCC(obj.cc2);
		
		obj.cc1.transferencia("Jhonas", 1200);
		obj.cc2.transferencia("Pedro", 1200);
		
		obj.exibirCC(obj.cc1);
		obj.exibirCC(obj.cc2);
	}
	
	void entrarCC(ContaCorrente cc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero da conta: ");
		cc.numero = sc.nextLine();
		System.out.println("Agencia: ");
		cc.agencia = sc.nextLine();
		System.out.println("Banco: ");
		cc.banco = sc.nextLine();
		System.out.println("Titular: ");
		cc.titular = sc.nextLine();
		System.out.println("CPF: ");
		cc.cpf = sc.nextLine();
		System.out.println("Saldo: ");
		cc.saldo = sc.nextFloat();
		sc.close();			
	}
	
	void exibirCC(ContaCorrente cc) {
		System.out.println("Conta corrente" + "\nNúmero: " + cc.numero + "\nAgência: " + cc.agencia + "\nBanco: " + cc.banco + "\nTitular: " + cc.titular + "\nCPF: " + cc.cpf + "\nSaldo: " + cc.saldo);	
	}
		
}
