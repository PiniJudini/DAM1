package Boletin27;

import java.util.ArrayList;
import java.util.Collections;

public class Pokemon implements Comparable<Pokemon> {
	private int codigo;
	private String nombre;
	private double peso;
	private double altura;
	private ArrayList<String> tipos = new ArrayList<String>();

	private static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

	public Pokemon(int c, String n, double p, double a, String t) {
		this.codigo = c;
		this.nombre = n;
		this.peso = p;
		this.altura = a;
		this.tipos.add(t);

		pokemons.add(this);
	}

	public Pokemon(int c, String n, double p, double a, String t, String t2) {
		this.codigo = c;
		this.nombre = n;
		this.peso = p;
		this.altura = a;
		this.tipos.add(t);
		this.tipos.add(t2);

		pokemons.add(this);
	}

	public static void mostrarPokemons() {
		Collections.sort(pokemons);

		for (Pokemon p : pokemons) {
			if (p.tipos.size() == 2)
				System.out.println(p);
			else
				System.out.println(p);
		}
	}

	@Override
	public int compareTo(Pokemon poke) {
		int devolucion = 0;

		if (this.nombre.compareTo(poke.nombre) < 0)
			devolucion = -1;
		else
			devolucion = 1;

		return devolucion;
	}

	@Override
	public String toString() {
		if (this.tipos.size() == 1)
			return this.nombre + " (#" + this.codigo + ") - " + this.tipos.get(0) + "\nPeso: " + this.peso
					+ "\nAltura: " + this.altura;
		else
			return this.nombre + " (#" + this.codigo + ") - " + this.tipos.get(0) + " y " + this.tipos.get(1)
					+ "\nPeso: " + this.peso + "\nAltura: " + this.altura;
	}
}
