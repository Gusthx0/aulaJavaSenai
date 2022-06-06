
public enum DiaDaSemana { //aqui nos criamos um enum,que de forma rude é uma lista de objetos
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	public int getNum() { // associando os numeros a palavra
		return num;
	}

	private int num;

	private DiaDaSemana(int num) {
		this.num = num;
	}
}

