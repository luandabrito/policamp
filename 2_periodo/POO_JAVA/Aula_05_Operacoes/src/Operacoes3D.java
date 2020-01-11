
public class Operacoes3D
		extends Operacoes {
			
		public int z;
		
		//sobrecarga do método
		@Override
		public int somar() {
			return x + y + z;
		}
		
		public void rotacionar () {
			x = x + 1;
			y = y + 1;
			z = z + 1;
		}
		
		public void imprimir() {
			System.out.println("X:" + x + " Y:" + y + " Z:" + z);
		}
}

