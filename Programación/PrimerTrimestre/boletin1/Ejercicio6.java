package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		
		if(numero%3==0)
			System.out.println("Tu número es divisible por 3");
		else
			System.out.println("Tu número no es divisible por 3");
		teclado.close();
	}

}