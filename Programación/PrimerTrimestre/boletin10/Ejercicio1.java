package boletin10;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		
		boolean correcto;
		do {
		try {
			Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce un número: ");
			numero1 = teclado.nextInt();
			System.out.print("Introduce el otro número: ");
			numero2 = teclado.nextInt();
			correcto=true;
			teclado.close();
		}catch(Exception e) {
			System.out.println("Has introducido una entrada incorrecta");
			correcto = false;
		}
		}while(correcto == false);
		
		if(comprobarAmigos(numero1, numero2)==true) {
			System.out.println("Tus números son amigos");
		}
		else {
			System.out.println("Tus números no son amigos");
		}
	}
	
	public static boolean comprobarAmigos(int numero1, int numero2) {
		int resultado = 0;
		for(int i=1; i<numero1; i++ ) {
			if(numero1%i==0) {
				resultado += i;
			}
		}
		if(resultado == numero2) {
			return true;
		}
		else {
			return false;
		}
	}
}
