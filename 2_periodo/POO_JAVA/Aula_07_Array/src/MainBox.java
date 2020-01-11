
public class MainBox {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.add(200);
		Integer num = integerBox.get();
				
		Box<String> strBox = new Box<String>();
		strBox.add("Maria");
		String nome = strBox.get();

		System.out.println("Número: " + num + "\nNome: " + nome);
	}

}
