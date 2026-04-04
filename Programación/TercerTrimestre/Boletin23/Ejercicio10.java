package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio10 {
	public static void main(String[] args) {
		leerFichero("ejercicio10.txt");
	}

	public static void leerFichero(String fichero) {
		Path ruta = Path.of("/home/pinipon/" + fichero);
		ArrayList<String> lineas = new ArrayList<>();
		try {
			lineas = (ArrayList<String>) Files.readAllLines(ruta);
		} catch (Exception e) {
			System.out.println("Error al leer: " + e.getMessage());
		}

		ArrayList<Double> decimales = new ArrayList<>();
		int contadorBuenos = 0;
		int contadorMalos = 0;
		double suma = 0;
		for (String linea : lineas) {
			boolean valido = true;
			for (int i = 0; i < linea.length(); i++) {
				if (linea.charAt(i) != '0' && linea.charAt(i) != '1' && linea.charAt(i) != '2' && linea.charAt(i) != '3'
						&& linea.charAt(i) != '4' && linea.charAt(i) != '5' && linea.charAt(i) != '6'
						&& linea.charAt(i) != '7' && linea.charAt(i) != '8' && linea.charAt(i) != '9'
						&& linea.charAt(i) != '.') {
					valido = false;
				}
			}

			if (valido == true) {
				double numero = Double.parseDouble(linea);
				decimales.add(numero);
				contadorBuenos++;
				suma += numero;
			} else
				contadorMalos++;
		}

		Double[] numeros = decimales.toArray(new Double[0]);
		Arrays.sort(numeros);

		double media = Math.round((suma / contadorBuenos) * 1000d) / 1000d;

		System.out.println("Número de datos válidos: " + contadorBuenos);
		System.out.println("Número de datos inválidos: " + contadorMalos);
		System.out.println("Mínimo: " + numeros[0]);
		System.out.println("Máximo: " + numeros[numeros.length - 1]);
		System.out.println("Media aritmética: " + media);
	}
}
