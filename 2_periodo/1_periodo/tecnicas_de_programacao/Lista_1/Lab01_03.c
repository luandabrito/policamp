#include <stdio.h>

int main(void) 
{
// vari�veis
	float base, altura, area;
	
// apresenta��o
	printf("CALCULO DA AREA DO TRIANGULO");
	
// entrada de dados
	printf("\n\nInforme a altura do triangulo: ");
	scanf("%f", &altura);
	
	printf("\nInforme a base do triagulo: ");
	scanf("%f", &base);
	
// c�lculos
	area = base * altura;

// sa�da de dados
	printf("\nArea do triagulo: %.1f", area);
	
	return 0;	
	
}
