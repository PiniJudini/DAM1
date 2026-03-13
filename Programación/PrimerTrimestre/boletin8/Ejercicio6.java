package boletin8;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine();
		teclado.close();
		String frasemin = frase.toLowerCase();
		
		String frasesinespacios = "";
		for (int i=0; i<frasemin.length(); i++) {
			if(frase.charAt(i)!=' ')
				frasesinespacios = frasesinespacios + frasemin.charAt(i);
			
			if(frasemin.charAt(i)=='á')
				frasesinespacios = frasesinespacios.replace("á", "a");
			if(frasemin.charAt(i)=='é')
				frasesinespacios = frasesinespacios.replace("é", "e");
			if(frasemin.charAt(i)=='í')
				frasesinespacios = frasesinespacios.replace("í", "i");
			if(frasemin.charAt(i)=='ó')
				frasesinespacios = frasesinespacios.replace("ó", "o");
			if(frasemin.charAt(i)=='ú')
				frasesinespacios = frasesinespacios.replace("ú", "u");
		}
		
		String fraseinvertida = "";
		for(int o=frasesinespacios.length()-1; o>=0; o--) {
			fraseinvertida = fraseinvertida + frasesinespacios.charAt(o);
		}
		
		if(comprobarPalidromo(fraseinvertida, frasesinespacios) == true)
			System.out.println("Tu frase es un palíndromo");
		else
			System.out.println("Tu frase no es un palíndromo");
	}
	
	public static boolean comprobarPalidromo(String fraseinvertida, String frasesinespacios) {
		if(fraseinvertida.equals(frasesinespacios))
			return true;
		else
			return false;
	}
}
