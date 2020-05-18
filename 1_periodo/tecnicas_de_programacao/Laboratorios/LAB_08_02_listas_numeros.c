#include <stdio.h>

int main ()
{
	float n[20];
	int i, qtd = 0;
	
	for (i=0; i<20; i++)
	{
		printf("Informe o %i numero: ", i+1);
		scanf("%f", &n[i]);
	}
	do
	{
		printf("\n\nInforme a quantidade de numeros, entre 0 e 20, que deseja verificar: ");
		scanf("%i", &qtd);
	} while (qtd <= 0 || qtd >20);
	
	printf("\n\nNumeros:\n");
	for(i=0; i<qtd; i++)
	{
		printf("%.2f\n", n[i]);
	}
	printf("\n\nNumeros restantes:\n");
	for(i=qtd; i<20; i++)
	{
		printf("%.2f\n", n[i]);
	}
	printf("\n\nTodos os numeros informados:\n");
	for(i=0; i<20; i++)
	{
		printf("%.2f\n", n[i]);
	}

	return 0;
}
