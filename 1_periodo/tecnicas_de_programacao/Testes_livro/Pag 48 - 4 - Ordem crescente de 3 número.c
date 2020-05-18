#include <stdio.h>

int main(void)
{
	float n1, n2, n3;
	printf("Informe o primeiro numero: ");
	scanf("%f", &n1);
	printf("Informe o segundo numero: ");
	scanf("%f", &n2);
	printf("Informe o terceiro numero: ");
	scanf("%f", &n3);
	
	if ((n1 < n2) && (n1 < n3))
	if (n2 < n3)
		printf("A sequencia crescente e: %.0f, %.0f, %.0f", n1, n2, n3);
		else
			printf("A sequencia crescente e: %.0f, %.0f, %.0f", n1, n3, n2);
	
	if ((n2 < n1) && (n2 < n3))
	if (n1 < n3)
		printf("A sequencia crescente e: %.0f, %.0f, %.0f", n2, n1, n3);
		else
			printf("A sequencia crescente e: %.0f, %.0f, %.0f", n2, n3, n1);
	
	if ((n3 < n1) && (n3 < n2))
	if (n1 < n2)
		printf("A sequencia crescente e: %.0f, %.0f, %.0f", n3, n1, n2);
		else
			printf("A sequencia crescente e: %.0f, %.0f, %.0f", n3, n2, n1);
	

	return 0;			
}
