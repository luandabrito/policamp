#include <stdio.h>

int main(void) {
	
// variáveis	
	float salario, novosalario;
	
// entrada de dados
	printf("Informe seu salario: ");
	scanf("%f", &salario);
	
// cálculos
	novosalario = salario + salario * 25/100;
	
// saída de dados
	printf("\nNovo salario com acrescimo de 25 porcento: %.1f", novosalario);
	
	return 0;		
	
}
