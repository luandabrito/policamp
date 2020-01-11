
public class OperacoesMatriz {
	public static void main(String[] args) {
		float[][] m = {
				{10, 20, 30},
				{40},
				{2, 3, 4, 5},
				{6, 7, 8}
		};
		OperacoesMatriz obj = new OperacoesMatriz();
		obj.exibirMatriz(m);
		float maior = obj.maiorMatriz(m);
		float media = obj.mediaMatriz(m);
		System.out.println("Maior:" + maior);
		System.out.println("Média:" + media);
		
		
	}
	
	public void exibirMatriz(float[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%.2f ", m[i][j]);
			}
			System.out.println();
		}
	}
	
	public float maiorMatriz(float[][] m) {
		float maior = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (maior < m[i][j]) {
					maior = m[i][j];
				}
			}
		}
		return maior;
	}
	
	public float mediaMatriz(float[][] m) {
		float soma = 0;
		int total = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				soma = soma + m[i][j];
				total++;
			}
		}
		return soma / total;
	}
}
