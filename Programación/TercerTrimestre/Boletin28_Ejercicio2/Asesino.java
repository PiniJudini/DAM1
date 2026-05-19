package Boletin28_Ejercicio2;

import java.util.ArrayList;

public class Asesino extends Personaje implements Guerrero, Ladron {
	
	public Asesino(String nombre) {
		super(nombre);
	}

	@Override
	public boolean sigilo() {
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
	
	@Override
	public int golpear() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int operacion = stats.get(0) + stats.get(1);
		int random = (int) (Math.random() * (operacion - 5 + 1) + 5);
		
		return random;
	}
}
