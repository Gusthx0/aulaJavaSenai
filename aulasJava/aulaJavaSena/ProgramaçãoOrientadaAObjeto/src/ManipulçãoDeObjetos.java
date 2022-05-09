
public class ManipulçãoDeObjetos {

	public static void main(String[] args) {
		
		pessoa pessoa1 = new pessoa (); //criando variavel e instanciando o objeto
		System.out.println(pessoa1);
		
		
		pessoa1.nome = "Gustavo";  //dando valor a variavel
		pessoa1.numfigurinhas = 1;
		pessoa1.receber(5);

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		pessoa pessoa2 = new pessoa();
		pessoa2.nome = "Gabriel";
		pessoa2.numfigurinhas = 4;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
		
		pessoa1.dar(2, pessoa2);
		
		System.out.println("depois");
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numfigurinhas);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
 