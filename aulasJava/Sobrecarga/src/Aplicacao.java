import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Matematica matematica = new Matematica();
		
		
		System.out.println("�rea dos pol�gonos");
		System.out.println("Digite a altura do pol�gono");
		int x = valor.nextInt();
		System.out.println("Digite a largura do pol�gono");
		int y = valor.nextInt();
		
		int areaQ = matematica.area(x,y);
		
		double areaT = matematica.area(x,y);
		
		int areaR = matematica.area(x,y);
		
		System.out.println("");
		System.out.println("A �rea do quadrado �: " + areaQ);
		System.out.println("A �rea do tri�ngulo �: " + areaT);
		System.out.println("A �rea do ret�ngulo �: " + areaR);
	}

}
