
public class Triangulo implements AreaCalculavel{

	int h;
	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + h * a / 2);
	}

	
}
