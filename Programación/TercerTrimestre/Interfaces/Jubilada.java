package Interfaces;

public interface Jubilada {
	int EDAD_JUBILACION = 67;

	void cuantoMeFalta();

	static void mePuedoJubilar(int edad) {
		if (edad < EDAD_JUBILACION)
			System.out.println("No te puedes jubilar aún");
		else if (edad > EDAD_JUBILACION)
			System.out.println("Ya te puedes jubilar");
		else
			System.out.println("hola");
	}

	default void informacion() {
		System.out.println("Edad de jubilación: " + EDAD_JUBILACION);
	}
}
