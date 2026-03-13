package Boletin2;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		boolean esIgual;
		int numeroRandom = (int)(Math.random()*(50-1+1)+1);
		System.out.println(numeroRandom);
		int contador = 0;
		int numero = 0;
		do {
			contador++;
			System.out.print("Introduce un número: ");
			numero = teclado.nextInt();
			if(numero!=numeroRandom && contador!=5) {
				esIgual=false;
				if(numero>numeroRandom)
					System.out.println("Te has pasado animal");
				else
					System.out.println("Te has quedado corto");
			}
			else
				esIgual = true;
		}while(esIgual == false);
		if(contador==5 && numero!=numeroRandom)
			System.out.println("Eres un pringado");
		else
			System.out.println("Has acertado");
	}
}
