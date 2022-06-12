import java.util.Scanner;
public class mainy {
	
	public static void main(String[] args) {
		
//		int x = 100;                  //declarando o valçor de uma variavel
//		double y = 200.3;
//
//		int a = 0;
//		double b = 0;
//		
//		short z = 10000; 
//		System.out.println(z);
//		
//		a = (int)y; //Casting: o a não consegue receber y por ser menor do que as informações de y 
//		b = x; // b recebe x por ter espaço sobrando 
//		
//		System.out.println(x);
//		System.out.println(y);
//
//		System.out.println(a);
//		System.out.println(b);
//		
//		int idadePessoa = 68;
//		
//		if(idadePessoa < 18) {                      //if representa a mesma função SE,que é uma verificação e uma forma de manipula o codigo para um programa funcionar de forma mais adequada,exemplo,SE o user digita uma palavra que não seja especificamente a que o programa exige eue uso else para fazer aparecer,erro faça novamente
//			System.out.println("Voce não pode beber");
//		}
//		
//		else if (idadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//			
//		}
//		else {
//			System.out.println("quanto é sua aposentadoria ?");
//		}
//		System.out.println("Você tem " + idadePessoa + " anos ");
//
//		int num = 8;
//		
//		switch (num) {        //aqui é o equivalente ao escolha caso do visualg,ou seja eu dou uma gama de opções que o usuario pode escolher,pode servir para um menu,mas se eu não me engano isso não seria o ideal para o programa
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda-Feira");
//				break;
//			case 3:
//				System.out.println("Terça-Feira");
//				break;
//			case 4:
//				System.out.println("Quarta-Feira");
//				break;
//			case 5:
//				System.out.println("Quinta-Feira");
//				break;
//			case 6:
//				System.out.println("Sexta-Feira");
//				break;
//			case 7:
//				System.out.println("Sábado");
//				break;
//			default:
//				System.out.println("esse número não condiz com um dia da semana");
//			
//		}
//		
//		char caractere = 'c';  //o char que é apenas um caractere e usa só o ''
//
//		switch (caractere) {
//		case 'a':
//			System.out.println("Sua letra é a");
//			break;
//		case 'b':
//			System.out.println("Sua letraé b");
//			break;
//		default:  //se não for nenhum dos casos
//			System.out.println("Valor invalido");
//	}
//		
//	String semaforo = "verde";
//	
//	switch (semaforo) {
//	case "verde" :
//		System.out.println("Pode prosseguir");
//		break;
//	case "amarelo":
//		System.out.println("Atenção");
//		break;
//	case "vermelho":
//		System.out.println("Pareeeeeee");
//		break;
//		
//		
//	
//	}	
//
//	int a=0; //declara a variavel a e depois usamos como uma base para o nosso "faça"
//	
//	while(a<10) //testa primeiro e depois executa //enquanto a for menor que 10,faça,linha de codigos
//	{
//		a =a+1;
//		System.out.println(a); 
//	
//	}
//	
//	 a=0;
//	 do { //executa primeiro e depois testa
//		 System.out.println(a);
//		 a=a+1;
//	 }while (a<10);
//	for(int b=0 ; b<10; b++) { //for é o equivalente ao 'para',ou seja vai fazer o que esta sendo pedido ate que  seja falso
//		System.out.println(b);
//	}
//		
//		for(int x=0; x <11; x++) {
//			System.out.println("2 x " + x + " = " + x*2 );
//		}	
//Scanner entrada = new Scanner(System.in);  //para o usuario digitar
//		
//		
//		System.out.println("Digite o número desejado");
//		int num = entrada.nextInt();//nextint para inteiro
//		
//		for(int x=0; x <11; x++) {
//			System.out.println(num + "x " + x + " = " + x*num );//aqui seria um calculo usando for
//		}	
//		
//		
//		int x1 = 3; //matriz/array: "consigo guarda varios elementos(do mesmo tipo)em uma variavel"
//		int y1 = 4;
//		int z1 = 5;
//		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//		
//		double x[] = {3, 5, 3, 5};
//		
//		for (int aux = 0;aux < x.length;aux++) { //o length serve para ver o tamanho da matriz e de certa maneira ter um controle sobre ele,de forma rude 
//			System.out.println("valor do indice " + aux + "="+ x[aux]);
//		}
//		
//		String nome [] = { "julia", "Chris", "renan"};
//		
//		
//		for (int aux1 = 0;aux1 < nome.length;aux1 ++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "julia") {
//				System.out.println("o indice da julia é = " + aux1); //saber em qual indicie(numero de "chamada") esta Julia
//			}
//		}
//		
//		int[] ArrayInt = new int[5]; //array de inteiro e de outros tipós especificados
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];
//		
//		ArrayInt[3] = 4; //declarando qual dve ser o valor que deve estar na determinada posição
//		
//		int [] numero = new int[6];  //alocando seis espaços para este array
//		Scanner teclado = new Scanner (System.in);
//		
//		for (int aux2 = 0;aux2 < numero.length;aux2++) {
//			System.out.println("Digite um numero qualauer");
//			numero[aux2] = teclado.nextInt();
//		}
//		for (int aux2 = 0;aux2 < numero.length; aux2++) {
//			System.out.println("indice" + aux2 + "=" + numero[aux2]);
	
//		
	int[] arrayQualquer = new int[3];		
	Object[] arrayObject = new Object[6];
		arrayObject[0]= 12;
	    arrayObject[1]= "Rafael";
		arrayObject[2]= 13.8;
		arrayObject[3]= true;
		arrayObject[5]= arrayQualquer;
		
	for (int aux2 = 0; aux2 < arrayObject.length; aux2++) 					System.out.println("indice" + aux2 + "=" + arrayObject[aux2]);
		
		
		int[][] arrayBidirecional = new int[4][3];
		
		arrayBidirecional[0][0]=8;
		arrayBidirecional[2][1]=8;  //um array composto de linhas e colunas
		
		for (int coluna = 0;coluna < arrayBidirecional[0].length; coluna++) {
			for (int linha = 0; linha < arrayBidirecional[0].length; coluna++) {
				System.out.print("indice [" + linha + "][" + coluna +"] ="+ arrayBidirecional [linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}	
	
}	
		


		
