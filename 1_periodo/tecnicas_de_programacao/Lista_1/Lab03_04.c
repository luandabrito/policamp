#include <stdio.h>

int main(void)
{
	int n1, n2, n3;
	printf("Informe o primeiro numero: ");
	scanf("%i", &n1);
	printf("Informe o segundo numero: ");
	scanf("%i", &n2);
	printf("Informe o terceiro numero: ");
	scanf("%i", &n3);
	
	if ((n1 < n2) && (n1 < n3) && (n2 < n3)) 
		printf("O numero do meio e %i", n2);
	else
		if ((n2 < n1) && (n2 < n3) && (n1 < n3))
			printf("O numero do meio e: %i", n1);
		else
			printf("O numero do meio e: %i", n3);
	
	return 0;			
}
