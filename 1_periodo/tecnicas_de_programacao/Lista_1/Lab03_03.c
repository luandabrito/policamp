#include <stdio.h>

int main()
{
// declaração de variáveis
	int dia, mes, signo;
	
// entrada de dados
	printf("Informe o dia de nascimento: ");
	scanf("%i", &dia);
	
	printf("Informe o mes de nascimento em numeros: ");
	scanf("%i", &mes);
	
// processamento e saída de dados
	if ((mes == 12 && dia >= 22 && dia <=31) || (mes == 1 && dia <= 20 && dia >=1)){
		printf("Seu signo e Capricornio");
	}
	else
	if ((mes == 1 && dia >=21 && dia <=31) || (mes == 2 && dia <=19 && dia >=1)){
		printf("Seu signo e Aquario");
	}
	else
	if ((mes == 2 && dia >=20 && dia <=29) || (mes == 3 && dia <=20 && dia <= 1)){				
		printf("Seu signo e Peixes");
	}	
	else 
	if ((mes == 3 && dia >=21 && dia <=31) || (mes == 4 && dia <=20 && dia >=1)){	
		printf("Seu signo e Aries");
	}	
	else
	if ((mes == 4 && dia >=21 && dia <=30) || (mes == 5 && dia <=20 && dia >=1)){
		printf("Seu signo e Touro");
	}
	else
	if ((mes == 5 && dia >=21 && dia <=31) || (mes == 6 && dia <=20 && dia >=1)){
	printf("Seu signo e Gemeos");
	}
	else
	if ((mes == 6 && dia >=21 && dia <=30) || (mes == 7 && dia <=21 && dia >=1)){
	printf("Seu signo e Cancer");
	}
	else
	if ((mes == 7 && dia >=22 && dia <=31) || (mes ==8 && dia <=22 && dia >=1)){
	printf("Seu signo e Leao");
	}
	else
	if ((mes == 8 && dia >=23 && dia <=31) || (mes == 9 && dia <=22 && dia >=1)){
	printf("Seu signo e Virgem");
	}
	else
	if ((mes == 9 && dia >=23 && dia <=30) || (mes == 10 && dia <=22 && dia >=1)){
	printf("Seu signo e Libra");
	}	
	else
	if ((mes == 10 && dia >=23 && dia <=31) || (mes == 11 && dia <=21 && dia >=1)){
	printf("Seu signo e Escorpiao");
	}
	else
	if ((mes == 11 && dia >=22 && dia <=30) || (mes == 12 && dia <=21 && dia >=1)){
	printf("Seu signo e Sagitario");
	}
	else
	printf("O dia ou o mes informado esta incorreto.");
			
	return 0;
}
