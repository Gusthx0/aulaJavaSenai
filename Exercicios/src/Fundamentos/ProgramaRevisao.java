package Fundamentos;
import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner(System.in);
		
		int x = 0 ;
		while( x < 2){
			
			Pessoa pessoa = new Pessoa (); 
			
			System.out.println("Digite seu nome");
			pessoa.setNome(teclado.next());
			
			System.out.println("Digite seu cpf");
			pessoa.setCpf(teclado.nextInt());
		   
			System.out.println("Digite seu salário");
			pessoa.setSalario(teclado.nextInt());
			
			
			
			
		}
	
		
		
		
		
		
		
		
//----------------------calculadora---------------------------------		
//		Scanner digite = new Scanner (System.in) ;
//		
//		Calculadora calculadora = new Calculadora();
//		
//		System.out.println("Digite o valor");
//		calculadora.item = (digite.nextDouble());
//	
//		System.out.println("Digite o valor do desconto");
//		calculadora.desct = (digite.nextDouble());
//		
//	    calculadora.Calcular();
	}
	}

	






























