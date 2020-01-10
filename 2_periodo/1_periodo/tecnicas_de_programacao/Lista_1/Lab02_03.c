// Emanoelle Luanda F. S. Brito RA 2019740696

#include <stdio.h>

int main()
{
// declaração de variáveis
	int x, y;
	
// entrada de dados
	printf ("Informe o primeiro numero: ");
	scanf ("%i", &x);
	printf ("Informe o segundo numero: ");
	scanf ("%i", &y);
			
// processamento
	if (x >= y)
		printf("Ordem crescente: %i, %i", x,y);
	else
		printf("Ordem crescente: %i, %i", y, x);
	
	return 0;
	
}
