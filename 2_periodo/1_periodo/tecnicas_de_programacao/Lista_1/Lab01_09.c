#include <stdio.h>

int main(void) 
{
// vari�veis
	float sal_liquido, sal_bruto, v_hora, n_horas, d_inss, desconto;
	
// entrada de dados
	printf("Informe o valor da hora trabalhada: ");
	scanf("%f", &v_hora);
	
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%f", &n_horas);
	
	printf("Informe a alicota de desconto do INSS: ");
	scanf("%f", &d_inss);
	
// c�lculos
	sal_bruto = v_hora * n_horas;
	sal_liquido = sal_bruto - sal_bruto * d_inss / 100 ;
	
// sa�da de dados
	printf("\nSalario liquido: %.2f", sal_liquido);
	
	return 0;
		
}
