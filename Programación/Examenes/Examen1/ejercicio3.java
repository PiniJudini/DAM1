package Examen1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
public class ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Generando array: ");
		int numeros[] = new int[10];
		for (int i=0; i<numeros.length; i++) {
			int numeroRandom = (int)(Math.random()*(50-1+1)+1);
			numeros[i]=numeroRandom;
			if (i<numeros.length-1) {
			System.out.print(numeroRandom + ", ");
			}
			else {
				System.out.println(numeroRandom);
			}
		}
		System.out.print("Introduce un número entre el 1 y el 50: ");
		int numero = teclado.nextInt();
		int contadormayores = 0;
		for (int o=0; o<numeros.length; o++) {
			if (numeros[o]>numero) {
				contadormayores++;
			}
		}
		System.out.println("En el array aparecen " + contadormayores + " numeros mayores que el " + numero);
	}
}
