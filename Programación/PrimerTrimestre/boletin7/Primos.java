package boletin7;

public class Primos {
	public static void main(String[] args) {
		System.out.println("Generador de Primos version 1.33");
		boolean esPrimo;
		int numeroRandom;
		do {
			int contadordivisores = 0;
			numeroRandom = (int)(Math.random()*(100-1+1)+1);
			for(int i=2; i<numeroRandom; i++) {
				if(numeroRandom%i==0) {
					contadordivisores++;
				}
			}
			if(contadordivisores!=0)
				esPrimo=false;
			else
				esPrimo=true;
		}while(esPrimo==false);
		System.out.println("El número " + numeroRandom + " es primo");
	}
}
