import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.TXT"))){  //esta lendo e colocando em um arq txt
			String line;
			String string ="";
			
			while ((line = reader.readLine())!= null) {   //enquanto line for diferente de vazio,e line recebe o arq de leitura,faca
				string += line + "\n";
				
				
			}
			System.out.println(string);
		}

		
	}
	}
