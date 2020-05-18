
#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{
	int tipo, numero, base, expoente;
	float resposta;
	
	printf("Informe a opcao desejada: \n1 - Potencia desejada \n2 - Raiz quadrada de um numero\n");
	scanf("%i", &tipo);
	
	switch (tipo)
	{
		case 1: printf("Informe o numero base: ");
				scanf(" %i", &base);
				printf("Informe a potencia: ");
				scanf("%i", &expoente);
				resposta = pow(base,expoente);
				printf("%i elevado a %i = %.2f", base, expoente, resposta);
				break;
		case 2: printf("Informe o numero: ");
				scanf("%i", &numero);
				resposta = sqrt(numero);
				printf("Raiz quadrada de %i = %.2f", numero, resposta);
				break;
		default: printf("Opcao invalida.");
	}
	
getch();
return 0;	
	
}

