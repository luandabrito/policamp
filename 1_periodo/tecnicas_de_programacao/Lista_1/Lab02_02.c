#include <stdio.h>

int main()
{
// declaração de variáveis
	float escolha, n1, n2, mult, div;

// entrada de dados
	printf("Escolha uma das opcoes: \n1 - Multiplicar dois numeros.\n2 - Dividir dois numeros.\n");
	scanf("%f", &escolha);
	
	printf("\nDigite o primeiro numero: ");
	scanf("%f", &n1);
	printf("Digite o segundo numero: ");
	scanf("%f", &n2);
	
// processamento e saída de dados
	if (escolha == 1)
	{
		mult = n1 * n2;
		printf("\nA multiplicacao dos dois numeros e: %.2f", mult);
	}
	else
	{
		div = n1 / n2;
		printf("\nA divisao dos dois numeros e: %.2f", div);
    }
    
	return 0;
}
