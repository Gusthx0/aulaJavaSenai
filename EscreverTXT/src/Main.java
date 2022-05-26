import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException{ 
		
//		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.TXT"))){

		Mouse mouse0 = new Mouse(true,2,"médio");
		Mouse mouse1 = new Mouse(false,0,"pequeno");
		Mouse mouse2 = new Mouse(true,6,"grande");
		
		List<Mouse> listademouses = new ArrayList<Mouse>();
		
		listademouses.add(mouse0);
		listademouses.add(mouse1);
		listademouses.add(mouse2);
		
		for (Mouse mouse : listademouses) {
			System.out.println(mouse);
		
		}
		
		try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.TXT"))){
		 
		for(Mouse mouse : listademouses)
			
			escrever.write (mouse.toString());
		
		}
			
		}
	}


