#include <stdio.h>

int main(void) {
	
// vari�veis
	float salariobase, salarioareceber, gratificacao, imposto;
	
// entrada de dados
	printf("Escreva seu salario: ");
	scanf("%f", &salariobase);
	
// c�lculos
	gratificacao = salariobase * 5/100;
	imposto = salariobase * 7/100;
	salarioareceber = salariobase + gratificacao - imposto;
		
// sa�da de dados
	printf("\nGratificacao: %.1f", gratificacao);
	printf("\nImporto deduzido: %.1f", imposto);
	printf ("\nSalario Liquido: %.1f", salarioareceber);
	
	return 0;	
		
}
