// Emanoelle Luanda F. S. Brito - RA 2019740696

#include <stdio.h>

int main()
{
	int dia, mes, ano;
	char a, b;
	
	printf("Informe o dia, mes e ano: ");
	scanf("%i %c %i %c %i", &dia, &a, &mes, &b, &ano);
	
	switch (mes)
	{
		case 1:
			if (dia >= 1 && dia <= 31)
				printf("%i de janeiro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 2:
			if (dia >= 1 && dia <= 29)
				printf("%i de fevereiro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 3:
			if (dia >= 1 && dia <= 31)
				printf("%i de marco de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 4:
			if (dia >= 1 && dia <= 30)
				printf("%i de abril de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 5:
			if (dia >= 1 && dia <= 31)
				printf("%i de maio de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 6:
			if (dia >= 1 && dia <= 30)
				printf("%i de junho de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 7:
			if (dia >= 1 && dia <= 31)
				printf("%i de julho de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 8:
			if (dia >= 1 && dia <= 31)
				printf("%i de agosto de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 9:
			if (dia >= 1 && dia <= 30)
				printf("%i de setembro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 10:
			if (dia >= 1 && dia <= 31)
				printf("%i de outubro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 11:
			if (dia >= 1 && dia <= 30)
				printf("%i de novembro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		case 12:
			if (dia >= 1 && dia <= 31)
				printf("%i de dezembro de %i", dia, ano);
			else
				printf("Dia invalido.");
			break;
		default:
			printf("Mes invalido.");
	}
return 0;
}
