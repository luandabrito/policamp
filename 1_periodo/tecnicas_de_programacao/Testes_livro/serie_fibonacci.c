#include <stdio.h>

int main()
{
	int con = 0, n = 1, n1 = 1, n2;
	
	printf("%i,%i,",n, n);
	
	while (con < 20)
	{
		n2 = n + n1;
		printf("%i,", n2);
		n = n1;
		n1 = n2;
		
	con = con + 1;
	}
	
return 0;
}
