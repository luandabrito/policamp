#include <stdio.h>

int main(void) {
	
// vari�veis
	float area, pi, raio;
	pi = 3.1415;
	
// entrada de dados
	printf("Informe o raio do circulo: ");
	scanf("%f", &raio);
	
// c�lculos
	area = pi * (raio*raio);
	
// sa�da de dados
	printf("Area do circulo = %.0f", area);
	
	return 0;
	
}
