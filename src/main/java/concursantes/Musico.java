package concursantes;

public class Musico implements Concursante {
	private String cancion;
	private Instrumento instrumento;

	public Musico() {
	}

	public void ejecutar() throws EjecucionException {
		System.out.println("Tocando " + cancion + ": ");
		instrumento.tocar();
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
}