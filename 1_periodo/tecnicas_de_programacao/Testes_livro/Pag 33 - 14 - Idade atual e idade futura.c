#include <stdio.h>

int main(void) {
	
//vari�veis
	float nascimento, atual, idade, idade2025;
	
// entrada de dados
	printf("Informe o ano de nascimento: ");
	scanf("%f", &nascimento);
	printf("Informe o ano atual: ");
	scanf("%f", &atual);
	
// c�lculos
	idade = atual - nascimento;
	idade2025 = 2025 - nascimento;
	
// sa�da de dados
	printf("\nIdade atual: %.0f", idade);
	printf("\nIdade em 2025: %.0f", idade2025);
	
	return 0;
		
}
