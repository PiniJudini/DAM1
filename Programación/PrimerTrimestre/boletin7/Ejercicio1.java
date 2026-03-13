package boletin7;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int numero1 = teclado.nextInt();
		System.out.print("Introduce otro número: ");
		int numero2 = teclado.nextInt();
		System.out.print("Qué operación quieres hacer?: ");
		String valor = teclado.nextLine();
		teclado.close();
		
		int operacion=0;
		if(valor=="S" || valor=="s")
			operacion=numero1+numero2;
		else if(valor=="R" || valor=="r")
			operacion=numero1-numero2;
		else if(valor=="M" || valor=="m")
			operacion=numero1*numero2;
		else if(valor=="D" || valor=="d")
			operacion=numero1/numero2;
		
		System.out.println(operacion);
		
	}
}
