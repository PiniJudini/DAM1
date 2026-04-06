package Boletin24;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String fichero = "/home/pinipon/empleados.txt";
		ArrayList<String> lineas = leerFichero("destino.txt");

		ArrayList<String> terminado = new ArrayList<>();
		for (String linea : lineas) {
			String[] array = linea.split(";");
			String[] array2 = array[0].split(", ");

			boolean correcto = true;
			int edad = 0;
			do {
				System.out.print(array2[1] + " " + array2[0] + ". ¿Cuál es su edad? ");
				edad = teclado.nextInt();

				if (edad < 18 || edad >= 67)
					correcto = false;
			} while (correcto == false);

			String resultado = linea + ";" + edad + "\n";
			terminado.add(resultado);
		}

		escribirFichero(fichero, terminado);
	}

	public static ArrayList<String> leerFichero(String fichero) {
		Path ruta = Path.of("/home/pinipon/" + fichero);
		ArrayList<String> lineas = null;
		try {
			lineas = (ArrayList<String>) Files.readAllLines(ruta);
		} catch (Exception e) {
			System.out.println("Error al leer: " + e.getMessage());
		}

		return lineas;
	}

	public static void escribirFichero(String fichero, ArrayList<String> lineas) {
		// Similar al método anterior, pero para escribir Strings
		Path rutaArchivo = Paths.get(fichero);
		try {
			for (int i = 0; i < lineas.size(); i++) {
				if (i == 0)
					Files.writeString(rutaArchivo, lineas.get(i), StandardCharsets.UTF_8);
				else
					Files.writeString(rutaArchivo, lineas.get(i), StandardCharsets.UTF_8, StandardOpenOption.CREATE,
							StandardOpenOption.APPEND);
			}

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
