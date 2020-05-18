#include <stdio.h>

int main(void) {
	
// variáveis
	float area, pi, raio;
	pi = 3.1415;
	
// entrada de dados
	printf("Informe o raio do circulo: ");
	scanf("%f", &raio);
	
// cálculos
	area = pi * (raio*raio);
	
// saída de dados
	printf("Area do circulo = %.0f", area);
	
	return 0;
	
}
