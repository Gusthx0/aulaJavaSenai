public class Refrigerante extends bebida {

	public Refrigerante() {
		
		
	super("Refrigerante", false);
		
	}

	@Override
	public void preparar() {
		
	    super.preparar();
		
		System.out.println("colocando gelo");
		
		System.out.println("colocando o refrigerante");
		
	}

}
