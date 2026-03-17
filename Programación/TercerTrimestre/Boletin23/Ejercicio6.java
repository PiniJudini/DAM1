package Boletin23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Ejercicio6 {
	public static void main(String[] args) {
		verificarFormato();
	}

	public static void verificarFormato() {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path fichero = Path.of("/home/alumno/ejercicio6.txt");
			lineas = (ArrayList<String>) Files.readAllLines(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		boolean valido = true;
		for (int i = 0; i < lineas.size(); i += 3) {
			for (int j = 0; j < lineas.get(i).length(); j++) {
				if (lineas.get(i).charAt(j) == '0' || lineas.get(i).charAt(j) == '1' || lineas.get(i).charAt(j) == '2'
						|| lineas.get(i).charAt(j) == '3' || lineas.get(i).charAt(j) == '4'
						|| lineas.get(i).charAt(j) == '5' || lineas.get(i).charAt(j) == '6'
						|| lineas.get(i).charAt(j) == '7' || lineas.get(i).charAt(j) == '8'
						|| lineas.get(i).charAt(j) == '9')
					valido = false;
			}
			
			for (int j = 0; j < lineas.get(i+1).length(); j++) {
				if (lineas.get(i+1).charAt(j) == '0' || lineas.get(i+1).charAt(j) == '1' || lineas.get(i+1).charAt(j) == '2'
						|| lineas.get(i+1).charAt(j) == '3' || lineas.get(i+1).charAt(j) == '4'
						|| lineas.get(i+1).charAt(j) == '5' || lineas.get(i+1).charAt(j) == '6'
						|| lineas.get(i+1).charAt(j) == '7' || lineas.get(i+1).charAt(j) == '8'
						|| lineas.get(i+1).charAt(j) == '9')
					valido = false;
			}
			
			for (int j = 0; j < lineas.get(i+2).length(); j++) {
				if (lineas.get(i+2).charAt(j) != '0' && lineas.get(i+2).charAt(j) != '1' && lineas.get(i+2).charAt(j) != '2'
						&& lineas.get(i+2).charAt(j) != '3' && lineas.get(i+2).charAt(j) != '4'
						&& lineas.get(i+2).charAt(j) != '5' && lineas.get(i+2).charAt(j) != '6'
						&& lineas.get(i+2).charAt(j) != '7' && lineas.get(i+2).charAt(j) != '8'
						&& lineas.get(i+2).charAt(j) != '9')
					valido = false;
			}
		}
		
		if(valido == true)
			System.out.println("Es correcto");
		else
			System.out.println("Paparruchas");
	}
}
