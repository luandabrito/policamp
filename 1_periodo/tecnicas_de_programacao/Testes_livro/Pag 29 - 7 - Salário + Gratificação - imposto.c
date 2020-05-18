#include <stdio.h>

int main(void) {
	
// variáveis
	float salariobase, gratificacao, imposto, salarioareceber;
	
// entrada de dados
	printf("Escreva seu salario: ");
	scanf("%f", &salariobase);
	
// cálculos
	gratificacao = 50;
	imposto = salariobase * 10/100;
	salarioareceber = salariobase + gratificacao - imposto;
	
// saída de dados
	printf("\nGratificacao: %.1f", gratificacao);
	printf("\nImposto deduzido: %.1f", imposto);
	printf("\nSalario Liquido: %.1f", salarioareceber);
		
	return 0;
	
}
