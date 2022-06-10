
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
	
	//a classa abstrata é aquela que não pode ter um objeto instanciado apartir dela e é uma classe extremamente generica
	//é uma classe abstrata ou interface
	//interfaces somente ass. metodos
	//visualização protecd para a classe que extender dela
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
