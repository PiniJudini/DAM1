package Binarios;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Tarea implements Serializable {
	private String id;
	private String titulo;
	private int prioridad;
	private boolean completada;

	private static ArrayList<Tarea> tareas = new ArrayList<>();

	public Tarea(String i, String t, int p, int completado) {
		this.id = i;
		this.titulo = t;
		this.prioridad = p;
		if (completado == 0)
			this.completada = false;
		else
			this.completada = true;
		añadirTarea(this);
		escribirFichero("ejercicio5.txt", tareas);
	}

	public static void leerFichero(String fichero) {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero1 = Path.of("/home/alumno/" + fichero);
			lineas = (ArrayList<String>) Files.readAllLines(fichero1);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		for (String linea : lineas) {
			String[] parte = linea.split(":");
			int prioridad = Integer.parseInt(parte[2]);
			int completada = Integer.parseInt(parte[3]);
			Tarea tarea = new Tarea(parte[0], parte[1], prioridad, completada);
		}
	}

	public static void escribirFichero(String fichero, ArrayList<Tarea> tareas) {
		try {
			PrintWriter pluma = new PrintWriter(new FileWriter("/home/alumno/" + fichero, StandardCharsets.UTF_8));
			for (Tarea tarea : tareas) {
				String completada = " ";
				if (tarea.completada == true)
					completada = "X	";
				pluma.printf("%s [%s] %s (Prioridad: %d)\n", completada, tarea.id, tarea.titulo, tarea.prioridad);
			}
			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public String getId() {
		return this.id;
	}

	public static void añadirTarea(Tarea t) {
		boolean esta = false;
		for (Tarea tarea : tareas) {
			if (tarea.getId().equals(t.id))
				esta = true;
		}

		if (esta == false) {
			tareas.add(t);
			System.out.println("Tarea '" + t.titulo + "' (ID: " + t.id + ") añadida");
		} else
			System.out.println("Error: ID " + t.id + " ya existente");
	}

	public static void eliminarTarea(String id) {
		boolean posible = false;
		Tarea eliminada = null;
		for (Tarea tarea : tareas) {
			if (tarea.getId().equals(id)) {
				posible = true;
				eliminada = tarea;
			}
		}

		if (posible == true) {
			tareas.remove(eliminada);
			System.out.println("Tarea con ID " + eliminada.getId() + " ('" + eliminada.titulo + "') eliminada");
		} else
			System.out.println("Error: No se encontró una tarea con ID " + id);
	}

	public static void listarTareas() {
		for (Tarea tarea : tareas)
			tarea.mostrarTarea();
	}

	public void mostrarTarea() {
		String completada = " ";
		if (this.completada == true)
			completada = "X";
		System.out.printf("%s [%s] %s (Prioridad: %d)\n", completada, this.id, this.titulo, this.prioridad);
	}

	public static void ordenarTareas() {
		HashSet<Integer> prioridades = new HashSet<>();
		for (Tarea tarea : tareas) {
			prioridades.add(tarea.prioridad);
		}

		Integer[] prio = prioridades.toArray(new Integer[0]);
		Arrays.sort(prio);

		ArrayList<Tarea> ordenado = new ArrayList<>();
		for (int i = 0; i < prio.length; i++) {
			for (Tarea tarea : tareas) {
				if (tarea.prioridad == prio[i])
					ordenado.add(tarea);
			}
		}

		escribirFichero("Ejercicio5.txt", ordenado);
	}
}
