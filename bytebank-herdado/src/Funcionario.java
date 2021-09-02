
public class Funcionario {

	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	};// JAVA cria automaticamente, portanto não é necessario quando se tem apenas um construtor.
	
	public double getBonificacao() {
		return this.salario  * 0.05;
	}
	
	public String getNome() {
		return nome;
	};
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public String getcpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	
}
