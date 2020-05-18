#include <stdio.h>

int main(void) {
	
// variáveis
	float custo, precofabrica, plucro, pimposto, lucro, imposto;
	
// entrada de dados
	printf("Informe o preco de fabrica: ");
	scanf("%f", &precofabrica);
	printf("Informe o percentual de lucro: ");
	scanf("%f", &plucro);
	printf("Informe o percentual de imposto: ");
	scanf("%f", &pimposto);
	
// cálculos
	lucro = precofabrica * plucro/100;
	imposto = precofabrica * pimposto/100;
	custo = precofabrica + lucro + imposto;
	
// saída de dados
	printf("\nValor correspondente ao lucro do distribuidor: %.1f", lucro);
	printf("\nValor correspondente aos impostos: %.1f", imposto);
	printf("\nPreco final do veiculo: %.1f", custo);
	
	return 0;	
	
}
