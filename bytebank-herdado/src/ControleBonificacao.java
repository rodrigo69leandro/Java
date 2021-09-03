
public class ControleBonificacao {

	
	private double soma;
	
	public void registra(Funcionario f) { // Utilizando a referencia generica - polimorfismo +- inventar um codigo generico e utilizar em qualquer lugar
										  // Referências de tipos de classes mais genéricas referenciam objetos mais específicos.
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	public double getSoma() {
		return soma;
	}
	
}
