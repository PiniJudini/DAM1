package Boletin24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
	public static void main(String[] args) {
		String contenido = leerFichero1("soluciones.txt");
		boolean correcto = comprobarFormato(contenido);
		if (correcto == true) {
			ArrayList<String> lineas = leerFichero2("respuestas.txt");
			boolean correcto2 = comprobarFormato2(lineas);

			if (correcto2 == true) {
				String[] soluciones = contenido.split(", ");
				ArrayList<String> notasFinales = calcularNotas(lineas, soluciones);

				escribirFichero("notas.txt", notasFinales);
			} else
				System.out.println("Formato de fichero incorrecto");
		} else
			System.out.println("Formato de fichero incorrecto");

	}

	public static boolean comprobarFormato(String contenido) {
		Pattern coincidencia = Pattern.compile("[A-D]{1},\\s");
		boolean correcto = true;
		if (contenido.length() == 28 || contenido.charAt(contenido.length() - 1) == '\n') {
			for (int i = 0; i < contenido.length(); i += 3) {
				if (i != 27) {
					String secuencia = "" + contenido.charAt(i) + contenido.charAt(i + 1) + contenido.charAt(i + 2);
					Matcher matcher = coincidencia.matcher(secuencia);
					if (matcher.find() == false)
						correcto = false;
				}
			}
		} else
			correcto = false;

		return correcto;
	}

	public static boolean comprobarFormato2(ArrayList<String> lista) {
		boolean correcto = true;
		for (String linea : lista) {
			if (linea.contains(": ") == false)
				correcto = false;
			else {
				String[] notas = linea.split(": ");
				int contador = 0;
				for (int i = 0; i < notas[0].length(); i++) {
					if (notas[0].charAt(i) == ' ')
						contador++;
				}

				if (contador != 1)
					correcto = false;

				if (correcto == true)
					correcto = comprobarFormato(notas[1]);
			}
		}
		return correcto;
	}

	public static String leerFichero1(String fichero1) {
		Path fichero = Path.of("/home/alumno/" + fichero1);
		String contenido = "";
		try {
			contenido = Files.readString(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		return contenido;
	}

	public static ArrayList<String> leerFichero2(String fichero2) {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero = Path.of("/home/alumno/" + fichero2);
			lineas = (ArrayList<String>) Files.readAllLines(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		return lineas;
	}

	public static void escribirFichero(String fichero3, ArrayList<String> lista) {
		Path ruta = Paths.get("/home/alumno/" + fichero3);
		for (int i = 0; i < lista.size(); i++) {
			String linea = lista.get(i) + "\n";
			if (i == 0) {
				try {
					Files.writeString(ruta, linea);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			} else {
				try {
					Files.writeString(ruta, linea, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}
	}

	public static ArrayList<String> calcularNotas(ArrayList<String> lineas, String[] soluciones) {
		ArrayList<String> notasFinales = new ArrayList<>();
		for (String linea : lineas) {
			String[] notas = linea.split(": ");
			String[] respuesta = notas[1].split(", ");

			double nota = 0;
			for (int i = 0; i < soluciones.length; i++) {
				if (i == soluciones.length - 1) {
					if (soluciones[i].equals(respuesta[i] + "\n"))
						nota += 1;
					else
						nota -= 0.3;
				} else {
					if (soluciones[i].equals(respuesta[i])) {
						nota += 1;
					} else
						nota -= 0.3;
				}
			}

			String notita = notas[0] + ": " + nota;
			notasFinales.add(notita);
		}

		return notasFinales;
	}
}
