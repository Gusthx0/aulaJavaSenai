public class Pessoa {

	private enum Sexo{
		MASCULINO, FEMININO;
	}
	
	private int idade;
	private Endere�o endereco;
	private String nome;
	
	
	
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", endereco=" + endereco + ", nome=" + nome + "]";
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endere�o getEndereco() {
		return endereco;
	}
	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
