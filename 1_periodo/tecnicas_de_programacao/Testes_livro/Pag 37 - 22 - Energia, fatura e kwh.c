#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale(LC_ALL, "Portuguese");
	
	float salario, quant, v_kw, fatura, fat_desc;
	
	printf("Informe o valor do salário mínimo: ");
	scanf("%f", &salario);
	
	printf("Informe a quantidade de kw/h consumida: ");
	scanf("%f", &quant);
		
	v_kw = salario / 5;
	fatura = quant * v_kw;
	fat_desc = fatura - fatura * 0.15;
	
	printf("O quilowatt custa R$%.2f\n", v_kw);
	printf("A fatura é de R$%.2f\n", fatura);
	printf("A fatura com 15%% de desconto é de R$%.2f\n", fat_desc);
	
return 0;
}
