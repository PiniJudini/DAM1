package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean correcto = true;
		ArrayList<String> lineas = new ArrayList<>();
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce el nombre del fichero: ");
			String palabra1 = teclado.nextLine();

			try {
				Path fichero = Path.of(palabra1);
				lineas = (ArrayList<String>) Files.readAllLines(fichero);
				correcto = true;
			} catch (Exception e) {
				System.out.println("El fichero " + palabra1 + " no existe");
				correcto = false;
			}
			teclado.close();
		} while (correcto == false);

		Scanner teclado2 = new Scanner(System.in);
		System.out.print("Introduce la palabra a buscar: ");
		String palabra2 = teclado2.nextLine();
		
		int numVeces = numeroPalabras(palabra2, lineas);
		System.out.println("El fichero tiene " + lineas.size() + " líneas");
		System.out.println("La palabra aparece " + numVeces + " veces.");
		
		teclado2.close();
	}

	public static int numeroPalabras(String palabra2, ArrayList<String> lineas) {
		int contador = 0;
		for(String linea: lineas) {
			String[] array = linea.split(" ");
			for(String palabra: array) {
				if(palabra.equals(palabra2))
					contador++;
			}
		}
		return contador;
	}
}
