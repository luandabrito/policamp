#include <stdio.h>

int main(void) {
	
// variáveis
	int n1, n2, n3, n4, soma;
	
// recebimento de dados

	printf("Informe a primeira nota: ");
	scanf("%i", &n1);
	
	printf("\nInforme a segunda nota: ");
	scanf("%i", &n2);
	
	printf("\nInforme a terceira nota: ");
	scanf("%i", &n3);
	
	printf("\nInforme a primeira nota: ");
	scanf("%i", &n4);
	
// cálculos
	
	soma = n1 + n2+ n3+ n4;
	
// saída de dados

	printf("\nSoma das notas: %i", soma);
	
	return 0;	
	
}
