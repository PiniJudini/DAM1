package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio2 {
	public static void main(String[] args) {
		estadisticas("/home/alumno/fichero1");
	}

	public static void estadisticas(String fichero1) {
		Path fichero = Path.of(fichero1);
		String contenido = "";
		try {
			contenido = Files.readString(fichero);
			contarCosas(contenido);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
	}
	
	public static void contarCosas(String contenido) {
		int contador = 0;
		int contadorLineas = 0;
		int contadorChars = 0;
		int contadorEspacios = 0;
		for (int i = 0; i < contenido.length(); i++) {
			if(i<contenido.length()-1) {
				if (contenido.charAt(i) == '\n' && contenido.charAt(i + 1) == '\n')
					contador++;
			}
			if (contenido.charAt(i) == '\n')
				contadorLineas++;
			if (contenido.charAt(i) != ' ' && contenido.charAt(i) != '\n')
				contadorChars++;
			if (contenido.charAt(i) == ' ')
				contadorEspacios++;
		}

		System.out.println("Número de líneas: " + contadorLineas);
		System.out.println("Líneas en blanco: " + contador);
		System.out.println("Cantidad de caracteres sin contar espacios: " + contadorChars);
		System.out.println("Cantidad de espacios: " + contadorEspacios);
	}
}
