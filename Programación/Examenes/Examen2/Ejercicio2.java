package Examen2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] clientes = {"Diego Correa", "Inés Perado", "Demetrio Imedio", "Roberto Rija", "Rubén Tosidad", "Armando Adistancia", "Germán Tequilla"};
		System.out.print("Cuántos premios vas a repartir? ");
		int premios = teclado.nextInt();
		
		if(clientes.length==premios)
			System.out.println("Tienes solo " + clientes.length + " clientes. Les puedes dar un premio a cada uno.");
		else if(clientes.length<premios) {
			System.out.println("Tienes solo " + clientes.length + " clientes. Les puedes dar un premio a cada uno.");
			System.out.println("Te sobran " + (premios-clientes.length) + " sin repartir. ¡Guárdalos para el siguiente sorteo!");
		}
		else {
			System.out.println("Los/as afortunados/as son: ");
			
			int contador=0;
			String[] ganadores = new String[premios];
			do {
				int numeroRandom=0;
				boolean repetido;
				do {
					numeroRandom = (int)(Math.random()*((clientes.length-1)-1+1)+1);
					repetido=false;
					for(int i=0; i<ganadores.length; i++) {
						if(ganadores[i]==clientes[numeroRandom])
							repetido = true;
					}
				}while(repetido==true);
				contador++;
				ganadores[contador-1]=clientes[numeroRandom];
			}while(contador<premios);
			for(int i=0; i<ganadores.length; i++) {
				System.out.println(ganadores[i]);
			}
			
			System.out.println(clientes.length-premios + " se han quedado sin premio. ¡Mucha suerte en el próximo sorteo!");
			}
	}
}
