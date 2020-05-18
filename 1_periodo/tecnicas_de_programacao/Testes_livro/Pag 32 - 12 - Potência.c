#include <stdio.h>
#include <math.h>

int main ()
{
	float n1, n2, r1, r2;
	
	printf("Informe o primeiro numero maior que zero: ");
	scanf("%f", &n1);
	printf("Informe o segundo numero maior que zero: ");
	scanf("%f", &n2);
	
	r1 = pow (n1,n2);
	r2 = pow (n2,n1);
	
	printf("\nPrimeiro numero elevado ao segundo numero = %.2f", r1);
	printf("\nSegundo numero elevado ao primeiro numero = %.2f", r2);
	
	return 0;
		
}
