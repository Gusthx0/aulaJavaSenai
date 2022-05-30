import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
	
List<Pessoa> lista = new ArrayList<Pessoa>();
		
		Scanner teclado =  new Scanner (System.in);
		
		for (int x = 0; x < 4;x++) {
		
		Pessoa pessoa = new Pessoa(); 
		
		System.out.println("Digite seu nome");
		pessoa.setNome(teclado.next());
		
		System.out.println("Digite sua idade");
		pessoa.setIdade (teclado.nextInt());
		
		System.out.println("Digite seu endereço");
		pessoa.getEndereco().setRua(teclado.next());
		
		System.out.println("Digite seu endereço");
		pessoa.getEndereco().setNumero (teclado.nextInt());
		
		System.out.println("Digite seu endereço");
		pessoa.getEndereco().setBairro(teclado.next());
		
		}

	}

}
