package Examen1;
import java.util.regex.*;
public class ejercicio4 {
	public static void main(String[] args) {
		String palabra1 = "Examen 1T01";
		Pattern palabraVer1 = Pattern.compile("[A-Za-z0-9][\\s][A-Za-z0-9]");
		Matcher coincidencia1 = palabraVer1.matcher(palabra1);
		
		String palabra2 = "Octubre-2025";
		Pattern palabraVer2 = Pattern.compile("[A-Za-z0-9][-][A-Za-z0-9]");
		Matcher coincidencia2 = palabraVer2.matcher(palabra2);
		
		String resultado = "";
		
		String parte1palabra1 = "";
		String parte2palabra1 = "";
		String parte1palabra2 = "";
		String parte2palabra2 = "";
		
		for (int i=0; i<palabra1.length(); i++) {
			if (palabra1.charAt(i)==' ') {
				int posicionespacio = i;
				parte1palabra1 = palabra1.substring(0,posicionespacio);
				parte2palabra1= palabra1.substring(posicionespacio+1, palabra1.length());
			}
		}
		for (int k=0; k<palabra2.length(); k++) {
			if (palabra2.charAt(k)=='-') {
				int posicionguion = k;
				parte1palabra2 = palabra2.substring(0,posicionguion);
				parte2palabra2= palabra2.substring(posicionguion, palabra2.length());
			}
		}
		resultado = parte2palabra1 + parte2palabra2 + " " + parte1palabra1 + " " + parte1palabra2;
		System.out.println(resultado + " (" + resultado.length() + ")");
	}
}
