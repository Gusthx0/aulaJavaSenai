
public class Aplicacao {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(); //instanciando objetos do tipo evidente (triangulo,quadrado e retangulo)
		Retangulo retangulo = new Retangulo();
		Quadrado quadrado = new Quadrado();
		
		quadrado.a = 3;
		triangulo.h = 9;
		triangulo.a = 3;
		retangulo.alt = 5; //acessando atraves dos objetos as variaveis e declarando qual o seu valor
		retangulo.lar = 10;
		
	}

}
