
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1320, 258, 0);
		cc.deposita(100);
	
	
		ContaPoupanca cp = new ContaPoupanca(2360, 963, 0);
		cp.deposita(20);
		
		cc.transfere(10, cp);
	
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	
	}
}
