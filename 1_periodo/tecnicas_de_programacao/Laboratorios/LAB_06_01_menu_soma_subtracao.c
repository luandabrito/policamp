#include <stdio.h>
#include <conio.h>

int main ()
{
	int escolha, a, b, resul;
	
	do
	{
		printf("\t\tMENU\n\n \t 1-Soma\n\n \t 2-Subtrai\n\n \t 3-Sair\n\n \tOpcao escolhida:");
		scanf("%i", &escolha);
		
		if (escolha == 1 || escolha == 2)
		{	
			printf("\nInforme o primeiro numero: ");
			scanf("%i", &a);
			printf("\nInforme o segundo numero: ");
			scanf("%i", &b);
		}
			
		switch (escolha)
		{
		case 1: resul = a + b; printf("\nResultado: %i", resul); break;
		case 2: resul = a - b; printf("\nResultado: %i", resul); break;
		case 3: ; break;
		default: printf("\nOpcao invalida.");
		}
							
		getch();
		system("cls");
				
	} while (escolha != 3);
	return 0;
}
