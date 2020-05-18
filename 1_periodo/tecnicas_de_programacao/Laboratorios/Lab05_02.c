
int main()
{
	int quant, soma = 0, con = 0, n;
	
	do
	{
		printf("Informe a quantidade de numeros que sera lida: ");
		scanf("%i", &quant);
	}			
	while (quant < 0);
	
	while (con < quant)
	{
		printf("Informe o numero: ");
		scanf("%i", &n);
		
		soma = soma + n;
		con = con + 1;		
	}
		
	printf("Soma dos numeros: %i ", soma);
return 0;	
	
}
