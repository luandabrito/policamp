#include <stdio.h>

int main(void) 
{
// vari�veis
	float c, f;
	
// apresenta��o
	printf("CONVERSAO DE ESCALAS - CELSIUS X FAHRENHEIT");
	
	
// entrada de dados
	printf("\n\nInforme a temperatura em Celsius: ");
	scanf("%f", &c);
	
// c�lculos
	f = ("%f", c * 1.8 + 32);
	
// sa�da de dados
	printf("\nTemperatura em Fahrenheit: %.1f", f);

	return 0;

}
