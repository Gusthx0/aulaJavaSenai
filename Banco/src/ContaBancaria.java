
public abstract class ContaBancaria {

	private int saldo;
	
	public void depositar (double saldo) {
		
		System.out.println( saldo + 5);
		
	}
	
	public void sacar (double saldo) {
	   
		System.out.println(saldo - 10);
		
	}
	
	public void transferir (ContaBancaria saldo) {
		
	}
		
	public void CalcularSaldo() {

	}
	
	//é uma classe abstrata ou interface
	//interfaces somente ass. metodos
	//mod de acss protecd para as classe que extender dela
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
