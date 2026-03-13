package JJOO;

import java.util.HashSet;

public class Participante {
	private String nombre;
	private String nacionalidad;
	private HashSet<Deporte> deportes = new HashSet<>();
	
	public Participante(String n, String nac) {
		this.nombre = n;
		this.nacionalidad = nac.toLowerCase();
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
