
public class Matematica {

	double area(double x, double y) {
		return x * y / 2;
		System.out.println("A �rea do seu tri�ngulo �:" + area);
	}

	int area(int x, int y) {
		if (x == y) {
			return x * x;
		} else {
			return x * y;
		}
	}
}
