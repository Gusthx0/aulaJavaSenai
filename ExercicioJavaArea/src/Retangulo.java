
public class Retangulo implements AreaCalculavel {

	int alt;
	int lar;
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é " + alt * lar); //aqui usamos o metodo implemnetado para personalizar e realizar o calculo de acordo a forma
	}

}
