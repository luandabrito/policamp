#include <stdio.h>

int main(void) 
{
// variáveis
	int anoatual, a_nascimento, idade, idade2050;

// entrada de dados
	printf("Digite o ano atual: ");
	scanf("%i", &anoatual);
	
	printf("Digite o ano de nascimento: ");
	scanf("%i", &a_nascimento);
	
// cálculos
	idade = anoatual - a_nascimento;
	idade2050 = 2050 - a_nascimento;
	
// saída de dados
	printf("\nIdade: %i", idade);
	printf("\nIdade em 2050: %i", idade2050);
	
	return 0;
	
}
