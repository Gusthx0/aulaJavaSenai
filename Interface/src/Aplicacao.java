
public class Aplicacao {

	public static void main(String[] args) { //para fazer a "rota" é necessario a var. rota e um automovel

		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
		rota.ir(ferrari);
		
		Fusca fusca = new Fusca();
		rota.ir(fusca);
		System.out.println();
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		automovel = new Fusca();
		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento(); 
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		
		 
		
	}

}
