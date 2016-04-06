package concursantes;

public class Malabarista implements Concursante {

	private int pelotas = 5;

	public Malabarista() {
	}

	public Malabarista(int pelotas) {
		this.pelotas = pelotas;
	}

	public void ejecutar() throws EjecucionException {
		System.out.println("Malabareo " + pelotas + " pelotas");
	}

	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}
	
	

}
