package Examen2;

import java.util.Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 100;
		int[] capicuas;
		if (numero1>numero2)
			capicuas = new int[numero1+1];
		else
			capicuas = new int[numero2+1];
		
		for(int i=numero1; i<=numero2; i++) {
			if(comprobarCapicuas(i,capicuas)==true)
				capicuas[i]=i;
		}
		
		for (int i=0; i<capicuas.length; i++) {
			if(capicuas[i]!=0)
				System.out.print(capicuas[i] + " ");
		}
}
	
	public static boolean comprobarCapicuas(int i, int[] capicuas) {
		String numeroInvertido = "";
		String numeroS = "";
		if(i<10)
			capicuas[i] = i;
		else if(i>=10) {
			int numero = i;
			numeroS = numeroS + numero;
			for(int o=numeroS.length()-1; o>=0; o--) {
				numeroInvertido = numeroInvertido + numeroS.charAt(o);
			}
		}
		if(numeroInvertido.equals(numeroS))
			return true;
		else
			return false;
	}
}
