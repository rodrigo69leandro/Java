package bytebank2;

public class Conta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo+= valor;
	}
	
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;
		}
		return false;
	}
	
	
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	
	public int getNumero() {
		return this.numero;
		
	}
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	
	}
	
}
