public class ContaBancaria {

	
	private int numConta;
	private boolean ativo;
	private double saldo;
	

	public ContaBancaria () {   //aqui mopstramos o status da conta e oslado
		ativo = true;
		saldo =1.0;
	}

	public ContaBancaria (boolean ativo, double saldo) {  //aqui é para quando formos instanciar um objeto do tipo,termos o acesso a ativop e saldo
		this.ativo = ativo;
		this.saldo = saldo;
	}
	
	
	public void receber( double valor) {  //metodo que soma o uma variavel(opu atributo agora eu realmente não consigo lembrar) a outra
		saldo += valor ;
	}
	
	public double saldo () {
		return saldo;
	}
	
	public void dar (double valor) { //aqui umque subtrai
		if (saldo >= valor)
		saldo -= valor;
	}	
}
