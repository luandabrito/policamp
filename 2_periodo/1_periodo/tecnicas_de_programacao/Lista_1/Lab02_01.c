// Emanoelle Luanda F. S. Brito - RA 2019740696

#include <stdio.h>

int main()
{
// declara��o de vari�veis
	int numero, resto;
	
// entrada de dados
	printf("Digite um numero: ");
	scanf("%i", &numero);
	
// processamento e sa�da de dados
	resto = numero % 2;
	
	if (resto == 0)
		printf("\nNumero Par");
	else 
		printf("\nNumero Impar");
	
	return 0;	
	
}
