#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	float custo, preco, quant;
	
	printf("Informe o custo do espetáculo: ");
	scanf("%f", &custo);
	
	printf("Informe o preço do convite: ");
	scanf("%f", &preco);
	
	quant = custo / preco;
	
	printf("\nSerá necessário vender %.1f ingressos para cobrir o custo do espetáculo.", quant);
	
return 0;	
}
