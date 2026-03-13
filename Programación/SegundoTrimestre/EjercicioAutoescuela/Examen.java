package EjercicioAutoescuela;

import java.util.ArrayList;

public class Examen {
	private int numPreguntas;
	private ArrayList<Pregunta> examen = new ArrayList<>();
	
	public Examen(int nP) {
		this.numPreguntas = nP;
	}
	
	public int getNumero() {
		return this.numPreguntas;
	}
	
	public void setPregunta(Pregunta p) {
		this.examen.add(p);
	}
	
	public void listarExamen() {
		for(int i=0; i<this.examen.size(); i++) {
			this.examen.get(i).mostrarRespuestas();
		}
	}
	
	public void crearExamen(ArrayList<Pregunta> array) {
		for(int i=0; i<this.numPreguntas; i++) {
			this.setPregunta(array.get(i));
		}
	}
}
