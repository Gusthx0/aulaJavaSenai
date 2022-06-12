
public class Carro extends Veiculo{
	 
	private boolean quatroPortas;
    
	//de forma bem basica, aqui nos extendemos a classe e pegamos um metodo que seria "obrigatorio' para q	uem extender dela,personalçizamos esse metodo e adicionamos um outro que seria o das quatro portas

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("tem 4 portas" + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	


	
	
	 
}
