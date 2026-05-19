package Boletin28_Ejercicio2;

import java.util.ArrayList;

public class Druida extends Personaje implements Mago, Guerrero {

	public Druida(String nombre) {
		super(nombre);
	}

	@Override
	public int golpear() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int operacion = stats.get(0) + stats.get(1);
		int random = (int) (Math.random() * (operacion - 5 + 1) + 5);

		return random;
	}

	@Override
	public int hechizo() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int random = (int) (Math.random() * (stats.get(2) - 1 + 1) + 1);

		return random;
	}
}
