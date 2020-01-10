#include <stdio.h>

int main(void) 
{
// variáveis
	float base, altura, area;
	
// apresentação
	printf("CALCULO DA AREA DO TRIANGULO");
	
// entrada de dados
	printf("\n\nInforme a altura do triangulo: ");
	scanf("%f", &altura);
	
	printf("\nInforme a base do triagulo: ");
	scanf("%f", &base);
	
// cálculos
	area = base * altura;

// saída de dados
	printf("\nArea do triagulo: %.1f", area);
	
	return 0;	
	
}
