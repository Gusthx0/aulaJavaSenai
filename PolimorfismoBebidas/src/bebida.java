
public class bebida {
	private String name;
	private boolean aquecer;
	
	public bebida(String name, boolean aquecer) {
		super();
		this.name = name;
		this.aquecer = aquecer;
	}
	
	public void preparar () {
		System.out.println("pegando o copo");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
}
