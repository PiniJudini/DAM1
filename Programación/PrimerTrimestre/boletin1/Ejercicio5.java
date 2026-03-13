package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		
		if(numero%2==0)
			System.out.println("Tu número es par");
		else
			System.out.println("Tu número es impar");
		teclado.close();
	}

}
