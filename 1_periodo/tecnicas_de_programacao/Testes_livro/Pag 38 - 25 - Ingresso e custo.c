#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	float custo, preco, quant;
	
	printf("Informe o custo do espet�culo: ");
	scanf("%f", &custo);
	
	printf("Informe o pre�o do convite: ");
	scanf("%f", &preco);
	
	quant = custo / preco;
	
	printf("\nSer� necess�rio vender %.1f ingressos para cobrir o custo do espet�culo.", quant);
	
return 0;	
}
