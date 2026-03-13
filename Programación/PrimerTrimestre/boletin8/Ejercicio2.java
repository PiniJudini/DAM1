package boletin8;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		teclado.close();
		int contadordivisores = 0;
		
		for (int i=2; i<numero; i++) {
			if(numero%i==0) {
				contadordivisores++;
			}
		}
		
		if(contadordivisores==0) {
			System.out.println("El número " + numero + " es primo");
		}
		else {
			System.out.println("El número " + numero + " no es primo");
		}
		}
	}
