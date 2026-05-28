package RA1_RA2_RA3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String numero = "";
		int numeroInicial = 0;
		try {
			System.out.print("Escribe un entero y te diré si es feliz: ");
			numero = teclado.nextLine();

			numeroInicial = Integer.parseInt(numero);

			boolean terminado = false;
			boolean feliz = true;

			int numeroNuevo = numeroInicial;
			int contador = 1;

			do {
				String numeroS = "" + numeroNuevo;

				int numero1 = 0;
				int numero2 = 0;
				if (numeroS.length() == 1) {
					numero1 = Integer.parseInt(numeroS.substring(0, 1));
					numero2 = 0;
				} else {
					numero1 = Integer.parseInt(numeroS.substring(0, 1));
					numero2 = Integer.parseInt(numeroS.substring(1, 2));
				}

				int operacion = (int) (Math.pow(numero1, 2) + Math.pow(numero2, 2));
				numeroNuevo = operacion;

				if (numeroNuevo == 1)
					terminado = true;
				else if (numeroNuevo == 4 || numeroNuevo == 16 || numeroNuevo == 37 || numeroNuevo == 58
						|| numeroNuevo == 89 || numeroNuevo == 145 || numeroNuevo == 42 || numeroNuevo == 20) {
					terminado = true;
					feliz = false;
				} else {
					terminado = false;
					contador++;
				}
			} while (terminado == false);

			if (feliz == true)
				System.out.println("El número " + numero + " es feliz en " + contador + " pasos");
			else
				System.out.println("El número " + numero + " no es feliz");
		} catch (Exception e) {
			System.out.println(numero + " no es un número entero");
		}

		teclado.close();
	}
}
