#include <stdio.h>

int main ()
{
	int n[10], i;
	
	for (i = 0; i<10; i++)
	{
		printf("Informe o %i numero: ", i+1);
		scanf("%i", &n[i]);
	}
	printf("\n\nIMPRESSAO DAS POSICOES E VALORES\n");
	for (i=0; i<10; i++)
	{
		printf("Posicao: %i ; Valor: %i\n", i, n[i]);
	}
	printf("\nValor da primeira posicao: %i\n", n[0]);
	printf("Valor da quarta posicao: %i\n", n[3]);
	printf("Valor da ultima posicao: %i\n", n[9]);
	
	printf("\nPOSICAO PAR\n");
	for (i=0; i<10; i++)
	{
		if ((i%2) == 0)
		{
			printf("Posicao: %i ; Valor: %i\n", i, n[i]);
		}	
	}
	printf("\n\nVALOR IMPAR\n");
	for (i=0; i<10; i++)
	{
		if ((n[i]%2) != 0)
		{
			printf("Posicao: %i ; Valor: %i\n", i, n[i]);
		}
	}
	printf("\n\nVALOR MULTIPLO DE 3\n");
	for (i=0; i<10; i++)
	{
		if ((n[i]%3) == 0)
		{
			printf("Posicao: %i ; Valor: %i\n", i, n[i]);
		}
	}
	
	return 0;
}
