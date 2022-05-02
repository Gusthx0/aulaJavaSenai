
public class main {

	public static void main(String[] args) {

//		ContaBancaria conta1 = new ContaBancaria(); 

		// usar a letra maiscula

//			conta1.ativo = true ;
//			
//				conta1.numConta = 222;
//			
//			conta1.saldo = 150.60;
//			
//
//			System.out.println(conta1.ativo);
//			
//		System.out.println(conta1.numConta);
//		
//	System.out.println(conta1.saldo);	
//		
//		conta1.receber(185.70);
//		conta1.dar(50.75);
//		System.out.println(conta1.saldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
//		
		Cliente cliente1 = new Cliente();

		cliente1.setNome("rafa");
		cliente1.setNumConta(222);
		cliente1.setCpf(111);

//		System.out.println(cliente1.getNome());
//		System.out.println(cliente1.getNumConta());
//		System.out.println(cliente1.getCpf());

		System.out.println(cliente1);

		Cliente cliente2 = new Cliente();

		cliente2.setNome("rafa");
		cliente2.setNumConta(222);
		cliente2.setCpf(111 );

		System.out.println(cliente2);
		//cliente1 = cliente2;

		if (cliente1.getNome() == cliente2.getNome()) {
			System.out.println("nome são iguais");
		} else {
			System.out.println("nomes diferentes");
		}
		if (cliente1 == cliente2) {
			System.out.println("objeto são iguais");
		} else {
			System.out.println("objetos diferentes");
		}

		if (cliente1.equals(cliente2)) {
			System.out.println("objeto são iguais");
		} else {
			System.out.println("objetos diferentes");
		}
	}

}
