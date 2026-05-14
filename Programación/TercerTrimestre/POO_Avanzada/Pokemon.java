package POO_Avanzada;

import java.util.Arrays;

public class Pokemon implements Comparable<Pokemon> {
	private String nombre;
	private int codigopokedex;
	private String[] tipo = new String[2];
	private int pv;
	private Pokemon evolucion = null;

	public Pokemon(String nombre, int codigopokedex, String t) {
		this.nombre = nombre;
		this.codigopokedex = codigopokedex;
		this.tipo[0] = t;
		this.pv = (int) ((Math.random() * 51) + 50);
	}

	public Pokemon(String n, int c, String t1, String t2) {
		this.nombre = n;
		this.codigopokedex = c;
		this.tipo[0] = t1;
		this.tipo[1] = t2;
		this.pv = (int) ((Math.random() * 51) + 50);
	}

	@Override
	public String toString() {
		if (this.tipo[1] == null)
			return "(#" + this.codigopokedex + ") " + this.nombre + "\nTipo: " + this.tipo[0];
		else
			return "(#" + this.codigopokedex + ") " + this.nombre + "\nTipos: " + this.tipo[0] + ", " + this.tipo[1];
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("Hola");
		Pokemon p = (Pokemon) o;
		boolean igual = true;

		if (this.codigopokedex != p.codigopokedex)
			igual = false;
		if (this.nombre.equals(p.nombre) == false)
			igual = false;

		if (Arrays.equals(this.tipo, p.tipo) == false)
			igual = false;

		return igual;
	}

	@Override
	public int compareTo(Pokemon p) {
		int devolver = 0;

		if (this.codigopokedex > p.codigopokedex)
			devolver = 1;
		else if (this.codigopokedex < p.codigopokedex)
			devolver = -1;

		return devolver;
	}
}
