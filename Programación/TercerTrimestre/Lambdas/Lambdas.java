package Lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambdas {

	public static void main(String[] args) {
		Operacion suma = (a, b) -> a + b;

		Operacion mayor = (a, b) -> {
			int grande = a;
			if (b > a)
				grande = b;
			return grande;
		};

		System.out.println(suma.ejecutar(3, 5));
		System.out.println(mayor.ejecutar(3, 5));

		Operacion2 pvp = (a, b) -> {
			String linea = "PVP: ";
			double operacion = a * ((b / 100.0) + 1);
			operacion = Math.round(operacion * 100d) / 100d;

			String cadena = operacion + "";

			linea += cadena + "€";

			return linea;
		};

		System.out.println(pvp.ejecutar(33, 21));

		Runnable hola = () -> System.out.println("Hola mundo");
		hola.run();

		Consumer<String> saludo = (nombre) -> System.out.println("Hola " + nombre);
		saludo.accept("Pinipon");
		
		Supplier<Integer> dado = () -> {
			int random = (int) (Math.random()*(6-1+1)+1);
			return random;
		};
		
		System.out.println(dado.get());
	}
}
