

public class Gerente extends Autenticavel  {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticacao(int senha){
		if(this.senha == senha) {
			return true;
		}
		else
			return false;
	};
	
	
////	public double getBonificacao() {
////		return super.getBonificacao() + super.getSalario; // super, indica que o salario está definido na classe mãe
////	} -- Para que funcione assim, é necessario utilizar o PROTECTED em SALARIO na classe funcionario mas não é uma boa maneira de realizar
//	pois podemos utilizar os metodos para acessar o salario e assim ter mais segurança.
	
	public double getBonificacao() {
		return super.getSalario(); // super, indica que o salario está definido na classe mãe
	}
	
}