#include <stdio.h>

int main(void) 
{
// vari�veis
	int x, y, soma, divisao, resto;
	
// entrada de dados
	printf("Informe o valor de x: ");
	scanf("%i", &x);
	
	printf("\nInforme o valor de y: ");
	scanf("%i", &y);
	
// c�lculos
	soma = x + y;
	divisao = x / y;
	resto = x % y;

// sa�da de dados
	printf("\nSoma de x e y: %i", soma);
	printf("\nDivisao de x e y: %i", divisao);
	printf("\nResto da divisao de x e y: %i", resto);
	
	return 0;
		
}
