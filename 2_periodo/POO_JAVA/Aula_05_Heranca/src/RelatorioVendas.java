
public class RelatorioVendas extends Relatorio {

	@Override
	public String nomeRelatorio() {
		return "Relatório de Vendas";
	}

	@Override
	public void corpoRelatorio() {
		System.out.println("Computador Core I7     R$  4.500,00");
		System.out.println("Monitor Xiaomi 34' 4K  R$  1.200,00");
		System.out.println("SmartPhone Iphone 12   R$ 12.000,00");
	}

}
