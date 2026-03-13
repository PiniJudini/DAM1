package Boletin2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		
		for (int i=1; i<=numero; i++) {
			if(numero%i==0) {
				if(i!=numero)
					System.out.print(i + ", ");
				else
					System.out.println(i);
			}
		}
	}
}
