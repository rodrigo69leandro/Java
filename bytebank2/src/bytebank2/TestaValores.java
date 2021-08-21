package bytebank2;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(10,025,0.00); // inserir dados ao criar uma conta
		
		
		//conta.setAgencia(-20);
		//conta.setNumero(-21);
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero da conta: " + conta.getNumero());
		System.out.println("Saldo atual: " + conta.getSaldo());
	}

}
