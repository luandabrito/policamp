#include <stdio.h>

char lerResposta() {
	
	char respostaInterna;
	printf("%c", respostaInterna);

	while(!(respostaInterna == 's' || respostaInterna == 'S' || respostaInterna == 'n' || respostaInterna == 'N')){
		scanf(" %c", &respostaInterna);
	}
	
	return respostaInterna;
}
 

int main ()
{
	char resposta;
	
	printf("Pense em um dos animais abaixo e responda as perguntas. \nleao, cavalo, homem, macaco, morcego, baleia, avestruz, \npinguim, aguia, tartaruga, crocodilo e cobra.");
	printf("\n\nAgora responda: \nE mamifero? sim ou nao\n");
	resposta = lerResposta();
	
	if (resposta == 'S' || resposta == 's')
	{
		printf("E quadrupede?\n");
		resposta = lerResposta();
		
		if (resposta == 'S' || resposta == 's')
		{	
			printf("E carnivoro?\n");
			resposta = lerResposta();
			
			if (resposta == 'S' || resposta == 's')
				printf("O animal escolhido foi o Leao.");
			else
				printf("O animal escolhido foi o Cavalo.");
		}
		else
		{	
			printf("E Bipede?\n");
			resposta = lerResposta();
				
			if (resposta == 'S' || resposta == 's')
			{	
				printf("E onivoros?\n");
				resposta = lerResposta();
				
				if (resposta == 'S' || resposta == 's')
					printf("O animal escolhido foi o Homem.");
				else
					printf("O animal escolhido foi o Macaco.");
			}
			else
			{	
				printf("E voador?\n");
				resposta = lerResposta();
						
				if (resposta == 'S' || resposta == 's')
					printf("O animal escolhido foi o Morcego.");
				else
					printf("O animal escolhido foi a Baleia.");
			}
		}			
	}
	else
	{
		printf("E ave?\n");
		resposta = lerResposta();
			
		if (resposta == 'S' || resposta == 's')
		{	
			printf("E nao-voador?\n");
			resposta = lerResposta();
			
			if (resposta == 'S' || resposta == 's')
			{	
				printf("E tropical?\n");
				resposta = lerResposta();
				if (resposta == 'S' || resposta == 's')
					printf("O animal escolhido foi o Avestruz.");
				else
					printf("O animal escolhido foi o Pinguim.");
			}
			else
			{	
				printf("E nadadora?\n");
				resposta = lerResposta();
				
				if (resposta == 'S' || resposta == 's')
					printf("O animal escolhido foi o Pato.");
				else
					printf("O animal escolhido foi a Aguia.");
			}
		}
		else
		{	
			printf("\nEntao e um reptil.\n");
			printf("Tem casco?\n");
			resposta = lerResposta();
				
			if (resposta == 'S' || resposta == 's')
				printf("O animal escolhido foi a Tartaruga.");
			else
			{	
				printf("E carnivoro?\n");
				resposta = lerResposta();
				
				if (resposta == 'S' || resposta == 's')
					printf("O animal escolhido foi o Crocodilo.");
				else
					printf("O animal escolhido foi a Cobra.");
			}
		}
	}
	return 0;
}
