#include <stdio.h>

#define PI 3.14
const float Double_PI = 2*PI;

int main(void)
{
// vari�veis
	float raio, p;

// entrada de dados
	printf("Digite o valor do raio: ");
	scanf("%f", &raio);
	
// c�lculos
	p = Double_PI * raio;
	
// sa�da de dados
	printf("Valor do perimetro: %.1f", p);
	
	return 0;
}
