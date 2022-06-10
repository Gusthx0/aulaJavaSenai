
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador(); //um objeto sendo instanciado para acessar um mesmo metodo dele
		
		LeiteQuente leiteQuente = new LeiteQuente(); //instancia um objeto do tipo leite que vai usar prteparador para acessar o metod que vai "preparar' a bebida
		preparador.preparaBebida(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();//faqz o mesmo que o de cima
		preparador.preparaBebida(refrigerante);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
