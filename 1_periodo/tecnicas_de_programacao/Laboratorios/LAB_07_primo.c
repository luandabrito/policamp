#include <stdio.h>
#include <conio.h>

int main ()
{
	int i, j, acm;
	
	for (i=2; i<=100; i++)
	{	
		for (acm = 0, j=1; j<=i; j++)
		{
			if (i % j == 0)
			{
				acm = acm + 1;
			}
		}
		if (acm == 2)
		printf("Numero primo: %d\n", i);
	}
	
	getch();
	return 0;
}
