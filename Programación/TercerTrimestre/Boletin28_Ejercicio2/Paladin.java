package Boletin28_Ejercicio2;

import java.util.ArrayList;

public class Paladin extends Personaje implements Guerrero {
	
	public Paladin(String nombre) {
		super(nombre);
	}
	
	@Override
	public int golpear() {
		ArrayList<Integer> stats = this.getEstadisticas();
		int operacion = stats.get(0) + stats.get(1);
		int random = (int) (Math.random() * (operacion - 5 + 1) + 5);
		
		return random;
	}

}
