#include <stdio.h>

int main ()
{
	int n, con;
	con = 1;
	
	printf("Informe o numero da tabuada desejada: ");
	scanf("%i", &n);
	
	while (con <= 10)
	{
		printf("%i x %i = %i \n", n, con, n*con);
	
		con = con + 1;
	}
	return 0;
}
