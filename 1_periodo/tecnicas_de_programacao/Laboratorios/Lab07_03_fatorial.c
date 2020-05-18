
#include <stdio.h>

int main()
{
	int n, i, fatorial = 0;
	
	do 
	{
	printf("Informe um numero: ");
	scanf("%i", &n);
	} while (n < 0);
		
	if (n == 0 || n == 1)
		fatorial = 1;
	
	fatorial = n;
	
	for (i = 1; i < n; i++)
	{
		fatorial = fatorial * i;
	}
	
	printf("\nFatorial = %i", fatorial);
		
	return 0;
}
