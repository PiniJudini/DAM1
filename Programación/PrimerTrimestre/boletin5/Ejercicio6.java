package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		String numero = teclado.nextLine();
		
		String[] numeros = new String[numero.length()];
		for(int i=0; i<numero.length(); i++) {
			numeros[i] =""+ numero.charAt(i);
		}
		
		int[] contadores = new int[10];
		for (int i=0; i<numero.length(); i++) {
			switch (numero.charAt(i)) {
			case ('0'): {
				contadores[0]++;
				break;
			}
			case ('1'): {
				contadores[1]++;
				break;
			}
			case ('2'): {
				contadores[2]++;
				break;
			}
			case ('3'): {
				contadores[3]++;
				break;
			}
			case ('4'): {
				contadores[4]++;
				break;
			}
			case ('5'): {
				contadores[5]++;
				break;
			}
			case ('6'): {
				contadores[6]++;
				break;
			}
			case ('7'): {
				contadores[7]++;
				break;
			}
			case ('8'): {
				contadores[8]++;
				break;
			}
			case ('9'): {
				contadores[9]++;
				break;
			}
			}
		} 
		for (int i=0; i<contadores.length; i++) {
			if(contadores[i]!=0) {
				System.out.println(contadores[i] + " numeros " + i);
			}
		}
		}
}