package EjercicioAutoescuela;

public class Main {
	public static void main(String[] args) {
		Pregunta p1 = new Pregunta("Cual es la capital de España?");
		Pregunta p2 = new Pregunta("Cual es la ciudad más concurrida?");
		Pregunta p3 = new Pregunta("Cual es la ciudad menos concurrida?");
		Pregunta p4 = new Pregunta("Sexo?");
		Respuesta r1 = new Respuesta("Barcelona",false);
		Respuesta r2 = new Respuesta("Madrid", true);
		Respuesta r3 = new Respuesta("Cádiz", false);
		Examen e1 = new Examen(4);
		p1.generarRespuestas(r1, r2, r3);
		p2.generarRespuestas(r1, r2, r3);
		p3.generarRespuestas(r1, r2, r3);
		p4.generarRespuestas(r1, r2, r3);
		
		p1.mostrarRespuestas();
		e1.crearExamen(Pregunta.getArray2());
		
		e1.listarExamen();
	}
}
