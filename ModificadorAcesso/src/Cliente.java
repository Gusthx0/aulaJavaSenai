import java.util.Objects;

public class Cliente {

private String nome;   //visualização privada,apenas classe que extederem dela podem ter acesso a seus metodos e atributos privados
private int cpf;
private int numConta;
public Cliente() {
	super();
}
public String getNome() {   //get para acessar o valor,ou seja,visualizar o valor
	return nome;
}
public void setNome(String nome) {  //st permite fazer a alteção do valor
	this.nome = nome;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
	this.cpf = cpf;
}
public int getNumConta() {
	return numConta;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
@Override
public String toString() {   //toString passam para o poprtugues o que esta nos atributos 
	return "Cliente [nome=" + nome + ", cpf=" + cpf + ", numConta=" + numConta + "]";
}
@Override //o hash transfere esses atributos na forma de objetos
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
