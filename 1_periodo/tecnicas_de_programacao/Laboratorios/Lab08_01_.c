#include <stdio.h>

int main()
{
	int n[15],i, acm = 0;
	
	for (i=0; i<15; i++)
	{
		printf("Informe o %i numero: ", i+1);
		scanf("%i", &n[i]);
		if (n[i] < 0)
		{
			printf("Numero negativo nao e valido.\n");
			i= i-1;
		}
	}
	printf("\nNumeros informados:");
	for (i=0; i<15; i++)
	{
		printf("%i, ", n[i]);
	}
	for (i=0; i<15; i++)
	{
		if (n[i] == i)
		{
			printf("\nPosicao: %i ; Valor: %i", i, n[i]);
			acm = acm +1;
		}
	}
	if (acm == 0)
	printf("\n\nNao existe no vetor elementos com posicao igual ao valor da posicao.");
	
	return 0;
}
