

// new ContaCorrente()
public class ContaCorrente extends Conta{ // extendendo a conta, herdamos os atributos e metodos mas NÃO herdamos os construtores

	
////	public ContaCorrente() {
////		//super(); // Chamada do construtor da superclasse; Não preciso escrever pois é algo implicito no JAVA	
//	}
	
	public ContaCorrente(int agencia,int numero,double saldo) {
		super(agencia, numero, saldo); // utilizando um construtor especifico 
		
	}
	
	
	//reescrever o metodo TRANSFERE para cobrar uma taxa por transferencia
	
	@Override // Usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
		public boolean saca(double valor) {
			
		double valorAsacar = valor + 0.50;
		
			return super.saca(valorAsacar);
		}
	
	
	
}
