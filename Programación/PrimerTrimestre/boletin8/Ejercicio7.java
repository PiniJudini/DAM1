package boletin8;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		boolean correcto = true;
		Scanner teclado = new Scanner (System.in);
		String numeroS = "";
		
		do {
			System.out.print("Introduce un número: ");
			numeroS = teclado.nextLine();
			if(numeroS.length()==2 || numeroS.charAt(0)=='-') {
				correcto=false;
				System.out.println("Los números de dos cifras no pueden ser Narcisistas.");
			}
			else
				correcto=true;
		}while(correcto ==false);
		teclado.close();
		
		int numero = Integer.parseInt(numeroS);
		
		int sumaresultado = 0;
		if(sumaExponentes(sumaresultado, numeroS) == numero)
			System.out.println("El número es Narcisista");
		else
			System.out.println("El número no es Narcisista");
	}
	
	public static int sumaExponentes(int sumaresultado, String numeroS) {
		for(int i=0; i<numeroS.length(); i++) {
			int numeros = (int)(numeroS.charAt(i))-48;
			int resultado = (int)Math.pow(numeros, numeroS.length());
			sumaresultado += resultado;
		}
		return sumaresultado;
	}
}
