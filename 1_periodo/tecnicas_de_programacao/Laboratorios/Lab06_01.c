
#include <stdio.h>
#include <conio.h>

int main()
{
	int i, n;
	long res;
	
	printf("Digite um valor para calcular o fatorial: ");
	scanf("%d", &n);
	
	while (n<0)
	{
		printf("Valor incorreto.\n Digite um valor para calcular o fatorial: ");
		scanf("%d", &n);
	}
	i = n;
	if (n==0)
		res = 1;
	else
	{
		res = n;
		do
		{
			i=i - 1;
			res = res * i;
		}
		while(i>1);
	}
	printf("\nO fatorial de %d e %d\n\n", n, res);
	
	getch();	
	return 0;
}
