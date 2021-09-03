
public class TesteReferencias {

	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(); // podemos utilizar uma classe mais generica pois todo gerente é um 
										//funcionario (não podemos fazer o contrario pois nem todo funcionario é um gerente).
		g1.setNome("Romana");
		String nome = g1.getNome();
		g1.setSalario(5000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
	}
}
