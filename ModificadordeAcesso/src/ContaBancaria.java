
public class ContaBancaria {
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	public ContaBancaria() {
		ativo = true;
		saldo = 1000;
		}

	
	public ContaBancaria(boolean ativo, double saldo) {
		super();			//serve para chamar o construtor da super classe
		this.ativo = ativo;		//esse daqui é para acessar exatamente desse modo com o ponto
		this.saldo = saldo;
	}

	public void receber(double valor) {
		saldo += valor;
		
	}
	
	public double saldo() {

		return saldo;
	}

	
	public void dar (double valor) {
		if(saldo >= valor)
		saldo -= valor; 
	}
	


}
