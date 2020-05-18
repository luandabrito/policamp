#include <stdio.h>

int main()
{
	float racao_peso, gato1, gato2, resto;
	
	printf("Informe a quantidade de racao: ");
	scanf("%f", &racao_peso);
	printf("Informe a quantidade de racao fornecida diariamente ao primeiro gato: ");
	scanf("%f", &gato1);
	printf("Informe a quantidade de racao fornecida diariamente ao segundo gato: ");
	scanf("%f", &gato2);
	
	gato1 = gato1 / 1000;
	gato2 = gato2 / 1000;
	resto = racao_peso - (5 * gato1) - (5 * gato2);
	
	printf("\nRacao restante apos 5 dias: %.3f", resto);
	
	return 0;
	
}
