package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaRodrigo = new Conta();

		contaRodrigo.saldo = 1000000;

		contaRodrigo.deposita(50);

		System.out.println(contaRodrigo.saldo);

		contaRodrigo.saca(20);

		System.out.println(contaRodrigo.saldo);

		Conta contaRaquel = new Conta();
		contaRaquel.deposita(100000);

		contaRaquel.transfere(200, contaRodrigo);

		System.out.println(contaRaquel.saldo);
	}

}
