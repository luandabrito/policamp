#include <stdio.h>

int main ()
{
	int n = -1, con = 1, fatorial = 0;
	
	while (n < 0)
	{
	printf("Informe um numero: ");
	scanf("%i", &n);
	}
		
	if (n == 0 || n == 1)
		fatorial = 1;
	
	fatorial = n;
	
	while (con < n)
	{
		fatorial = fatorial * con;
		con = con + 1;		
	}
	
	printf("Fatorial = %i", fatorial);
		
	return 0;	
}
