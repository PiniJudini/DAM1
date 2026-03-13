package DAM1;

import java.util.ArrayList;
import java.util.Collections;

public class Colecciones {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> alumnos = new ArrayList<>();

		Collections.addAll(numeros, 44, 56, 1, 2, 55, 7, 3, 3, 44, 2, 89, 120, 45, 6);
		Collections.addAll(alumnos, "Lucia", "Marcos", "Sara", "Alejandro");
		
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// Ordena la lista.
		Collections.sort(numeros);
		Collections.sort(alumnos);
		
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// Altera el orden aleatoriamente.
		Collections.shuffle(numeros);
		Collections.shuffle(alumnos);
		
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// Hace un orden invertido (es necesario un sort antes).
		Collections.reverse(numeros);
		Collections.reverse(alumnos);
		
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// El max y min coje el valor máximo y mínimo.
		System.out.println(Collections.max(numeros) + " - " + Collections.min(numeros));
		System.out.println(Collections.max(alumnos) + " - " + Collections.min(alumnos));
		
		// El frequency saca la cantidad de veces que el valor está en la lista.
		System.out.println(Collections.frequency(numeros, 3));
		System.out.println(Collections.frequency(numeros, 444));
		
		// BinarySearch localiza la posición del valor (se necesita un sort).
		System.out.println("Posición: " + Collections.binarySearch(numeros, 2));
	}
}
