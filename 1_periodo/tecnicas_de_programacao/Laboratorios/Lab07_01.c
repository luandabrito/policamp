
#include <stdio.h>
#include <conio.h>

int main ()
{
	
	float nota, acm, i;
	acm = 0;
	
	for (i=0; i<10; i++)
	{
		printf("Informe a %.0f nota: ", i+1);
		scanf("%f", &nota);
		acm = acm + nota;
	}
	
	printf("Media: %.2f", acm / 10);
	
	return 0;	
}
