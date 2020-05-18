
#include <stdio.h>
#include <conio.h>

int main ()
{
	float horas, minutos, segundos, milesimo;
	char conversao;
		
	printf("Informe a quantidade de horas: ");
	scanf("%f", &horas);
			
	if (horas >=0)
		{	
			printf("Informe o tipo de conversao:\n m - minutos\n s - segundos\n d - milesimo de segundos\n ");
			scanf(" %c", &conversao);
			
					if (conversao == 'm')
						{
							minutos = horas * 60;
							printf("\nA hora informada equivale a %.2f minutos", minutos);
						}
			        else 
						if (conversao == 's')
							{
								segundos = horas * 1200;
								printf("\nA hora informada equivale a %.2f segundos", segundos);		
							}
						else	
							if (conversao == 'd')
								{			
									milesimo = horas * 3600000;
									printf("\nA hora informada equivale a %.2f milesimo de segundos", milesimo);			
								}			
			        		else
				        			printf("\nConversao nao possivel em razao do tipo de conversao ser inexistente.");	
		}
	else
		printf("Conversao nao possivel em razao da quantidade de horas ser negativa.");
		
	getch();
	return 0;
}
