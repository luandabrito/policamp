#include <stdio.h>

int main(void) {
	
// vari�veis
	float salariobase, gratificacao, imposto, salarioareceber;
	
// entrada de dados
	printf("Escreva seu salario: ");
	scanf("%f", &salariobase);
	
// c�lculos
	gratificacao = 50;
	imposto = salariobase * 10/100;
	salarioareceber = salariobase + gratificacao - imposto;
	
// sa�da de dados
	printf("\nGratificacao: %.1f", gratificacao);
	printf("\nImposto deduzido: %.1f", imposto);
	printf("\nSalario Liquido: %.1f", salarioareceber);
		
	return 0;
	
}
