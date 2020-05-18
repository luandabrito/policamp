#include <stdio.h>

int main(void) {
	
// variáveis
	float deposito, taxa, rendimento, valortotal;
	
// entrada de dados
	printf("Informe o valor do deposito: ");
	scanf("%f", &deposito);
	
	printf("Informe a taxa de juros: ");
	scanf("%f", &taxa);
	
// cálculos
	rendimento = deposito * taxa/100;
	valortotal = deposito + rendimento;
	
// saída de dados
	printf("\nRedimento: %.1f", rendimento);
	printf("\nValor total: %.1f", valortotal);
	
	return 0;
	
}
