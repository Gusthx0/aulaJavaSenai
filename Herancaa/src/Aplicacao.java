
public class Aplicacao {

	public static void main(String[] args) {
		
			
			Veiculo veiculo = new  Veiculo();  //intanciando objetos e acessando os getters ne stters para fazer a "validação'
// digamos assim sobre como cada metodo se comporta em relação a objetos difrentes			
			veiculo.setMarca("Honda");
			veiculo.setModelo("City");
			veiculo.setAno(2013);
			
			veiculo.imprimir ();
			veiculo.buzinar();
			
			Carro carro = new Carro();
			
			carro.setMarca("honda");
			carro.setModelo ("fit");
			carro.setAno(2014);
			carro.setQuatroPortas(true);
			System.out.println();
			carro.imprimir();
			carro.buzinar();

			Caminhao caminhao = new Caminhao();
			
			caminhao.setMarca("SCANIA");
			caminhao.setModelo ("XJT76");
			caminhao.setAno(2014);
			System.out.println();
			caminhao.imprimir();
			caminhao.buzinar();
			
			Moto moto = new Moto();
			

			moto.setMarca("SCANIA");
			moto.setModelo ("XJT76");
			moto.setAno(2014);
			System.out.println();
			moto.imprimir();
			moto.buzinar();
			moto.empinar();
			
		

	}

}
