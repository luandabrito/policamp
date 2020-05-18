#include <stdio.h>

int main()
{
	float h_soma = 0, h, n1 = 1, n2 = 1;
	
	
	while (n1 <= 99 && n2 <= 50)
	{
		h = n1 / n2;
		n1 = n1 + 2;
		n2 = n2 + 1;
		h_soma = h_soma + h;
		
	}
	
	printf("H = %.2f", h_soma);

	return 0;
}
