
public class Triangulo implements AreaCalculavel{

	int h;
	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + h * a / 2);
	}

	
}
