#include <stdio.h>

int main()
{
	float altura_degrau, objetivo, quant_degraus;
	
	printf("Informe a altura dos degraus em cm: ");
	scanf("%f", &altura_degrau);
	printf("Informa a altura que deseja subir em cm: ");
	scanf("%f", &objetivo);
	
	quant_degraus = objetivo / altura_degrau;
	
	printf("Quantidade de degraus a subir: %.2f", quant_degraus);
	
	return 0;
	
}
