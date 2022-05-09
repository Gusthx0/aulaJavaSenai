import java.util.Objects;

public class cliente1 {
	
	private String nome;
	private int cpf;
	private int num;


	public cliente1() {
		super();
	}
//source gating sating
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
//source to string
	@Override
	public String toString() {
		return"*****\n"
				+"Cliente: \nNome:" + nome + " \nCPF:" + cpf + " \nNumero da conta:" + num + "\n*******";
	}
//source hash code
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cliente1 other = (cliente1) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && num == other.num;
	}
	
	
	
	
	}
	
	

