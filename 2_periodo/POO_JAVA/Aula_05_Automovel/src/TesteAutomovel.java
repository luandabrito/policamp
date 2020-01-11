
public class TesteAutomovel {

	public static void main(String[] args) {
		MercedesSLS sls = new MercedesSLS();
		sls.combustivel = "Gas";
		sls.numRodas = 4;
		sls.numPortas = 2;
		
		System.out.println("A mercedes possui " + sls.numPortas + " portas, " + sls.numRodas + " rodas e "+ sls.combustivel + " de combustivel");
	}

}
