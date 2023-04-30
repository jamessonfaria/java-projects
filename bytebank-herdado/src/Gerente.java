
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
