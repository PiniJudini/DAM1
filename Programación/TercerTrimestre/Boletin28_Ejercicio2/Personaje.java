package Boletin28_Ejercicio2;

import java.util.ArrayList;

public abstract class Personaje implements Mago, Guerrero, Ladron {
	protected int nivel = 1;
	protected ArrayList<Integer> caracteristicas = new ArrayList<Integer>();

	public Personaje() {
		this.caracteristicas = guardarEstadisticas();
	}

	protected static ArrayList<Integer> guardarEstadisticas() {
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * (15 - 5 + 1) + 5);
			lista.add(random);
		}
		
		return lista;
	}
	
	public ArrayList<Integer> getEstadisticas() {
		return this.caracteristicas;
	}
}
