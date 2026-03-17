package Examen1;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce el valor que quieres convertir: ");
		String numero = teclado.nextLine();
		String numerosinletra = numero.substring(0,numero.length()-1);
		
		double tasapesos = 27.93;
		double tasarupias = 102.81;
		double tasafrancos = 0.93;
		
		if (numero.charAt(numero.length()-1)=='E') {
			double numeroreal = Double.parseDouble(numerosinletra);
			double operacionpesos = numeroreal*tasapesos;
			double operacionrupias = numeroreal*tasarupias;
			double operacionfrancos = numeroreal*tasafrancos;
			System.out.println(numeroreal + " euros equivalen a " + Math.round(operacionpesos*10000d)/10000d + " pesos cubanos, " + Math.round(operacionrupias*10000d)/10000d + " rupias y a " + Math.round(operacionfrancos*10000d)/10000d + " francos suizos");
		}
		else if (numero.charAt(numero.length()-1)=='P') {
			double numeroreal = Double.parseDouble(numerosinletra);
			double operacioneuros = numeroreal/tasapesos;
			System.out.println(numeroreal + " pesos equivalen a " + Math.round(operacioneuros*10000d)/10000d + " euros.");
		}
		else if (numero.charAt(numero.length()-1)=='R') {
			double numeroreal = Double.parseDouble(numerosinletra);
			double operacioneuros = numeroreal/tasarupias;
			System.out.println(numeroreal + " rupias equivalen a " + Math.round(operacioneuros*10000d)/10000d + " euros.");
		}
		else if (numero.charAt(numero.length()-1)=='F') {
			double numeroreal = Double.parseDouble(numerosinletra);
			double operacioneuros = numeroreal/tasafrancos;
			System.out.println(numeroreal + " francos equivalen a " + Math.round(operacioneuros*10000d)/10000d + " euros.");
		}
	}
}
