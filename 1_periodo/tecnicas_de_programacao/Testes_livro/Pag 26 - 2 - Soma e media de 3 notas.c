#include <stdio.h>

int main(void) {

// variáveis
	float nota1, nota2, nota3, soma, media;
	char nome[20];
	
// recebimento de dados
		
	printf("Informe a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("\nInforme a segunda nota: ");
	scanf("%f", &nota2);
	
	printf("\nEscreva a terceira nota: ");
	scanf("%f", &nota3);
	
	printf("\nEscreva seu nome: ");
	scanf("%s", &nome);
	
// cálculos

	soma = nota1 + nota2 + nota3;
	media = soma/3;
	
// saída de dados
	
	printf("\nOla %s", nome);
	printf("\nSoma das notas: %.1f", soma);
	printf("\nMedia das notas: %.1f", media);
	
	return 0;
	

}

