package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		medirEstadisticas();
	}
	
	public static void medirEstadisticas() {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero = Path.of("/home/alumno/estadisticas.txt");
			lineas = (ArrayList<String>) Files.readAllLines(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
		
		double suma = 0;
		int contador = 0;
		int contadorMujeres = 0;
		int contadorHombres = 0;
		for (int i=0; i<lineas.size(); i+=2) {
			if(lineas.get(i).equals("Mujer"))
				contadorMujeres++;
			else if(lineas.get(i).equals("Hombre"))
				contadorHombres++;
			
			suma += Double.parseDouble(lineas.get(i+1));
			contador++;
		}
		
		double media = Math.round(suma/contador*100d)/100d;
		System.out.println("Hombres: " + contadorHombres);
		System.out.println("Mujeres: " + contadorMujeres);
		System.out.println("Estatura media: " + media);
	}
}
