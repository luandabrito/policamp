
public class Cantina {

	public static void main(String[] args) {
		GarrafaAgua g1 = new GarrafaAgua();
		// g1.marca = "It"; Está privada
		g1.setMarca("It");
		g1.setVolume(600);
		g1.setGas(true);
		
		System.out.println("Garrafa" + "\nMarca:" + g1.getMarca() + "\nVolume:" + g1.getVolume() + "\nGas: " + g1.isGas());
	}

}
