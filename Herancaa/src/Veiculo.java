
public class Veiculo {

	private String nome;
	protected String marca;  //classe pai que vai dar a quem ext6ende dela metodos e atributos embutidos que teram que ser declaradops assim que for instanciado um objetodo tipo,tambem fizemos getters e stters
	protected String modelo;
	protected int ano;
	
	public void buzinar() {
		System.out.println("BI-BI");
	}
	public void imprimir () {
		System.out.println("marca: " + marca);
		System.out.println("modelo: " + modelo);
		System.out.println("ano: " + ano);
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
