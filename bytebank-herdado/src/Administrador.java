
public class Administrador implements Autenticavel { 

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticacao(int senha) {
		if (this.senha == senha) {
			return true;
		} else
			return false;
	};

	
	@Override
	public double getBonificacao() {
		return 0;
	}

}
