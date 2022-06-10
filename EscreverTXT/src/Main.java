import java.io.IOException;
import java.io.BufferedWriter; //aqui importamos os metodos que leem e escrevem da classe do java
import java.io.FileWriter;
import java.util.ArrayList;//aqui importamos o array e abaixo o list
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException{ 
		
//		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.TXT"))){

		Mouse mouse0 = new Mouse("true","2","médio"); //aqui nos instanciamos objetos do tipo mouse e declaramos os seus determinados atributos
		Mouse mouse1 = new Mouse("true","2","médio");
		Mouse mouse2 = new Mouse("true","2","médio");
		
		List<Mouse> listademouses = new ArrayList<Mouse>(); //aqui criamos um arraylist chamado lista de mouses que vai receber objetos do tipo mouse
		
		listademouses.add(mouse0);
		listademouses.add(mouse1);
		listademouses.add(mouse2); //aqui adicionamos objetos mouse na arraylist
		
		for (Mouse mouse : listademouses) { //aqui fazemos o  enhanced for, que de forema simples vai prcorrer o arraylist procurando objetos do tipo e depois mostrando no syso abaixo alem de escrever o numero de vezes que o codigo necessita
			System.out.println(mouse);
		
		}
		
		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.TXT"))){ //o bufferedwrite vai escrever a lista de mouses acima e depois o filewriter vai colocar em um arquivo TXT
		 
		for(Mouse mouse : listademouses)  //para cada variavel do tipo mouse ele vai fazer o seguinte comando
			
			
			escrever.write (mouse.toString());  //aqui mouse esta acessando o tostring que sera o propio texto
		
		}
			
		
		}
	}


