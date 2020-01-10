#include <stdio.h>

int main(void)
{
// variáveis
	int a, b, divisao, quadrado, cubo;
	
// entrada de dados
	printf("Informe o valor de a: ");
	scanf("%i", &a);
	
	printf("Informe o valor de b: ");
	scanf("%i", &b);
	
// cálculos
	divisao = a / b;
	quadrado = a * a;
	cubo = 	b * b * b;

// saída de dados
	printf("\nDivisao: %i", divisao);
	printf("\nQuadrado de a: %i", quadrado);
	printf("\nCubo de b: %i", cubo);
	
	return 0;

}

