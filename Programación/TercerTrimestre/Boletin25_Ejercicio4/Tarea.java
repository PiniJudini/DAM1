package Boletin25_Ejercicio4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Tarea {
	private String id;
	private String titulo;
	private int prioridad;
	private boolean completada = false;

	private static ArrayList<Tarea> tareas = new ArrayList<>();

	public Tarea(String i, String t, int p) {
		this.id = i;
		this.titulo = t;
		this.prioridad = p;
		tareas.add(this);
		System.out.println("Tarea '" + t + "' (ID: " + i + ") añadida");
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
			if (linea.contains("(")) {
				String[] parte = linea.split(":");
				for (String p : parte)
					System.out.println(p);
			}
		}
	}
}
