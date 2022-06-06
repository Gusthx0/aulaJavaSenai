
public class Main {

	//public static final double PI = 3.14;
	
	private enum Sexo {
			MASCULINO,FEMININO;  //COMO CRIAR UMA ENUM DENTRO DE UMA CLASSE
		}
	
	public static void main(String[] args) {
				
		//double pi = Main.PI;
		
	DiaDaSemana hoje = DiaDaSemana.QUINTA; //DEFININDO QUAL O DIA DA SEMANA
		
	int num = DiaDaSemana.	QUINTA.getNum();
	System.out.println(num); //VAI MOSTARAR O EQUIVALENTE EM NUMERO AO DIA DA SEMANA
	
	String s = "terca"; //ESTA DEFININDO QUE "S" EQUIVALE A TERCA FEIRA
	
	hoje = DiaDaSemana.valueOf(s); //VAI PROCURAR QUE DIA SE ASSEMELHA A QUINTA FEIRA
	
	System.out.println(hoje.getNum() );
	
	Sexo sexo = Sexo.FEMININO;   // RELATIVO A OUTRA AULA
	sexo = Sexo.MASCULINO;       // RELATIVO A OUTRA AULA
	
	
	}

}
