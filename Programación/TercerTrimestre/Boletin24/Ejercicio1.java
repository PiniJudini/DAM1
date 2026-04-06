package Boletin24;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número por teclado entre el 1 y el 10: ");
		
		int numero = 0;
		boolean correcto = true;
		try {
			numero = teclado.nextInt();
			if (numero > 10) {
				System.out.println("Eres tonto");
				correcto = false;
			}
		} catch (Exception e) {
			System.out.println("No es un número entero");
			correcto = false;
		}
		
		if(correcto == true) {
			try {
				PrintWriter pluma = new PrintWriter(
						new FileWriter("/home/pinipon/tabla-" + numero + ".txt", StandardCharsets.UTF_8));
				for (int i = 1; i <= 10; i++) {
					int operacion = numero * i;
					pluma.printf("%d x %2d = %d", numero, i, operacion);
					pluma.println();
				}

				pluma.close();
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			teclado.close();
		}
	}
}