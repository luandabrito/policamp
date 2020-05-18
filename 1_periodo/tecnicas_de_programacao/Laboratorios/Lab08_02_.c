
#include<stdio.h>

int main ()
{
	char vetor[10];
	int i, acm = 0;
	
	for (i=0; i<10; i++)
	{
		printf("Escreva o %i caracter: ", i+1);
		scanf(" %c", &vetor[i]);
	}
	for (i=0; i<10; i++)
	{
		printf("%i caracter informado: %c\n", i+1, vetor[i]);
	}
	for (i=0; i<10; i++)
	{
		if (vetor[i] == '*' || vetor[i] == '@' || vetor[i] == '#' || vetor[i] == '$')
		{
			printf("Caracter especial: %c\n", vetor[i]);
			acm = acm + 1;
		}
	}
	if (acm == 0)
	printf("\nNenhum caracter especial lido");
	
	return 0;
}
