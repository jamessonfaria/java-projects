package br.com.bytebank.banco.modelo;

/**
 * Classe que representa o abstract Conta
 * 
 * @author jamesson
 * @version 0.1
 * 
 */

public abstract class Conta implements Comparable<Conta> {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    
    /**
     * Construtor para inicializar o objeto Conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
       // System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
       // this.saldo = 100;
       // System.out.println("Estou criando uma conta " + this.numero);
    }

    /**
     * Metodo deposita precisa ser implementado pelas classes que herdem
     * @param valor
     */
    public abstract void deposita(double valor);

    /**
     * Metodo saca padrao utilizado
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor + " ### Saldo Insuficiente... ###");
        }
        
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);  
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agencia: " +
				this.agencia + ", Cliente: " + this.getTitular().getNome() +
				", Saldo: " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta conta = (Conta) obj;
		if(this.getAgencia() != conta.getAgencia() ||
				this.getNumero() != conta.getNumero())
			return false;
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
}