
#include <stdio.h>
#include <conio.h>

int main ()
{
int horas, resposta;
char tipo;

printf("Informe a quantidade de horas: ");
scanf("%i", &horas);

if (horas < 0)
	printf("Quantidade de horas nao pode ser negativa.");
else
	printf("Informe o tipo de conversao m/s/d: ");
	scanf(" %c", &tipo);	
	
	switch (tipo)
	{
		case 'M':
		case 'm': 	resposta = horas * 60;
					printf("%i hs convertido em minutos = %i", horas, resposta);
					break;
		case 'S':
		case 's':	resposta = horas * 3600;
					printf("%i hs convertido em segundos = %i", horas, resposta);
					break;
		case 'D':
		case 'd':	resposta = horas * 3600000;
					printf("%i hs convertido em milesimo = %i", horas, resposta);
					break;
		default: 	printf("Operacao invalida.");
	}
	
getch();
return 0;	
	
}




