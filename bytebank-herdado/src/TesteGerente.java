
public class TesteGerente {

	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Irineu");
		g1.setCpf("58915814");
		g1.setSalario(2000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getcpf());
		System.out.println(g1.getSalario());
		
//		g1.setSenha(123);
//		boolean autenticou = g1.autenticacao(123);
//		
//		
//		
//		
//		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	
		
	}
}
