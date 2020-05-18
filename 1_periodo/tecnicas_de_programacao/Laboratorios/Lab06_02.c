
#include <stdio.h>
#include <conio.h>

int main()
{
	int con = 0;
	float soma = 0, n;
	
	do
	{
		printf("Informe um numero: ");
		scanf("%f", &n);
		
		soma = soma + n;
		con = con + 1;
	}
	while (con < 10);
	
	printf("Media dos numeros informado: %.2f", soma/10);
	
	getch();
	return 0;
}

