
public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cli = new Cliente();
		cli.setSenha(11233);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(g);
		sistema.autentica(adm);
		sistema.autentica(cli);
	}

}
