#include <stdio.h>

int main(void) {
	
// vari�veis
	float salario, percentual, aumento, novosalario;	
	
// entrada de dados
	printf("Escreva seu salario: ");
	scanf("%f", &salario);
	
	printf("\nEscreva o percentual de aumento: ");
	scanf("%f", &percentual);
	
// c�lculos
	aumento = salario * percentual/100;
	novosalario = salario + aumento;
	
// sa�da de dados
	
	printf("\nAumento: %.1f", aumento);
	printf("\nNovo salario: %.1f", novosalario);
	
	return 0;
	
}
