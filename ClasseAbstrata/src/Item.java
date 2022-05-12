
public abstract class Item { //classe abstrata,é um tipo de "modelo"(de metodos) que as classe que herdaram dela devem seguir
	//obriga o programador a seguir o metodo pegar
	
	private int posicaoX = 1;
	private int posicaoY = 1;
	
	public abstract void pegar();  
	//classe abstrata só tem a assinatura (;)
	//se fosse implementar, teriam as chaves ({})
	
	
	//Getter and Setter//

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	

}
