#include <stdio.h>

int main()
{
	float salario, cheque1, cheque2, saldo1, saldofinal;
	
	printf("Informe o valor do salario: ");
	scanf("%f", &salario);
	printf("Informe o valor do primeiro cheque: ");
	scanf("%f", &cheque1);
	printf("Informe o valor do segundo cheque: ");
	scanf("%f", &cheque2);
	
	saldo1 = salario - cheque1 - cheque1 * 0.0038;
	saldofinal = saldo1 - cheque2 - cheque2 * 0.0038;	
	
	printf("Saldo atual: %.2f", saldofinal);
	
	return 0;	
	
}
