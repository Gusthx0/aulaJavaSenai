
public class Triangulo implements AreaCalculavel{

	int h;
	int a;
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + h * a / 2);  //aqui usamos o metodo implemnetado para personalizar e realizar o calculo de acordo a forma
	}

	
}
