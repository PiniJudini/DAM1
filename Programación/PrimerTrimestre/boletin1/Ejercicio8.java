package boletin1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un importe: ");
		double importe = teclado.nextDouble();
		System.out.print("Introduce una cantidad de meses para pagarlo: ");
		int meses = teclado.nextInt();
		
		double importemes = Math.round(importe/meses*100d)/100d;
		System.out.println("El importe por mes es: " + importemes);
		teclado.close();
	}
}