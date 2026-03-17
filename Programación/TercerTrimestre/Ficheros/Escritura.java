package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Escritura {
	public static void main(String[] args) {
		escribir1();
		// añadir1();
		escribir2();
		// añadir2();
		escribir3();
		// añadir3();
		escribir4();
	}

	public static void escribir1() {
		// Elimina el contenido y lo sustituye
		try {
			FileWriter pluma = new FileWriter("/home/alumno/fichero.txt");
			pluma.write("Hola Mundo Cruel\n");
			pluma.write("Segunda linea\n");
			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void escribir2() {
		try {
			// newLine() para introducir un salto de línea.
			BufferedWriter pluma = new BufferedWriter(new FileWriter("/home/alumno/fichero.txt"));
			pluma.write("Hola Mundo Cruel");
			pluma.newLine();
			pluma.write("Segunda linea");
			pluma.newLine();

			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void escribir3() {
		try {
			PrintWriter pluma = new PrintWriter(new FileWriter("/home/alumno/fichero.txt", StandardCharsets.UTF_8));
			pluma.print("Primera linea");
			pluma.println("Segunda línea");
			String nombre = "Hatsune";
			String apellidos = "Miku";
			int edad = 23;
			double salario = 3333.33;
			pluma.printf("Nombre: %s, %s. Edad: %d. Sueldo: %.2f", apellidos, nombre, edad, salario);

			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void escribir4() {
		Path ruta = Paths.get("/home/alumno/fichero.txt");
		ArrayList<String> lineas = new ArrayList<>(List.of("Primera linea", "Segunda linea", "Tercera linea"));
		try {
			Files.write(ruta, lineas, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void escribir5() {
		Path ruta = Paths.get("/home/alumno/fichero.txt");
		String contenido = "Hola Mundo Mundito";
		try {
			Files.writeString(ruta, contenido, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void añadir1() {
		// Añade el contenido al fichero.
		try {
			FileWriter pluma = new FileWriter("/home/alumno/fichero.txt", true);
			pluma.write("Hola Mundo Cruel\n");
			pluma.write("\nSegunda linea");
			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void añadir2() {
		try {
			BufferedWriter pluma = new BufferedWriter(new FileWriter("/home/alumno/fichero.txt", true));
			pluma.write("Hola Mundo Cruel\n");
			pluma.write("Segunda linea\n");

			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void añadir3() {
		try {
			PrintWriter pluma = new PrintWriter(
					new FileWriter("/home/alumno/fichero.txt", StandardCharsets.UTF_8, true));
			pluma.print("Primera linea");
			pluma.println("Segunda línea");
			String nombre = "Hatsune";
			String apellidos = "Miku";
			int edad = 23;
			double salario = 3333.33;
			pluma.printf("Nombre: %s, %s. Edad: %d. Sueldo: %.2f", apellidos, nombre, edad, salario);

			pluma.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}