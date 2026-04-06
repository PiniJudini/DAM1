package Boletin24;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Primero contar si hay 2 puntos y coma
		// Comprobar el primer sitio
		// split de (;), comprobar si hay numeros y .contains(", ")
		// Comprobar el tercero
		// split[2] tiene que tener solo números y un punto.

		String origen = "/home/pinipon/origen.txt";
		String destino = "/home/pinipon/destino.txt";
		ArrayList<String> lineas = leerFichero(origen);

		for (String linea : lineas) {
			boolean valido = true;
			int contador = 0;
			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) == ';')
					contador++;
			}

			if (contador == 2) {
				String[] array = linea.split(";");

				for (int i = 0; i < array[0].length(); i++) {
					if (array[0].charAt(i) == '0' || array[0].charAt(i) == '1' || array[0].charAt(i) == '2'
							|| array[0].charAt(i) == '3' || array[0].charAt(i) == '4' || array[0].charAt(i) == '5'
							|| array[0].charAt(i) == '6' || array[0].charAt(i) == '7' || array[0].charAt(i) == '8'
							|| array[0].charAt(i) == '9')
						valido = false;
				}

				if (array[0].contains(", ") == false)
					valido = false;

				int contadorP = 0;
				for (int i = 0; i < array[2].length(); i++) {
					if (array[2].charAt(i) != '0' && array[2].charAt(i) != '1' && array[2].charAt(i) != '2'
							&& array[2].charAt(i) != '3' && array[2].charAt(i) != '4' && array[2].charAt(i) != '5'
							&& array[2].charAt(i) != '6' && array[2].charAt(i) != '7' && array[2].charAt(i) != '8'
							&& array[2].charAt(i) != '9' && array[2].charAt(i) != '.')
						valido = false;

					if (array[2].charAt(i) == '.')
						contadorP++;
				}

				if (contadorP > 1)
					valido = false;

			} else
				valido = false;

			if (valido == true)
				escribirFichero(destino, linea + "\n");
			else
				System.out.println("Línea fallida: " + linea);
		}
	}

	public static ArrayList<String> leerFichero(String origen) {
		Path ruta = Path.of(origen);
		ArrayList<String> lineas = null;
		try {
			lineas = (ArrayList<String>) Files.readAllLines(ruta);
		} catch (Exception e) {
			System.out.println("Error al leer: " + e.getMessage());
		}

		return lineas;
	}

	public static void escribirFichero(String destino, String contenido) {
		Path rutaArchivo = Paths.get(destino);
		try {
			Files.writeString(rutaArchivo, contenido, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
