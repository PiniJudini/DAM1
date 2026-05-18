package Boletin28_Ejercicio2;

import java.util.ArrayList;

public interface Ladron {
	ArrayList<Integer> getEstadisticas();

	default boolean sigilo() {
		boolean descubierto = true;
		ArrayList<Integer> stats = this.getEstadisticas();
		int lanzadas = stats.get(1);
		int contador = 0;
		for (int i = 0; i < lanzadas; i++) {
			int random = (int) (Math.random() + 6) + 1;
			if (random == 6)
				contador++;
		}
		if (contador >= 4)
			descubierto = false;
		return descubierto;
	}

}
