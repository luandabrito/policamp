#include <stdio.h>

int main(void) 
{
// vari�veis
	int numero, antecessor, sucessor;
	
// entrada de dados
	printf("Digite um numero: ");
	scanf("%i", &numero);
	
// c�lculos
	antecessor = numero - 1;
	sucessor = numero + 1;
	
// sa�da de dados
	printf("\nAntecessor: %i", antecessor);
	printf("\nSucessor: %i", sucessor);
	
	return 0;	
	
}
