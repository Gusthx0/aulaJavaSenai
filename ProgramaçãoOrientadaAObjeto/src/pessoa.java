
public class pessoa {
	String nome;
	int numfigurinhas;
	
	void receber (int numfig) {						//(xxxx)-parametros/o que precisa para funcionar o meu codigo
										//this permite que o método acesse os atributos (e método também) da propria instância.
		
		this.numfigurinhas += numfig;
		
	}
	
	    boolean dar (int numfig, pessoa pessoa) {
		
	    	
	    	
		if  (this.numfigurinhas > numfig) {	
		System.out.println("quantidade insuficiente de figurinhas");
	    return false;
	   
	    
	}
			 
		else {
		this.numfigurinhas -= numfig;
				
		pessoa.receber(numfig);
		return true;
	}
	}	
	}

	
	 
		
		
	
