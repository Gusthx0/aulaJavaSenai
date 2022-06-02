import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Aplicacao  {

	public static void main(String[] args) throws IOException{

		List<Pessoa> lista = new ArrayList<Pessoa>();

		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade");
			pessoa.setIdade(teclado.nextInt());

			System.out.println("Escolha o gênero: 1- Masculino,2-Feminino");
			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				
				opcao = teclado.nextInt();
				
				if (opcao == 2)
					pessoa.setSexo(Sexo.MASCULINO);

				else if (opcao == 1)
					pessoa.setSexo(Sexo.MASCULINO);
				else {
					System.out.println("errado");
					System.out.println("masculino =1 e feminino =2");
					
			}
			}

			System.out.println("Digite sua rua");
			pessoa.getEndereco().setRua(teclado.next());

			System.out.println("Digite apenas o numero da casa");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			System.out.println("Digite seu bairro");
			pessoa.getEndereco().setBairro(teclado.next());
			
			
			try(BufferedWriter escrever = new BufferedWriter (new FileWriter("Entrada.TXT"))){
				 
				for(Pessoa a : lista)
					
					
					escrever.write (pessoa.toString());
				
		   
				
				}
			

		}

	}

}
