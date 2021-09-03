//acessivel para algumas pessoas
public class SistemaInterno {

	private int senha = 123;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autenticacao(this.senha);
		
		if(autenticou) {
			System.out.println("Permissão concedida");
					
		}
		else {
			
			System.out.println("Permissão negada!!");
		}
		
				
	}
	
	
}
