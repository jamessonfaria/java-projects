package bytebank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;
		
	public Conta(int agencia, int numero) {
		totalContas++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		System.out.println("Estou criando a conta " + numero + " na agencia " + agencia);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saca(valor)){
			contaDestino.deposita(valor);
			return true;
		}
		
		return false;
	}

	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
