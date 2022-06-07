
public class Aplicacao {

	public static void main(String[] args) { //para fazer a "rota" é necessario a var. rota e um automovel

		Rota rota = new Rota(); //tudo que tem "tipo nome = new tipo< ESTA INSTANCIANDO (criando) um objeto
		Ferrari ferrari = new Ferrari();
		rota.ir(ferrari);
		
		Fusca fusca = new Fusca();
		rota.ir(fusca);//aqui,criamos um objeto do tipo fusca e acessamos de rota e o metodo ir que esta em rota e tem atributos de automovel
		System.out.println();
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel); //aqui fazemos o memsmo de fusca só que com ferari
		
		automovel = new Fusca();
		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor(); //aqui estamos criando um objeto vendedor nessa clase, para acessar o preço de apartamento (obj. criado abaixo) e ferrari criado acima
		Apartamento apartamento = new Apartamento(); 
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		
		//vendedor tem como parametro** itemcaro e pode acessar o valor atraves de getpreco,que é uma variavel* ou um getter* presente em ItemCaro(no caso a interface)
		//(tambem não tenho certeza se é um getter mesmo*)(**não tenho certeza se seria essa a nomeclatura correta para o metodo MostarPreco de vendedor)
		 
		
	}

}
