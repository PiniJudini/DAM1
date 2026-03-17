package Examen2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean correcto;
		int dados = 0;
		do {
			correcto = false;
			try {
				Scanner teclado = new Scanner (System.in);
				System.out.print("Cuántos dados vas a tirar? ");
				dados = teclado.nextInt();
				if(dados<1)
					correcto=false;
				else
					correcto=true;
			}catch(Exception e) {
				System.out.println("No es una opción válida");
			}
		}while(correcto==false);
		
		System.out.println("Has tirado " + dados + " dados y ha salido lo siguiente:");
		int[] tirada = new int[dados];
		for(int i=0; i<dados; i++) {
			int numeroRandom = (int)(Math.random()*(6-1+1)+1);
			tirada[i]=numeroRandom;
			if(i!=dados-1)
				System.out.print(tirada[i] + ", ");
			else
				System.out.println(tirada[i]);
		}
		
		int contador1 = 0;
		int contador6 = 0;
		for (int i=0; i<tirada.length; i++) {
			if(tirada[i]==1)
				contador1++;
			else if(tirada[i]==6)
				contador6++;
		}
		
		if(contador1!=0)
			System.out.println("En " + contador1 + " dados ha salido un 1");
		if(contador6!=0)
			System.out.println("En " + contador6 + " dados ha salido un 6");
		
		int maximo = dados*6;
		int suma = 0;
		for (int i=0; i<tirada.length; i++) {
			suma += tirada[i];
		}
		
		int mitad = maximo/2;
		System.out.println("La suma de todos los dados da " + suma);
		if(suma>mitad)
			System.out.println("Tu tirada está por encima de la mitad " + "(" + mitad + ")");
		else if(suma<mitad)
			System.out.println("Tu tirada está por debajo de la mitad " + "(" + mitad + ")");
		else
			System.out.println("Tu tirada es exáctamente la mitad " + "(" + mitad + ")");
	}
}
