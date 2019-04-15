// Emanoelle Luanda F. S. Brito - RA 2019740696
#include <stdio.h>

int main()
{
// declaração de variáveis
	int x , y, ab_x , ab_y;

// entrada de dados
	printf("Informe o valor de X: ");
	scanf("%i", &x);
	printf("Informe o valor de Y: ");
	scanf("%i", &y);
	
// processamento e saída de dados
	if (x > y)
		printf("O maior numero e: %i\nO menor numero e: %i", x, y);
	else
		printf("O maior numero e: %i\nO menor numero e: %i", y, x);
	
	if (x + y >= x)
		printf("\n%i + %i >= %i", x, y, x);
	else
		printf("\n%i + %i < %i", x, y, x);
		
	if (x >= 0)
		ab_x = x;
	else
		ab_x = x * -1;
	
	if (y >= 0)
		ab_y = y;
	else
		ab_y = y * -1;
	
	printf("\nValor absoluto de x = %i", ab_x);
	printf("\nValor absoluto de y = %i", ab_y);
		
	return 0;

}

