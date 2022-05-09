
public class Preparador {

	public void preparaBebida(bebida bebida) {
		
		System.out.println("PREPARANDO A BEBIDA " + bebida.getName());
		
		bebida.preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("AQUECENDO A BEBIDA " + bebida.getName());
			
		}
		
		System.out.println("PREPARADO COM SUCESSO!!! \n");
	   
	
	   }
	
	
	
	
	
	
	
}
