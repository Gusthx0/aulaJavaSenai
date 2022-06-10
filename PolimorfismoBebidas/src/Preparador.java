
public class Preparador {

	public void preparaBebida(bebida bebida) { //aqui o metodo generico que vai servi para todas as bebidas 
		
		System.out.println("PREPARANDO A BEBIDA " + bebida.getName()); //como elel recebe bebida como parametro todas podem acessa-lo
		
		bebida.preparar(); //como sera acessado
		
		if (bebida.isAquecer()) {
			System.out.println("AQUECENDO A BEBIDA " + bebida.getName()); //aqui um if pra caso a bebida seja quente como é o caso do leite
			
		}
		
		System.out.println("PREPARADO COM SUCESSO!!! \n");
	   
	
	   }
	
	
	
	
	
	
	
}
