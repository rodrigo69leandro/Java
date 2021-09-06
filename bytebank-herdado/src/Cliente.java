
public class Cliente implements Autenticavel{

	
		private AutenticacaoUtil autenticador;
	
	
	public Cliente(){
		this.AutenticacaoUtil = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
