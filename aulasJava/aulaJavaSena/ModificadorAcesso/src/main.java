
public class main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(); //usar a letra maiscula
	
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

		cliente1 cliente1 = new cliente1();
		
        cliente1.setNome("Rafael");
        cliente1.setCpf(1234);
        cliente1.setNum(333);
        
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNum());
        
        System.out.println(cliente1);
        
        cliente1 cliente2 = new cliente1();
        
        cliente2.setNome("Rafael");
        cliente2.setCpf(12345);
        cliente2.setNum(333);
        
        System.out.println(cliente2);
        
//        cliente1 = cliente2;
        //faz os objetos serem iguais
         //cliente1 == cliente2
        //faz darem diferentes
        
        if (cliente1.getNome() == cliente2.getNome()) {  //compara se os nomes são iguais  
         System.out.println("Os objetos são iguais");
        }else {
        	System.out.println("Os objetos são diferentes");
        }
        
        if (cliente1 == cliente2) {     
            System.out.println("Os objetos são iguais");
           }else {
           	System.out.println("Os objetos são diferentes");
        }
        
        //equals serve para comparar atributos.
        if(cliente1.equals(cliente2)) {
        	System.out.println("Os objetos são iguais");
        }else {
        	System.out.println("Os atributos dos objetos são diferentes");
        }
        
        
        
	}

}
