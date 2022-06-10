
public enum DiaDaSemana { //aqui nos criamos um enum,que de forma rude é uma lista de constantes,como no exemplo abaixo onde usamos dias da semana que são
//sempre os mesmos tipos, poderíamos também colocar outro exemplos de acordo com a aplicação
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	public int getNum() { // associando os as constante aos números ao lado delas
		return num;
	}

	private int num;

	private DiaDaSemana(int num) {
		this.num = num;
	}
}

a
