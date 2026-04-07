package Boletin24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import Binarios.Tarea;

public class Ejercicio9_Binario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String fichero = "/home/pinipon/empleados.dat";
		ArrayList<String> lineas = leerFichero("/home/pinipon/destino.dat");

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
		ArrayList<String> listaG = new ArrayList<>();
		try (ObjectInputStream binario = new ObjectInputStream(new FileInputStream(fichero))) {
			listaG = (ArrayList<String>) binario.readObject();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return listaG;
	}

	public static void escribirFichero(String fichero, ArrayList<String> lineas) {
		try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fichero))) {
			binario.writeObject(lineas);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}