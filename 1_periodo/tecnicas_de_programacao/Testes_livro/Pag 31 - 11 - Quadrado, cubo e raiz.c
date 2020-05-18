#include <stdio.h>
#include <math.h>

int main ()
{
	float numero, quadrado, cubo, raiz_2, raiz_3;
	
	printf("Digite um numero positivo e maior que zero: ");
	scanf("%f", &numero);
	
	quadrado = numero * numero;
	cubo = pow (numero, 3);
	raiz_2 = sqrt(numero);
	raiz_3 = cbrt(numero);

	printf("\nQuadrado do numero: %.2f", quadrado);
	printf("\nCubo do numero: %.2f", cubo);
	printf("\nRaiz quadrada do numero: %.2f", raiz_2);
	printf("\nRaiz cubica do numero: %.2f", raiz_3);
	
	return 0;
	
}
