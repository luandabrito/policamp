#include <stdio.h>

int main(void) 
{
// variáveis
	int x, y, soma, divisao, resto;
	
// entrada de dados
	printf("Informe o valor de x: ");
	scanf("%i", &x);
	
	printf("\nInforme o valor de y: ");
	scanf("%i", &y);
	
// cálculos
	soma = x + y;
	divisao = x / y;
	resto = x % y;

// saída de dados
	printf("\nSoma de x e y: %i", soma);
	printf("\nDivisao de x e y: %i", divisao);
	printf("\nResto da divisao de x e y: %i", resto);
	
	return 0;
		
}
