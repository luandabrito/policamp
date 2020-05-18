
#include <stdio.h>

int main ()
{
	int i, n = 1, n1 = 1, n2;
	
	printf(" 0, %i, %i,",n, n);
	
	for (i = 0; i < 12; i++)
	{
		n2 = n + n1;
		printf(" %i,", n2);
		n = n1;
		n1 = n2;
	}

	
	return 0;
}
