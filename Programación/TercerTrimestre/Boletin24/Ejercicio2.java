package Boletin24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número entre el 1 y el 10: ");
		int numero = teclado.nextInt();
		
		if(numero > 10 || numero < 1) {
			System.out.println("No se puede");
		} else {
			String fichero = "tabla-" + numero + ".txt";
			leerFichero(fichero);
		}
	}
	
	public static void leerFichero(String fichero) {
		Path ruta = Path.of("/home/pinipon/" + fichero);
		ArrayList<String> lineas = null;
		try {
			lineas = (ArrayList<String>)Files.readAllLines(ruta);
			for(String linea: lineas)
				System.out.println(linea);
		} catch (Exception e) {
			System.out.println("Error al leer: " + e.getMessage());
		}
	}
}
