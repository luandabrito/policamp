#include <stdio.h>

int main(void) {
	
// variáveis
	float nota1, nota2, nota3, peso1, peso2, peso3, media;

// entrada de dados
	printf("Informe a primeira nota: ");
	scanf("%f", &nota1);
	printf("Informe o peso da primeira nota: ");
	scanf("%f", &peso1);
		
	printf("\nInforme a segunda nota: ");
	scanf("%f", &nota2);
	printf("\nInforme o peso da segunda nota: ");
	scanf("%f", &peso2);	
	
	printf("\nInforme a terceira nota: ");
	scanf("%f", &nota3);
	printf("\nInforme o peso da terceira nota: ");
	scanf("%f", &peso3);
	
// cálculos
	media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
	
// saída de dados
	printf("\nMedia das notas: %1.f", media);
	
	return 0;
	
}
