package Boletin24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Ejercicio4 {
	public static void main(String[] args) {
		Darlavuelta("fichero1.txt", "fichero2.txt");
	}

	public static void Darlavuelta(String fichero1, String fichero2) {
		ArrayList<String> lineas = leerFichero(fichero1);
		for (int i = lineas.size() - 1; i >= 0; i--) {
			ArrayList<String> invertido = invertirContenido(lineas.get(i));
			for (int j = 0; j < invertido.size(); j++) {
				añadirContenido(invertido.get(j), fichero2);
				if (j == invertido.size() - 1)
					añadirContenido("\n", fichero2);
				if(i==lineas.size()-1 && j==0)
					escribirContenido(invertido.get(j), fichero2);
			}
		}
	}

	public static ArrayList<String> leerFichero(String fichero1) {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero = Path.of("/home/alumno/" + fichero1);
			lineas = (ArrayList<String>) Files.readAllLines(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		return lineas;
	}

	public static ArrayList<String> invertirContenido(String linea) {
		ArrayList<String> palabra = new ArrayList<>();
		for (int i = linea.length() - 1; i >= 0; i--) {
			String caracter = "" + linea.charAt(i);
			palabra.add(caracter);
		}

		return palabra;
	}

	public static void añadirContenido(String caracter, String fichero2) {
		Path ruta = Paths.get("/home/alumno/" + fichero2);
		String contenido = caracter;
		try {
			Files.writeString(ruta, contenido, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void escribirContenido(String caracter, String fichero2) {
		Path ruta = Paths.get("/home/alumno/" + fichero2);
		String contenido = caracter;
		try {
			Files.writeString(ruta, contenido);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}