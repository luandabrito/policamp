#include <stdio.h>

int main ()
{
// declaração de variáveis
	int mes;
	
// entrada de dados
	printf("Informe o mes:\n1-janeiro \n2-fevereiro \n3-marco \n4-abril \n5-maio \n6-junho \n7-julho \n8-agosto \n9-setembro \n10-outubro \n11-novembro \n12-dezembro\n");
	scanf("%i", &mes);
	
// processamento e saída de dados
	if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
		printf("O mes informado contem 31 dias");
	else
	{
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			printf("O mes informado contem 30 dias.");
		else
		{
			if (mes == 2)
				printf("O mes informado tera 28 dias e em anos bissextos tera 29 dias.");
			else
				printf("Erro na escolha do mes");
		}
	}
}
