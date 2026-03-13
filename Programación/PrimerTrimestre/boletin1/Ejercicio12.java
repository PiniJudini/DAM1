package boletin1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de dados que quieres tirar: ");
		int dados = teclado.nextInt();
		boolean errorcaras;
		int caras = 0;
		do {
			System.out.println("Ahora introduce las caras de los dados: ");
			caras = teclado.nextInt();
			if (caras % 2 == 0) {
				errorcaras = false;
			} else {
				errorcaras = true;
				System.err.println("ERROR 1033. Entrada no válida");
			}
		} while (errorcaras == true);

		for (int i = 1; i <= dados; i++) {
			int dado = (int) (Math.random() * (caras - 1 + 1) + 1);
			System.out.print(dado + " ");
		}
		teclado.close();
	}
}