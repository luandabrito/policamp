#include <stdio.h>

int main(void)
{
// variáveis
	float n1, n2, n3, n4, soma, media;
	
// entrada de dados
	printf("Digite o primeiro numero: ");
	scanf("%f", &n1);
	
	printf("\nDigite o segundo numero: ");
	scanf("%f", &n2);
	
	printf("\nDigite o terceiro numero: ");
	scanf("%f", &n3);
	
	printf("\nDigite o quarto numero: ");
	scanf("%f", &n4);
	
// cálculos
	soma = n1 + n2 + n3 + n4;
	media = soma/4;
	
// saída de dados
	printf("\nMedia: %.1f", media);
	
	return 0;
	
}
