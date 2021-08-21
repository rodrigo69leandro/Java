package bytebank2;

public class TestaGetSet {

	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 123 - nao funciona mais, temos que utilizar os metodos
		conta.setNumero(123);
		System.out.println(conta.getNumero());
		
		
		Cliente rodrigo = new Cliente();
		
		
		rodrigo.setNome("rodrigo");
		
		//conta.titular = rodrigo; 
		conta.setTitular(rodrigo);
	
		 System.out.println(conta.getTitular().getNome()); // exibir o nome do titular da conta rodrigo 
		 
		 conta.getTitular().setProfissao("TI"); // alterar a profissão 
		 System.out.println(conta.getTitular().getProfissao()); // exibir a profissão
	}
	
	
	
}
