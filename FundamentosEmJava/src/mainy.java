import java.util.Scanner;
public class mainy {
	
	public static void main(String[] args) {
		
//		int x = 100;
//		double y = 200.3;
//
//		int a = 0;
//		double b = 0;
//		
//		short z = 10000; 
//		System.out.println(z);
//		
//		a = (int)y; //Casting: o a n�o consegue receber y por ser menor do que as informa��es de y 
//		b = x; // b recebe x por ter espa�o sobrando 
//		
//		System.out.println(x);
//		System.out.println(y);
//
//		System.out.println(a);
//		System.out.println(b);
//		
//		int idadePessoa = 68;
//		
//		if(idadePessoa < 18) {
//			System.out.println("Voce n�o pode beber");
//		}
//		
//		else if (idadePessoa < 60) {
//			System.out.println("Bora tomar uma");
//			
//		}
//		else {
//			System.out.println("quanto � sua aposentadoria ?");
//		}
//		System.out.println("Voc� tem " + idadePessoa + " anos ");
//
//		int num = 8;
//		
//		switch (num) {
//			case 1:
//				System.out.println("Domingo");
//				break;
//			case 2:
//				System.out.println("Segunda-Feira");
//				break;
//			case 3:
//				System.out.println("Ter�a-Feira");
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
//				System.out.println("S�bado");
//				break;
//			default:
//				System.out.println("esse n�mero n�o condiz com um dia da semana");
//			
//		}
//		
//		char caractere = 'c';
//
//		switch (caractere) {
//		case 'a':
//			System.out.println("Sua letra � a");
//			break;
//		case 'b':
//			System.out.println("Sua letra� b");
//			break;
//		default:
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
//		System.out.println("Aten��o");
//		break;
//	case "vermelho":
//		System.out.println("Pareeeeeee");
//		break;
//		
//		
//	
//	}	
//
//	int a=0;
//	
//	while(a<10) //testa primeiro e depois executa
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
//	for(int b=0 ; b<10; b++) {
//		System.out.println(b);
//	}
//		
//		for(int x=0; x <11; x++) {
//			System.out.println("2 x " + x + " = " + x*2 );
//		}	
//Scanner entrada = new Scanner(System.in);
//		
//		
//		System.out.println("Digite o n�mero desejado");
//		int num = entrada.nextInt();
//		
//		for(int x=0; x <11; x++) {
//			System.out.println(num + "x " + x + " = " + x*num );
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
//		for (int aux = 0;aux < x.length;aux++) { //o length serve  
//			System.out.println("valor do indice " + aux + "="+ x[aux]);
//		}
//		
//		String nome [] = { "julia", "Chris", "renan"};
//		
//		
//		for (int aux1 = 0;aux1 < nome.length;aux1 ++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "julia") {
//				System.out.println("o indice da julia � = " + aux1);
//			}
//		}
//		
//		int[] ArrayInt = new int[5];
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];
//		
//		ArrayInt[3] = 4;
//		
//		int [] numero = new int[6];
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
		arrayBidirecional[2][1]=8;
		
		for (int coluna = 0;coluna < arrayBidirecional[0].length; coluna++) {
			for (int linha = 0; linha < arrayBidirecional[0].length; coluna++) {
				System.out.print("indice [" + linha + "][" + coluna +"] ="+ arrayBidirecional [linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}	
	
}	
		


		