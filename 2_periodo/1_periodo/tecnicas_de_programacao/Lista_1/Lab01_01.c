#include <stdio.h>

int main(void) 
{
// variáveis
	float c, f;
	
// apresentação
	printf("CONVERSAO DE ESCALAS - CELSIUS X FAHRENHEIT");
	
	
// entrada de dados
	printf("\n\nInforme a temperatura em Celsius: ");
	scanf("%f", &c);
	
// cálculos
	f = ("%f", c * 1.8 + 32);
	
// saída de dados
	printf("\nTemperatura em Fahrenheit: %.1f", f);

	return 0;

}
