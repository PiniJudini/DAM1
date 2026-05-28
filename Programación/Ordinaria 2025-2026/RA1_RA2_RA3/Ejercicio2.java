package RA1_RA2_RA3;

public class Ejercicio2 {

	public static void main(String[] args) {
		String cadena = "AAAAACCCCCAAGGGGTTTTTTCCC";

		boolean correcta = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != 'A' && cadena.charAt(i) != 'C' && cadena.charAt(i) != 'G'
					&& cadena.charAt(i) != 'T')
				correcta = false;
		}

		if (correcta == true) {
			String caracterInicial = "";
			String caracterSiguiente = "";
			int contador = 1;

			String cadenaTerminada = "";
			for (int i = 0; i < cadena.length(); i++) {
				caracterInicial = "" + cadena.charAt(i);

				if (i < cadena.length() - 1)
					caracterSiguiente = "" + cadena.charAt(i + 1);

				if (caracterInicial.equals(caracterSiguiente) == false) {
					if (contador == 1)
						cadenaTerminada += caracterInicial;
					else
						cadenaTerminada += caracterInicial + contador;

					contador = 0;
				} else if (i == cadena.length() - 1) {
					if (contador == 1)
						cadenaTerminada += caracterInicial;
					else
						cadenaTerminada += caracterInicial + contador;
				}

				contador++;
			}

			System.out.println(cadenaTerminada);
		} else
			System.out.println(cadena + " no es una cadena de ADN válida");
	}
}
