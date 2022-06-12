import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
;
//		List lista = new ArrayList();

//		lista.add("aaa");
//		lista.add(12);
//		lista.add(true);	

//		for (int x=0; x< lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}

//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.remove(0);
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.add(0, "def");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		
//		lista.set(0, "ghi");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		
//		lista.clear();
//		if (lista.isEmpty()) {
//			System.out.println("Sua lista está vazia");
//		}
		
		Conta conta1 = new Conta("Agua", 60.00);instanciando obj do tipo conta qua servirao como dados para a lista
		Conta conta2 = new Conta("Luz", 160.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>();  //criando a lista
		listaDeContas.add(conta1);  //adicionando os objetos 
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) { // fazendo o enhahenced fo,que e um for aprimorado onde  para cada objeto do tipo tal presente na determinada lista faca o seguinte codigo
			System.out.println(conta);
		}
	}

}

//estudos por fora,favor ignorar

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    // [ A ] declarando e instanciando uma agenda de contatos
    ArrayList<String> agenda = new ArrayList();

    // [ B ] usando o método add() para gravar 4 contatos na agenda
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Antônio Conselheiro;44 4444-4444");

    int i;

    // [ C ] mostrando os "n" contatos da agenda (usando o índice)
    // número de elementos da agenda: método size()
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    int n = agenda.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, agenda.get(i));
    }

    System.out.printf("\nInforme a posição a ser excluída:\n");
    i = ler.nextInt();

    try {
      // [ D ] remove o i-ésimo contato da agenda
      agenda.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até agenda.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" contatos da agenda (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato: agenda) {
      System.out.printf("Posição %d- %s\n", i, contato);
      i++;
    }

    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = agenda.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next());
      i++;
    }
  }

}



//aplicações de estudos pessoais,ignorar

public class Declaracao_Array {
    public static void main(String[] args) {
        //[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

//{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

//DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;
        
        //ALOCA MEMÓRIA PARA 10 INTEIROS
        meuArray = new int[10];
        
        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }
}


public class TamanhoArray {

    public static void main(String[] args) {    
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if(arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - Maior que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
    }
}


public class Criando_Inicializando_Array {  
  public static void main(String[] args) { 
   //ARRAY COM 10 ELEMENTOS 
   int[] arrayBase; 
   arrayBase = new int[ 20 ]; 
   System.out.printf("%s %10s \n", "Index", "Valores"); 
   //GERA A SAÍDA DO VALOR DE CADA ELEMENTO DO ARRAY 
   for(int i = 0; i < arrayBase.length; i++) 
    System.out.printf("%3d %10d \n", i, arrayBase[ i ]); 
   } 
} 


public class Inicializando_Array {
    public static void main(String[] args) {    
        //LISTA  DE VALORES
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};   
        System.out.printf("%s %12s \n", "Index", "Valores");    
        //PERCORRE CADA ELEMENTO E IMPRIME O ÍNDICE COM O VALOR
        for( int counter = 0; counter < array.length; counter ++){       
            System.out.printf("%5d %4s %4d \n", counter, "=>" , array[ counter ]);
        }
    }
}


public class Percorrendo_Arrays_For_Aprimorado {
    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;  
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }
}

