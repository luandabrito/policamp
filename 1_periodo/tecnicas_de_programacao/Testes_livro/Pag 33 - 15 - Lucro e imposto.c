#include <stdio.h>

int main(void) {
	
// vari�veis
	float custo, precofabrica, plucro, pimposto, lucro, imposto;
	
// entrada de dados
	printf("Informe o preco de fabrica: ");
	scanf("%f", &precofabrica);
	printf("Informe o percentual de lucro: ");
	scanf("%f", &plucro);
	printf("Informe o percentual de imposto: ");
	scanf("%f", &pimposto);
	
// c�lculos
	lucro = precofabrica * plucro/100;
	imposto = precofabrica * pimposto/100;
	custo = precofabrica + lucro + imposto;
	
// sa�da de dados
	printf("\nValor correspondente ao lucro do distribuidor: %.1f", lucro);
	printf("\nValor correspondente aos impostos: %.1f", imposto);
	printf("\nPreco final do veiculo: %.1f", custo);
	
	return 0;	
	
}
