package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio4 {
	public static void main(String[] args) {
		if(compararFicheros("fich.txt", "fich2.txt") == true)
			System.out.println("El contenido de los ficheros es el mismo");
		else
			System.out.println("El contenido de los ficheros no es el mismo");
	}
	
	public static boolean compararFicheros(String fichero1, String fichero2) {
		boolean iguales = false;
		String contenido1 = leerFichero(fichero1);
		String contenido2 = leerFichero(fichero2);
		
		if(contenido1.equals(contenido2))
			iguales = true;
		else
			iguales = false;
		
		return iguales;
	}
	
	public static String leerFichero(String fichero) {
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
