public class Ferrari implements Automovel, ItemCaro{ //não se estende a interface,você deve implementar e fazer o override

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void viraEsquerda() {
		System.out.println("Ferrari virou a esquerda"); //adicionando aos metodos
	}

	@Override
	public void viraDireita() {
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
	} 

}
