#include <stdio.h>

int main(void) {
	
// vari�veis
	float pe, polegadas, jardas, milhas;
	
// entrada de dados
	printf("Escreva a quantidade de pe: ");
	scanf("%f", &pe);
	
// c�lculos
	polegadas = pe * 12;
	jardas = pe / 3;
	milhas = jardas / 1760;
	
// sa�da de dados
	printf("\nPolegadas = %.1f", polegadas);
	printf("\nJardas = %.1f", jardas);
	printf("\nMilhas = %.1f", milhas);
		
	return 0;
	
	
	
}
