
public class Conta {
	
	String nome;
	double valor;
	
	public Conta(String nome, double valor) {  //para acessar posteriormente esses atributos aqui de conta
		super();
		this.nome = nome;
		this.valor = valor;
	}
	@Override			//passa para stringo o que esta sendo digitado aqui
	public String toString() {
		return "Conta [valor=" + valor + "]";
	}
	

}
