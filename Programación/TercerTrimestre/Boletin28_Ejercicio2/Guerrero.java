package Boletin28_Ejercicio2;

import java.util.ArrayList;

public interface Guerrero {
	ArrayList<Integer> getEstadisticas();

	default int golpear() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int operacion = stats.get(0) + stats.get(1);
		int random = (int) (Math.random() * (operacion - 5 + 1) + 5);
		
		return random;
	}
}
