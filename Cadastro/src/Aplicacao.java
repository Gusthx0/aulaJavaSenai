import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Aplicacao  {	

	public static void main(String[] args) throws IOException{

		List<Pessoa> lista = new ArrayList<Pessoa>();	//usei o programa do misael como forma de correcao para o meu pela forma como estava similar,mas comentariops e afins sao meus e desculpe a falta de pontuacao, meu gato jogou meu teclado no chao e agora as teclas estao confusas
		List<Pessoa> lista2 = new ArrayList<Pessoa>();
		
		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa(); //aqui esta sendo instaciado um obj do tipo pessoa e abaixo estamos usando pessoa ponto set endereco para acessar e gerar um objeto do tipo endereeco
			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome");
			pessoa.setNome(teclado.next()); //apenas acessando os atributos de pessoa para poder declarar

			System.out.println("Digite sua idade");
			pessoa.setIdade(teclado.nextInt()); //usando nextint para inteiro

			System.out.println("Escolha o gênero: 1- Masculino,2-Feminino");
			int opcao = 0; //aqui a intencao era criar um laco de repeticao que desse apenas duas opcoes ao usuario e que aparecesse uma mensagem de erro caso ele digitasse outro numero,a principio eu pensei em fazer isso na classe pessoa mas nao consegui finalizar o teste pra ssaber se ia ou nao dar erro
			while (opcao != 1 && opcao != 2) {
				
				opcao = teclado.nextInt(); //esse aqui iria receber a resposta
				
				if (opcao == 2)  //aqui ele acessa atraves de pessoa o sexo masculino e feminino
					pessoa.setSexo(Sexo.MASCULINO);

				else if (opcao == 1)
					pessoa.setSexo(Sexo.MASCULINO);
				else {
					System.out.println("errado"); //como e uma estrutura de repeticao que vai mostrar que existe um erro,temos o else no final
					System.out.println("masculino =1 e feminino =2");
					
			}
			}

			System.out.println("Digite sua rua");  //aqui nos acessamos endereco e puxamos o atributo que e necessario e fazemos com os outros
			pessoa.getEndereco().setRua(teclado.next());

			System.out.println("Digite apenas o numero da casa");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			System.out.println("Digite seu bairro");
			pessoa.getEndereco().setBairro(teclado.next());
			
			lista.add(pessoa); //essa daqui foi uma das partes que peguei do programa dele pois esqueci que deveria adicionar as pessoa num list antes de fazer a leitura desse list
			
			for (Pessoa p : lista) {    //essa parte aqui eu peguei do programa do misael
				//ele funciona como se estivesse fazendo o seguinte "para cada obj do tipo pessoa em lista de pessoas faca o codigo abaixo"
			System.out.println("Cadastros: ");
			System.out.println(p);
			System.out.println("");

		}
			
			//essa parte do codigo e meu 
			try(BufferedWriter escrever = new BufferedWriter (new FileWriter("lista.txt"))){ 
				for(Pessoa a : lista) //o famoso enhanced for que para cada objeto do tipo pessoa de lista vai fazer o codigo abaixo
				
				escrever.write (pessoa.toString());  //ele vai ler o tostring e escrever num txt
				}
			//aqui o o buffereader vai ler o txt criado acima
			try (BufferedReader reader = new BufferedReader(new FileReader("lista.txt"))) {
			String linha;

			while ((linha = reader.readLine()) != null) { //traduzindo pelo que eu entendi ele vai funciona assim, enquanto linha(que vai receber os objetos de list) for
				//diferente de vazio faca um novo obj. para pessoa e adicione em uma nova lista

				Pessoa pessoa = new Pessoa(linha);
				lista2.add(pessoa);

			}

		}
		}

	}

}
