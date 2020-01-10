#include <stdio.h>

int main(void) 
{
// variáveis
	float area, base, altura;
	
// entrada de dados
	printf("Escreva o valor da base: ");
	scanf("%f", &base);
	
	printf("Escreva o valor da altura: ");
	scanf("%f", &altura);
	
// cálculos
	area = base * altura / 2;
	
// saída de dados
	printf("Area do triangulo:%f", area);
	
	return 0;
	
}
