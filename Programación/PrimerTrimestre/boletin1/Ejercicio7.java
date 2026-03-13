package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		
		double iva = Math.round(numero*1.21*100d)/100d;
		System.out.println("Tu número con IVA es: " + iva);
		teclado.close();
	}
}
