#include <stdio.h>

int main() 
{
// variáveis
	float n1, n2, n3, media, n_exame;
	
// entrada de dados
	printf("Informa a primeira nota: ");
	scanf("%f", &n1);
	printf("Informa a segunda nota: ");
	scanf("%f", &n2);
	printf("Informa a terceira nota: ");
	scanf("%f", &n3);
	
// cálculos
	media = (n1 + n2 + n3) / 3;
	n_exame = 12 - media;

//saída de dados
	printf("Media: %.2f", media);
	
	if ((media >=0) && (media <3))
		printf("\nReprovado");
	
	if((media >=3) && (media <7))
	{
		printf("\nExame");
		printf("\nNota necessaria no exame para aprovacao: %.2f", n_exame);
    }	
    if((media >=7) && (media <=10))
		printf("\nAprovado");
    
	return 0;
}
