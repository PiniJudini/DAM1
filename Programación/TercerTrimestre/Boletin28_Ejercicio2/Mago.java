package Boletin28_Ejercicio2;

import java.util.ArrayList;

public interface Mago {
	ArrayList<Integer> getEstadisticas();

	default int hechizo() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int random = (int) (Math.random() * (stats.get(2) - 1 + 1) + 1);
		
		return random;
	}
}
