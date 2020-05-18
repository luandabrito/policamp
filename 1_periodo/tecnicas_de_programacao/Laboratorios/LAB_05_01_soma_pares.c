
#include <stdio.h>

int main ()
{
	int n = 0, soma = 0;
	
	while (n <= 100)
	{
		if (n % 2 == 0)
		{		
			soma = soma + n;
		}
		n = n + 1;
	}	
	
	printf("Soma dos numeros pares entre 0 e 100 = %i\n", soma);
	
	return 0;
}
