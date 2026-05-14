package Interfaces;

public class Persona implements Jubilada {
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String n, String a, int e) {
		this.nombre = n;
		this.apellidos = a;
		this.edad = e;
	}

	public int getEdad() {
		return this.edad;
	}
}
