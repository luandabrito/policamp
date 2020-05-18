#include <stdio.h>

int main ()
{
	float h_trab, sal_min, sal_bruto, sal_rec, v_hora, imposto; 
	
	printf("Informe o numero de horas trabalhadas: ");
	scanf("%f", &h_trab);
	printf("Informe o valor do salario minimo: ");
	scanf("%f", &sal_min);
	
	v_hora = sal_min / 2;
	sal_bruto = v_hora * h_trab;
	imposto = sal_bruto * 0.03;
	sal_rec = sal_bruto - imposto;
	
	printf("Salario a receber = %.2f", sal_rec);
	
	return 0;	
	
}
