package JJOO;

import java.util.HashSet;

class DeporteC extends Deporte {
	private HashSet<Equipo> equipos = new HashSet<>();
	
	public DeporteC(String nombre) {
		super(nombre);
	}
}
