#include <stdio.h>

int main(void) {
	
// vari�veis	
	float salario, novosalario;
	
// entrada de dados
	printf("Informe seu salario: ");
	scanf("%f", &salario);
	
// c�lculos
	novosalario = salario + salario * 25/100;
	
// sa�da de dados
	printf("\nNovo salario com acrescimo de 25 porcento: %.1f", novosalario);
	
	return 0;		
	
}
