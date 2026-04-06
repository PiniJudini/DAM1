package Boletin24;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean correcto = true;
		int numero = 0;
		try {
			System.out.print("Introduce un número: ");
			numero = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("Dato introducido incorrecto");
			correcto = false;
		}

		if (correcto == true) {
			String fibonacci = "0, 1, ";
			int numeroInicial = 1;
			int numeroInicial2 = 0;
			int nuevoNumero = 0;

			int i = 0;
			while (i < numero - 2) {
				nuevoNumero = numeroInicial2 + numeroInicial;
				if (i < numero - 3)
					fibonacci += nuevoNumero + ", ";
				else
					fibonacci += nuevoNumero;

				numeroInicial2 = numeroInicial;
				numeroInicial = nuevoNumero;
				i++;
			}

			escribirFichero(fibonacci);
		}
	}

	public static void escribirFichero(String contenido) {
		Path rutaArchivo = Paths.get("/home/pinipon/fibonacci.txt");
		try {
			// Abre el fichero, graba el string y lo cierra luego
			Files.writeString(rutaArchivo, contenido, StandardCharsets.UTF_8);

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
