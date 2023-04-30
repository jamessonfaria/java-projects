
public class ContaCorrente extends Conta {

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 1;
	}
	
}
