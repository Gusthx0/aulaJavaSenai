
public class main {

	public static void main(String[] args) {
	
		ContaBancaria conta1 = new ContaBancaria(true, 3000);
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		
		//conta1.receber(150.8);
		//conta1.dar(50.8);
		System.out.println((conta1.saldo()));
	
		ContaBancaria conta2 = new ContaBancaria();
		System.out.println((conta2.saldo()));
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Anna");
		cliente1.setCpf(9999999);
		cliente1.setNumConta(333333);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1.toString());
		
		Cliente cliente2= new Cliente();
		cliente2.setNome("Anna");
		cliente2.setCpf(22222222);
		cliente2.setNumConta(444444);
		
		System.out.println(cliente2);
		
		if(cliente1.getNome() == cliente2.getNome()) {
			System.out.println("os nomes são iguais");
		}else {
			System.out.println("os nomes são diferentes");
		}
		if(cliente1.equals(cliente2));{
			System.out.println("os objetos são iguais");} 
		else{
			System.out.println("os objetos são diferentes");
		}
		
	}

}