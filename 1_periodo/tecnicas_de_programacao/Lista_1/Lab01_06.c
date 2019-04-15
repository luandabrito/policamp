#include <stdio.h>

int main(void) 
{
// variáveis
	int numero, antecessor, sucessor;
	
// entrada de dados
	printf("Digite um numero: ");
	scanf("%i", &numero);
	
// cálculos
	antecessor = numero - 1;
	sucessor = numero + 1;
	
// saída de dados
	printf("\nAntecessor: %i", antecessor);
	printf("\nSucessor: %i", sucessor);
	
	return 0;	
	
}
