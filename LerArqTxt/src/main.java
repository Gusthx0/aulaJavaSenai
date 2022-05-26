import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.TXT"))){
			String line;
			String string ="";
			
			while ((line = reader.readLine())!= null) {
				string += line + "\n";
				
			}
			System.out.println(string);
		}

		
	}
	}