public class Endereço {

	private String bairro;
	 private String rua; 
	 private int numero;
	 
	
	 
	 
	@Override
	public String toString() {
		return "Endereço [bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + "]";
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	 
	 
}
