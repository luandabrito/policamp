
public class Teste_Matriz {

	public static void main(String[] args) {
		float[][] notas = {
				{8},
				{3, 4, 5, 7},
				{9, 8},
				{8, 8},
				{3, 10, 5.5f}
		};
		Teste_Matriz obj = new Teste_Matriz();
		obj.exibirMatriz(notas);
			
	}//closed main
	
	public void exibirMatriz(float[][] notas) {
		float soma = 0;
		int con = 0;
		float maior = notas[0][0];
		float menor = notas[0][0];
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma = soma + notas[i][j];
				if (maior < notas[i][j])
					maior = notas[i][j];
				if (menor > notas[i][j])
					menor = notas[i][j];
				con++;
			} //fecha o segundo for.
		} //fecha o primeiro for.
		
		float media = soma/con;
		
		System.out.println("Soma das notas: " + soma);
		System.out.printf ("Média das notas: %.2f \n", media);
		System.out.println("Maior nota: " + maior);
		System.out.println("Menor nota: " + menor);
	
	}// closed exibirMatriz
}
