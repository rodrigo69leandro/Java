package bytebank;

public class Conta {

//atributos
	double saldo;
	int agencia;
	int numero;
	String titular;

//metodos

	void deposita(double valor) {

		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor; // Usamos o this dentro de um método para acessar um atributo

			return true;
		} else { // não é obrigatorio inserir o else, uma vez que o return para a execução.
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}

}
