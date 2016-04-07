package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Saxofon implements Instrumento {
	public void tocar() {
		System.out.println("Tuu tuu tuu tuu...");
	}
}