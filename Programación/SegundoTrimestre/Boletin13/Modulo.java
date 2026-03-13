package Boletin13;

public class Modulo {
	public String nombre;
	private int año;
	private int horas;
	private boolean optatividad;
	
	public Modulo(String nombre, int año, int horas, boolean optatividad) {
		this.nombre = nombre;
		this.año = año;
		this.horas = horas;
		this.optatividad = optatividad;
	}
	
	public int getCurso() {
		return this.año;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
