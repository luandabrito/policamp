#include <stdio.h>

int main(void) 
{
// vari�veis
	float area, base, altura;
	
// entrada de dados
	printf("Escreva o valor da base: ");
	scanf("%f", &base);
	
	printf("Escreva o valor da altura: ");
	scanf("%f", &altura);
	
// c�lculos
	area = base * altura / 2;
	
// sa�da de dados
	printf("Area do triangulo:%f", area);
	
	return 0;
	
}
