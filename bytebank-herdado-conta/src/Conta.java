

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	

	//public Conta() {}; construtor padrão ( utilizado na classe ContaCorrente)
	
	
	public Conta(int agencia,int numero,double saldo) {
		
		System.out.println("Criando conta...");
		System.out.println();
		System.out.println("Aguarde...");
		System.out.println();
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
				
	}
	
	public  abstract void deposita(double valor) {}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		}
		return false;
	}
	
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saca(valor)) {
			
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
		
	}

	public double getSaldo() {

		return this.saldo;

	}

	public int getNumero() {
		return this.numero;

	}

	public void setNumero(int numero) {

		if (numero <= 0) {
			System.out.println("Requisição não permitida!");
			return;
		}

		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) { // proibide numero negativos

			System.out.println("Requisição não permitida!");
			return;
		}

		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

}
