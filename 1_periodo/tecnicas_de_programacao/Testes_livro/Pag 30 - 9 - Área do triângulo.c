#include <stdio.h>

int main(void) {
	
// variáveis
	float altura, base, area;
	
// entrada de dados
	printf("Informe a altura do triangulo: ");
	scanf("%f", &altura);
	
	printf("\nInforme a base do triangulo: ");
	scanf("%f", &base);
	
// cálculos
	area = (base*altura)/2;
	
// saída de dados
	printf("\nArea do triangulo = %.1f\n", area);
	
	return 0;	
	
}
