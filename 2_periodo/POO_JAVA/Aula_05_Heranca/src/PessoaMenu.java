
public class PessoaMenu extends Pessoa implements Menu{

	@Override
	public void incluir() {
		System.out.println("Incluir Pessoa: " + getNome());
		
	}

	@Override
	public void listar() {
		System.out.println("Listar Pessoa: " + getNome());
		
	}

	@Override
	public void alterar() {
		System.out.println("Alterar Pessoa: " + getNome());
		
	}
	
	@Override
	public void excluir() {
		System.out.println("Excluir Pessoa: " + getNome());
		
	}
	
	
}
