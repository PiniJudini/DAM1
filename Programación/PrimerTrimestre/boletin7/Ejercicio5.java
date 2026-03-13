package boletin7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		teclado.close();
		
		System.out.println("Generando array...");
		int[] numeros = new int[numero];
		
		for(int i=0; i<numeros.length; i++) {
			int numeroRandom = (int)(Math.random()*(1000-10+1)+10);
			numeros[i]=numeroRandom;
		}
		
		int suma = 0;
		for(int o=0; o<numeros.length; o++) {
			suma += numeros[o];
			System.out.print(numeros[o] + " ");
		}
		System.out.println("");
		
		ordenarNumeros(numeros);
		int mayor = numeros[0];
		int menor = numeros[numeros.length-1];
		posicionMaxMin(numeros, mayor, menor);
		
		double media = suma/numero;
		System.out.println("La media de los números del array es: " + Math.round(media*100d)/100d);
	}
	
	public static void ordenarNumeros(int[] numeros) {
		Arrays.sort(numeros);
		System.out.println("El número más pequeño es: " + numeros[0]);
		System.out.println("El número más grande es: " + numeros[numeros.length-1]);
	}
	
	public static void posicionMaxMin(int[] numeros, int mayor, int menor) {
		System.out.println("La posicion del número mayor es: " + Arrays.binarySearch(numeros, mayor));
		System.out.println("La posicion del menor número es: " + Arrays.binarySearch(numeros, menor));
	}
}
