#include <stdio.h>

int main(void) 
{
// vari�veis
	float cotacao, real, dolar;
	
// entrada de dados
	printf("Informe o valor em real: ");
	scanf("%f", &real);
	printf("Informe a cotacao do dolar: ");
	scanf("%f", &cotacao);
	
// c�lculos
	dolar = real / cotacao;
	
// sa�da de dados
	printf("\nValor em dolar: %.2f", dolar);
	
	return 0;	
}
