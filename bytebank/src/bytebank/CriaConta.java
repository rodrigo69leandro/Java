package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		primeiraConta.agencia = 10;
		primeiraConta.numero = 10;
		primeiraConta.titular = "Rodrigo Leandro";

		primeiraConta.saldo += 100;

		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("numero: " + primeiraConta.numero);
		System.out.println("titular: " + primeiraConta.titular);

		System.out.println("===================");

		Conta segundaConta = new Conta();

		segundaConta.saldo = 850;
		segundaConta.agencia = 0001;
		segundaConta.numero = 100;
		segundaConta.titular = "Raquel Romana";

		primeiraConta.saldo += 100;

		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("numero: " + segundaConta.numero);
		System.out.println("titular: " + segundaConta.titular);

	}

}
