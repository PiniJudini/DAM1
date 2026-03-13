package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		for (int i=1; i<=5; i++) {
			System.out.print(numero*i + " ");
		}
		teclado.close();
	}
}
