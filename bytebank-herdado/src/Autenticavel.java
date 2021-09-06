
public abstract interface  Autenticavel {
	
	
//	DENTRO DE UMA INTERFACE, NÃO PODE TER NADA CONCRETO!
//	private int senha;

	public abstract void setSenha(int senha);
//		this.senha = senha; 
	

	public abstract boolean autenticacao(int senha);
//		if (this.senha == senha) {
//			return true;
//		} else
//			return false;


	double getBonificacao();
	}

