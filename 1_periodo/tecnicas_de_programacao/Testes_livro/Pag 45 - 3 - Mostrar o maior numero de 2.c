#include <stdio.h>

int main (void)
{
	float n1, n2;
	
	printf("Informa o primeiro numero: ");
	scanf("%f", &n1);
	printf("Informe o segundo numero: ");
	scanf("%f", &n2);
	
	if (n1 > n2)
		printf("O maior numero e: %.0f", n1);
	if (n2 > n1)
		printf("O maior numero e: %.0f", n2);
	if (n1 == n2)
		printf("Os numero sao iguais.");
	
	return 0;
	
}
