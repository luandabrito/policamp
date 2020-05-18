#include <stdio.h>

int main()
{
	int codigo, variavel = 0;
	float quantidade, valor;
	
	printf("Informe a quantidade vendida: ");
	scanf("%f", &quantidade);
	
	if (quantidade <= 0)
		printf("Quantidade invalida.");
	else 
	{
		printf("Informe o codigo do produto: ");
		scanf("%i", &codigo);
		switch (codigo)
		{
			case 1: valor = quantidade * 100;
					variavel = 1;
					break;
			case 2: valor = quantidade * 150;
					variavel = 1;
					break;
			case 3: valor = quantidade * 200;
					variavel = 1;
					break;
			default: printf("Produto invalido.");
		}
	if (variavel == 1)
		printf("Valor total: %.2f", valor);
	}
		
	return 0;
	
	
}
