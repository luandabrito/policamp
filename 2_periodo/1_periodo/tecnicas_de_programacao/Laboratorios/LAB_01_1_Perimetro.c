#include <stdio.h>

#define PI 3.14
const float Double_PI = 2*PI;

int main(void)
{
// variáveis
	float raio, p;

// entrada de dados
	printf("Digite o valor do raio: ");
	scanf("%f", &raio);
	
// cálculos
	p = Double_PI * raio;
	
// saída de dados
	printf("Valor do perimetro: %.1f", p);
	
	return 0;
}
