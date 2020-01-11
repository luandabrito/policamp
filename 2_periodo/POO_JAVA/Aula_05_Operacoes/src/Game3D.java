
public class Game3D {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		op.x = 10;
		op.y = 20;
		int soma = op.somar();
		System.out.println("Soma:" + soma);
		
		Operacoes3D op3D = new Operacoes3D();
		op3D.x = 5;
		op3D.y = 6;
		op3D.z = 7;
		op3D.imprimir();
		op3D.rotacionar();
		op3D.imprimir();
		
		soma = op3D.somar();
		System.out.println("Soma:" + soma);
	}

}
