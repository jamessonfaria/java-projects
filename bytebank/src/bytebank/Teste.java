package bytebank;

public class Teste {

	public static void main(String[] args) {

		Cliente joao = new Cliente();
		joao.setCpf("123123");
		joao.setNome("Joao Paulo");
		joao.setProfissao("Programador");
		
		Conta contaJoao = new Conta(111, 1);
		contaJoao.setTitular(joao);
		contaJoao.deposita(400);
		System.out.println(contaJoao.getSaldo());
		System.out.println(contaJoao.saca(200));
		System.out.println(contaJoao.getSaldo());
		
		Conta contaMarcela = new Conta(111, 2);
		contaMarcela.deposita(1000);
		contaMarcela.setTitular(new Cliente());
		contaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaMarcela.getTitular().getNome());

		Conta novaConta = new Conta(222, 2);
		
		boolean sucessoTransferencia = contaMarcela.transfere(3000, contaJoao);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Tranferencia nao realizada");
		}
		
		System.out.println("Saldo marcela: " + contaMarcela.getSaldo());
		System.out.println("Saldo " + contaJoao.getTitular().getNome() + " : " + contaJoao.getSaldo());
		
		System.out.println("Total de Contas: " + Conta.getTotalContas());		
		
	}

}
