package Boletin28_Ejercicio1;

public class Main {

	final static int DESCUENTO_1 = 1;
	final static int DESCUENTO_2 = 2;
	final static int SIN_DESCUENTO = 3;

	public static void main(String[] args) {
		Descuento descuento = (a, b) -> {

			double importeFinal = a;
			if (a < 30 && b == 1) {
				b = SIN_DESCUENTO;
			}

			switch (b) {
			case 1: {
				importeFinal = Math.round((a - 10) * 100d) / 100d;
				break;
			}
			case 2: {
				importeFinal = Math.round((a * 0.80) * 100d) / 100d;
				break;
			}

			}
			return importeFinal;
		};

		System.out.println(descuento.descontar(43.01, DESCUENTO_1));
	}
}
