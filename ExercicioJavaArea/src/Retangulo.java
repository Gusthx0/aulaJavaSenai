
public class Retangulo implements AreaCalculavel {

	int alt;
	int lar;
	
	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + alt * lar);
	}

}
