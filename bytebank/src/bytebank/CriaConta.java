package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(111, 1);
		primeiraConta.deposita(200);
		Conta segundaConta = new Conta(111, 2);
		segundaConta.deposita(50);
		Conta terceiraConta = primeiraConta;

		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(terceiraConta.getSaldo());
		
		
	}

}
