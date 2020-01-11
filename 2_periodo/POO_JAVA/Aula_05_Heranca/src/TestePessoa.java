
public class TestePessoa {

	public static void main(String[] args) {
		PessoaMenu pm = new PessoaMenu();
		pm.setNome("Maria");
		pm.acordar();
		pm.listar();
		pm.incluir();
		
		Menu m = new PessoaMenu();
		// m.acordar(); // Pertence a Pessoa
		m.listar();
		m.incluir();
		
		Pessoa p = new PessoaMenu();
		p.acordar();
		// p.listar(); // Pertence ao Menu
		
		
	}

}
