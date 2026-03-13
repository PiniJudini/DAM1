package boletin8;

import java.util.Scanner;

public class Ejercicio4 {
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
		
		for(int i=0; i<5; i++) {
			int numeroRandom = (int)(Math.random()*((fraseinvertida.length()-2)-0+1)+0);
			String frases = "" + frase.charAt(numeroRandom);
			String mayuscula = "" + frase.charAt(numeroRandom);
			fraseinvertida ="" + fraseinvertida.replace(frases, mayuscula.toUpperCase());
		}
		System.out.println("Tu frase recodificada es: " + fraseinvertida);
	}
}
