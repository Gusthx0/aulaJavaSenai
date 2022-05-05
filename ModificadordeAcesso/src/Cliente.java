import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	public Cliente() {
		
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
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the numConta
	 */
	public int getNumConta() {
		return numConta;
	}

	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	@Override
	public String toString() {
		return "Cliente nome= " + nome + ", \n CPF= " + cpf + ",\n numero Conta= " + numConta ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
}
