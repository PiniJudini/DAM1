package Boletin15;

public class Persona {
	protected String nombre;
	protected String apellidos;
	
	public Persona(String n, String a) {
		this.nombre = n;
		this.apellidos = a;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
}
