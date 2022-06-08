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
		
		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 160.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>(); 
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
	}

}



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
