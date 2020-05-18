#include<stdio.h>

int main()
{
	int con, n, maior, menor;
	con = 0;
	
	while (con < 5)
	{
		printf("Informe um numero: ");
		scanf("%i", &n);
		
		if (con == 0)
		{
			maior = n;
			menor = n;
		}
		else
		{
			if (n > maior)
				maior = n;
			if (n< menor)
				menor = n;				
		}
		
	con = con + 1;
	}
	
	printf("Maior numero: %i\n", maior);
	printf("Menor numero: %i", menor);
	
return 0;	
}
