
public class Quadrado implements AreaCalculavel {

	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + a * 2);  //aqui usamos o metodo implemnetado para personalizar e realizar o calculo de acordo a forma
	}

}
