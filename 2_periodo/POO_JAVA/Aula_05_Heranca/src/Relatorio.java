
public abstract class Relatorio {
	private String data;
	
	public void gerarRelatorio() {
		System.out.println("--------------------------");
		System.out.println("SONIC - " + nomeRelatorio());
		System.out.println("--------------------------");
		corpoRelatorio();
		System.out.println("--------------------------");
		System.out.println("SONIC - FIM " + data);
		System.out.println("--------------------------");
		
	}
	
	public abstract String nomeRelatorio();
	
	public abstract void corpoRelatorio();

	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
