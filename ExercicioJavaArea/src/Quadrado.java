
public class Quadrado implements AreaCalculavel {

	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + a * 2);
	}

}
