import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Importa Biblioteca
		Scanner entrada = new Scanner(System.in);

		// Declara a vari�vel valor para fazer a transa��o do pix
		float valor = 0;

		// Chama as classes
		Cliente cliente = new Cliente();
		Pix pix = new Pix();

		// Execu��o do programa
		System.out.println("Insira a quantia que voc� deseja dar: ");
		valor = entrada.nextFloat();

	}

}
