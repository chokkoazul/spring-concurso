package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrumento {
	public void tocar() {
		System.out.println("Clin clin clin clin...");
	}
}