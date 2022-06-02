public class Pessoa {


	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	public Pessoa() {
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}




	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}




	public Pessoa (String texto) {
		
		String[] array1 = texto.split (",");
		
		String[] array2 = array1 [1].split ("=");
		this.nome = array1[1].trim();
		
		String[] array3 = array1 [0].split ("=");
		this.idade = Integer.parseInt(array1[1].trim());
		
		String[] array4 = array1 [2].split ("=");
		this.sexo = Sexo.valueOf(array1[1].trim());


	}
	
		
	
	
}
