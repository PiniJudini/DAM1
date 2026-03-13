package Boletin18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean primo = true;
		HashSet<Integer> numeros = new HashSet<>();
		generarPrimos(numeros);
		HashSet<Integer> numeros2 = new HashSet<>();
		generarPrimos(numeros2);

		Integer[] numeros1 = numeros.toArray(new Integer[numeros.size()]);
		Integer[] numeros2b = numeros2.toArray(new Integer[numeros.size()]);
		System.out.print("Conjunto1 = ");
		ordenarArray(numeros1);
		System.out.print("Conjunto2 = ");
		ordenarArray(numeros2b);

		System.out.println();

		HashSet<Integer> conjunto1 = convertiraConjunto(numeros1);
		HashSet<Integer> conjunto2 = convertiraConjunto(numeros2b);

		// Conseguir unión
		conjunto1.addAll(conjunto2);
		Integer[] unionOrdenada = conjunto1.toArray(new Integer[conjunto1.size()]);
		System.out.print("Union = ");
		ordenarArray(unionOrdenada);

		// Conseguir intersección
		conjunto1 = convertiraConjunto(numeros1);
		conjunto1.retainAll(conjunto2);
		Integer[] interseccionOrdenada = conjunto1.toArray(new Integer[conjunto1.size()]);
		System.out.print("Intersección = ");
		ordenarArray(interseccionOrdenada);

		// Conseguir diferencia entre todos los primos y la unión de conjunto 1 y
		// conjunto 2
		conjunto1 = convertiraConjunto(numeros1);
		HashSet<Integer> conjuntoPrimos = new HashSet<>(List.of(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
		conjunto1.addAll(conjunto2);
		conjuntoPrimos.removeAll(conjunto1);
		Integer[] restoOrdenado = conjuntoPrimos.toArray(new Integer[conjuntoPrimos.size()]);
		System.out.print("Resto de primos = ");
		ordenarArray(restoOrdenado);
	}

	public static void generarPrimos(HashSet<Integer> numeros) {
		boolean primo = true;
		do {
			int numero = 0;
			do {
				primo = true;
				numero = (int) (Math.random() * (100 - 1 + 1) + 1);
				for (int i = 2; i < numero - 1; i++) {
					if (numero % i == 0)
						primo = false;
				}
			} while (primo == false);
			numeros.add(numero);
		} while (numeros.size() < 10);
	}

	public static void ordenarArray(Integer[] numeros1) {
		Arrays.sort(numeros1);
		for (int i = 0; i < numeros1.length; i++) {
			if (i == numeros1.length - 1)
				System.out.println(numeros1[i]);
			else
				System.out.print(numeros1[i] + ", ");
		}
	}

	public static HashSet<Integer> convertiraConjunto(Integer[] array) {
		HashSet<Integer> conjunto = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			conjunto.add(array[i]);
		}
		return conjunto;
	}
}
