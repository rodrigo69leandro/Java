package bytebank2;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente();
		
		rodrigo.nome = "Rodrigo Leandro";
		rodrigo.cpf = "123.456.78-09";
		rodrigo.profissao = "TI";
		
		Conta contaRodrigo = new Conta();
		contaRodrigo.deposita(600);
		
		contaRodrigo.titular = rodrigo;
	
		
		System.out.println(contaRodrigo.titular.nome);
	}
}
