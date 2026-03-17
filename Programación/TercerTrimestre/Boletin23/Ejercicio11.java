package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el nombre del usuario: ");
		String usuario = teclado.nextLine();
		System.out.print("Introduce una contraseña: ");
		String contraseña = teclado.nextLine();

		ArrayList<String> lineas = leerFichero("login.txt");

		String verificacion = comprobarUsuario(lineas, usuario, contraseña);
		System.out.println(verificacion);
		
		teclado.close();
	}

	public static ArrayList<String> leerFichero(String fichero) {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero1 = Path.of("/home/alumno/" + fichero);
			lineas = (ArrayList<String>) Files.readAllLines(fichero1);
		} catch (Exception e) {
			System.out.println("fichero inexistente o imposible acceder a él");
			System.out.println(e.getMessage());
		}
		return lineas;
	}

	public static String comprobarUsuario(ArrayList<String> lineas, String usuario, String contraseña) {
		boolean encontrado = false;
		boolean correcta = false;
		for (String linea : lineas) {
			String[] palabras = linea.split(":");
			if (palabras[0].equals(usuario)) {
				encontrado = true;
				if (palabras[1].equals(contraseña))
					correcta = true;
			}
		}

		if (lineas.size() == 0)
			return "el fichero está vacío";
		else if (encontrado == false)
			return "usuario no encontrado";
		else if (correcta == false)
			return "contraseña incorrecta";
		else
			return "correcto";
	}
}
