
public class Quadrado implements AreaCalculavel {

	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + a * 2);
	}

}
