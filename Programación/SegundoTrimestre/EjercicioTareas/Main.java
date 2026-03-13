package EjercicioTareas;

public class Main {
	public static void main(String[] args) {
		Tarea t1 = new Tarea("Aprender Java", "Estudiar POO y aprobar el trimestre", "verde");
		Tarea t2 = new Tarea("Ver Stranger Things", "Ver las temporadas seguidas", "rojo");
		Tarea t3 = new Tarea("Ser una fackin máquina", "Ponerme más fuerte que el putisimo Llados", "amarillo");
		t1.setCompletado();
		Tarea.mostrarTareas();
		System.out.println(" ");
		Tarea.mostrarTareasnoCompletadas();
	}
}
