
#include <stdio.h>

int main ()
{
	char sexo;
	float altura;
	int con = 0, homens = 0, mulheres = 0, alt_h = 0;
	sexo = 'c';
	
	while (con < 10)
	{
		while (sexo != 'F' && sexo != 'M')
		{
			printf("Informe o sexo: F ou M   ");
			fflush(stdin);
			scanf("%c", &sexo);
		}
		if (sexo == 'F')
			mulheres = mulheres + 1;
		else
			homens = homens + 1;
								
		printf("Informe a altura: ");
		scanf("%f", &altura);
		
		if (sexo == 'M' && altura > 1.70 && altura < 1.95)
			alt_h = alt_h + 1;
		
		con = con + 1;
		sexo = 'p';
	}
	printf("Quantidade de homens: %i\n", homens);
	printf("Quantidade de mulheres: %i\n", mulheres);
	printf("Quantidade de homens com altura maior que 1.70 e menor que 1.95: %i", alt_h);
	
return 0;	
}
