// Emanoelle Luanda F. S. Brito RA 2019740696

#include <stdio.h>
#include <math.h>

int main()
{
// declara��o de vari�veis
	int ano, resto, bissexto;
	
// entrada de dados
	printf("Informe o ano: ");
	scanf("%i", &ano);
	
// processamento e sa�da de dados
	resto = ano % 4;
	
	if (resto == 0)
		printf("Ano bissexto");
	else
		printf("Ano nao bissexto");
		
	return 0;
	
	
}
