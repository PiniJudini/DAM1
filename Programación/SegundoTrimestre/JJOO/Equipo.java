package JJOO;

import java.util.HashSet;

public class Equipo {
	private HashSet<Participante> participantes = new HashSet<>();
	private String nacionalidad;
	private DeporteC deporte;
	
	public Equipo(String nac, DeporteC deporte) {
		this.nacionalidad = nac.toLowerCase();
		this.deporte = deporte;
	}
	
	public void setParticipante(Participante p) {
		if(this.nacionalidad.equals(p.getNacionalidad()))
			participantes.add(p);
		else
			System.out.println("El jugador " + p.getNombre() + " no es de " + this.nacionalidad);
	}
}
