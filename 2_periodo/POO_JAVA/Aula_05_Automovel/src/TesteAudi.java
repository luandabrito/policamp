
public class TesteAudi {

	public static void main(String[] args) {
		AudiR8 r8 = new AudiR8();
		r8.motor = new Motor();
		r8.chassi = new Chassi();
		r8.motor.combustivel = "Gas";
		r8.chassi.numRodas = 4;
		r8.chassi.numPortas = 2;
		
		System.out.println("Audi R8 possui " + r8.chassi.numPortas + " portas, " + r8.chassi.numRodas + " rodas, e " + r8.motor.combustivel + " de combustivel.");

	}

}
