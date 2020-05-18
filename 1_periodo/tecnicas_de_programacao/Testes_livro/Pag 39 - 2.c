#include <stdio.h>

int main ()
{
	int a, b, c, multi;
	
	printf("Informe tres numeros distintos: ");
	scanf("%i %i %i",&a, &b, &c);
	
	multi = a * b * c;
	
	printf("Multiplicacao = %i", multi);
	
return 0;	
}
