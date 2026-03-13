package boletin10;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero1 = 0;
		
		boolean correcto;
		do {
		try {
			Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce un número: ");
			numero1 = teclado.nextInt();
			correcto=true;
			teclado.close();
		}catch(Exception e) {
			System.out.println("Has introducido una entrada incorrecta");
			correcto = false;
		}
		}while(correcto == false);
		
		if(comprobarPerfecto(numero1)==true) {
			System.out.println("Tu número es perfecto");
		}
		else {
			System.out.println("Tus número no es perfecto");
		}
	}
	
	public static boolean comprobarPerfecto(int numero1) {
		int resultado = 0;
		for(int i=1; i<numero1; i++ ) {
			if(numero1%i==0) {
				resultado += i;
			}
		}
		if(resultado == numero1) {
			return true;
		}
		else {
			return false;
		}
	}
}
