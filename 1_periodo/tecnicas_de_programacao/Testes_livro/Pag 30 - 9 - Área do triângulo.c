#include <stdio.h>

int main(void) {
	
// vari�veis
	float altura, base, area;
	
// entrada de dados
	printf("Informe a altura do triangulo: ");
	scanf("%f", &altura);
	
	printf("\nInforme a base do triangulo: ");
	scanf("%f", &base);
	
// c�lculos
	area = (base*altura)/2;
	
// sa�da de dados
	printf("\nArea do triangulo = %.1f\n", area);
	
	return 0;	
	
}
