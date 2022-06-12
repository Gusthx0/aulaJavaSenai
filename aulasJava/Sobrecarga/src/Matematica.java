
public class Matematica {

	double area(double x, double y) {
		return x * y / 2;
		System.out.println("A área do seu triângulo é:" + area); //aqui um metodo que faz a conta necessaria segundo a forma e um metodo de mesmo nopme que demonstra com uma assinatura dirente o que é a sobregarga de metodos
	}

	int area(int x, int y) {
		if (x == y) {
			return x * x;
		} else {
			return x * y;
		}
	}
}
