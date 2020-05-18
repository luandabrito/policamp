#include <stdio.h>
#include <conio.h>

int main ()
{
	int n, suc, ant;
	
	do
	{
		printf("Informe um numero entre 1 e 10: ");
		scanf("%i", &n);
		
		if (n < 0 || n >= 10)
			printf("Numero invalido.\n");
				
	} while (n < 0 || n >= 10);
	
	suc = n + 1;
	ant = n - 1;
	
	printf("\nNumero informado: %i \n\nAntecessor do numero informado: %i \n\nSucessor do numero informado: %i", n, ant, suc);
		
	getch();
	return 0;
	
}
