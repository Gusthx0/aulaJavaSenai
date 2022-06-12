public class Pessoa {
	private String nome;  //atributos e seus determinados tipos de visualizacao
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	

	public String getNome() {    //getter e setter para acessar os atributos
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {   //to string que passa para sttringo os atributos acima em uma linha de texto
		return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + getSexo() +
				", Rua: " + endereco.getRua() + ", Número: " + endereco.getNum() + 
				", Bairro: " + endereco.getBairro();
	}
	
	public Pessoa(String texto) {  //split quebra de acordo com a virgula
		String rua, bairro = "";
		int num =  0;
		
		String[] arrayAux1 = texto.split(",");
		String[] arrayAux2 = arrayAux1[0].split(":");
		this.nome = arrayAux2[1].trim();
		//o trim remove vazios
		String [] arrayAux3 = arrayAux1[1].split(":");
		this.idade = Integer.parseInt(arrayAux3[1].trim()); //para passar de int para string
		
		String[] arrayAux4 = arrayAux1[2].split(":");
		this.sexo = Sexo.valueOf(arrayAux4[1].trim()); //valueof para passar de enum para string
		
		String[] arrayAux5 = arrayAux1[3].split(":");
		rua = arrayAux5[1].trim();
		this.endereco = new Endereco(rua, num, bairro);
		
		String[] arrayAux6 = arrayAux1[4].split(":");
		num = Integer.parseInt(arrayAux6[1].trim());
		this.endereco = new Endereco(rua, num, bairro);
		
		String[] arrayAux7 = arrayAux1[5].split(":");
		bairro = arrayAux7[1].trim();
		this.endereco = new Endereco(rua, num, bairro);
		
		
	}

	public Pessoa() {
		
	}


	
	
	
}
