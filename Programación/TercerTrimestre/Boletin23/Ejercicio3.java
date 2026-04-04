package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		String fichero = lectura5();

		if (fichero.length() == 0)
			System.out.println("El fichero está vacío");
		else {
			int contadorPalabras = 1;
			String palabraTerminada = "";
			for (int i = 0; i < fichero.length(); i++) {
				if (fichero.charAt(i) == '\n')
					palabraTerminada += " ";
				else
					palabraTerminada += fichero.charAt(i);
			}

			palabraTerminada = palabraTerminada.trim();
			for (int i = 0; i < palabraTerminada.length(); i++) {
				if (palabraTerminada.charAt(i) == ' ')
					contadorPalabras++;
			}

			System.out.println("El fichero seleccionado tiene " + contadorPalabras + " palabras.");
		}
	}

	public static String lectura5() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el fichero que quieres leer: ");
		String fichero = teclado.nextLine();
		Path ruta = Path.of("/home/pinipon/" + fichero);
		String contenido = "";
		try {
			contenido = Files.readString(ruta);
		} catch (Exception e) {
			System.out.println("Error al leer: " + e.getMessage());
		}

		return contenido;
	}
}
