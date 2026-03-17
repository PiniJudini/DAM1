package Boletin24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quieres crear o acceder a un usuario? ");
		String respuesta = teclado.nextLine();
		respuesta = respuesta.toLowerCase();

		if (respuesta.equals("acceder")) {
			System.out.print("Introduce el nombre del usuario: ");
			String usuario = teclado.nextLine();
			System.out.print("Introduce una contraseña: ");
			String contraseña = teclado.nextLine();

			ArrayList<String> lineas = leerFichero("login.txt");

			String verificacion = comprobarUsuario(lineas, usuario, contraseña);
			System.out.println(verificacion);
		} else if (respuesta.equals("crear")) {
			System.out.print("Introduce el nombre del usuario: ");
			String usuario = teclado.nextLine();
			System.out.print("Introduce la contraseña: ");
			String contraseña = teclado.nextLine();
			System.out.print("Vuelve a introducir la contraseña: ");
			String contraseña2 = teclado.nextLine();

			if (usuario.contains(":") || contraseña.contains(":"))
				System.out.println("Contraseña o usuario no válido");
			else {
				ArrayList<String> lineas = leerFichero("login.txt");
				boolean existe = false;
				String verificacion = comprobarUsuario(lineas, usuario, contraseña);
				if (verificacion.equals("correcto"))
					existe = true;

				if (existe == false) {
					if (contraseña.equals(contraseña2)) {
						String contenido = usuario + ":" + contraseña2 + "\n";
						escribirContenido("login.txt", contenido);
					} else
						System.out.println("Las contraseñas no son iguales. No se puede grabar la nueva cuenta");
				} else
					System.out.println("El usuario existe");
			}
		} else
			System.out.println("Eres tonto");
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

	public static void escribirContenido(String fichero, String contenido) {
		Path ruta = Paths.get("/home/alumno/" + fichero);
		try {
			Files.writeString(ruta, contenido, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}