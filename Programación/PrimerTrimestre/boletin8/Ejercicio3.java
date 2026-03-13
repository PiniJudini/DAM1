package boletin8;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		String fraseinvertida = "";
		int inicio = 0;
		int fin = frase.length()-1;
		
		while(inicio<=fin) {
			fraseinvertida = fraseinvertida + frase.charAt(fin--) + frase.charAt(inicio++);
		}
		System.out.println(fraseinvertida);
	}
	}