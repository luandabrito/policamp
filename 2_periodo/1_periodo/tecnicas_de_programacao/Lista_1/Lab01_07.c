#include <stdio.h>

int main(void) 
{
// variáveis
	float cotacao, real, dolar;
	
// entrada de dados
	printf("Informe o valor em real: ");
	scanf("%f", &real);
	printf("Informe a cotacao do dolar: ");
	scanf("%f", &cotacao);
	
// cálculos
	dolar = real / cotacao;
	
// saída de dados
	printf("\nValor em dolar: %.2f", dolar);
	
	return 0;	
}
