#include <stdio.h>

int main(void)
{
// vari�veis
	float consumo, distancia, litros;
	
// entrada de dados
	printf("Informe a distancia percorrida: ");
	scanf("%f", &distancia);
	
	printf("Informe a quantidade de litros de conbustivel consumido: ");
	scanf("%f", &litros);
	
// c�lculos
	consumo = distancia / litros;
	
// sa�da de dados
	printf("Consumo medio: %2.f", consumo);
	
	return 0;	
	
}
