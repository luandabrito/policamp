#include <stdio.h>

int main(void) 
{
	float n_laboratorio, a_semestral, e_final, media;
	
	printf("Informe a nota do Trabalho de Laboratorio: ");
	scanf("%f", &n_laboratorio);
	printf("Informe a nota da Avaliacao Semestral: ");
	scanf("%f", &a_semestral);
	printf("Informe a nota do Exame Final: ");
	scanf("%f", &e_final);
	
	media = (n_laboratorio * 2 + a_semestral * 3 + e_final * 5) / 10;

	printf("\nMedia ponderada: %.2f", media);
	if ((media >= 8) && (media <=10))
	printf("\nObteve conceito A");
	if ((media >=7) && (media <8))
	printf("\nObteve conceito B");
	if ((media >=6) && (media <7))
	printf("\nObteve conceito C");
	if ((media >=5) && (media <6))
	printf("\nObteve conceito D");
	if ((media >=0) && (media <5))
	printf("\nObteve conceito E");	
	
	return 0;
	
}
