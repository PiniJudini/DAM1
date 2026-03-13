package Boletin2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		boolean esFIN;
		int contador =0;
		do {
			esFIN = false;
			System.out.print("Introduce un número entre el 1 y el 100 (FIN para terminar el programa): ");
			String numeropalabra = teclado.nextLine();
			if(numeropalabra.equals("FIN")==false) {
				int numero = Integer.parseInt(numeropalabra);
				if(numero<=100 && numero!=0)
					contador++;
			}
			else
				esFIN = true;
		}while(esFIN==false);
	}
}
