import java.util.Scanner;

public class Venda2 {

	public static void main(String[] args) {
			Scanner valor = new Scanner(System.in);
			
			String nomeProduto;
			String nomeProduto2;
			int p1;
			int p2;
			double v1;
			double v2;
			double total;
			double desconto;
			int continua=1;
			
			while(continua==1) {
			nomeProduto="";
			nomeProduto2="";
			System.out.println("\nRoupas Boladas");
			System.out.println("Escolha a roupa desejada");
			System.out.println("1- Camisa  ");
			System.out.println("2- Camiseta");
			System.out.println("3- Cal�a   ");
			System.out.println("4- T�nis   ");
			
			System.out.println("\n Escolha o produto 1");
			p1=valor.nextInt();
			
			if(p1 != 1 && p1 != 2 && p1 != 3 && p1 != 4) {
				System.out.println("O produto escolhido n�o est� dispon�vel em nossa loja");
			}
			
			
			System.out.println("Escolha o produto 2");
			p2=valor.nextInt();
			
			if(p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
				System.out.println("O produto escolhido n�o est� dispon�vel em nossa loja\n");
			}
			
			if(p1 ==1) {
				nomeProduto="Camisa";
			} else if(p1 == 2) {
				nomeProduto="Camiseta";
			} else if(p1 == 3) {
				nomeProduto="Cal�a";
			} else if(p1 == 4) {
				nomeProduto="T�nis";
			}
			
			if(p2 ==1) {
				nomeProduto2="Camisa";
			} else if(p2 == 2) {
				nomeProduto2="Camiseta";
			} else if(p2 == 3) {
				nomeProduto2="Cal�a";
			} else if(p2 == 4) {
				nomeProduto2="T�nis";
			}
			
			System.out.println("Digite o valor do produto 1");
			v1 = valor.nextDouble();
			
			System.out.println("Digite o valor do produto 2 ");
			v2 = valor.nextDouble();
			
			total=v1+v2;
			desconto=v1+v2;
			
			if(p1 == 3 || p2==3) {
				desconto=total*0.85;
				System.out.println("Como voc� escolheu cal�a como um dos produtos voc� ter� um desconto de 15% \n");
			}
			
			System.out.println("O valor total dos produtos "+nomeProduto+" e "+nomeProduto2+ " �: " + desconto);
			
			System.out.println("\n Deseja fazer uma nova compra? 1- Sim 2-N�o\n");
			continua=valor.nextInt();
			
			if(continua != 1){
				System.out.println("Obrigado pela prefer�ncia!");
			}
			}
	}

}