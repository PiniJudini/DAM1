package boletin5;

public class Ejercicio1 {
	public static void main(String[] args) {
		int contador = 0;
		int[] loteria = new int[6];
		do {
			boolean repetido;
			int numeroRandom = 0;
			do {
				numeroRandom = (int)(Math.random()*(6-1+1)+1);
				repetido = false;
				for(int i=0; i<loteria.length; i++) {
					if(loteria[i]==numeroRandom) {
						repetido = true;
					}
				}
			}while(repetido==true);
				contador++;
				loteria[contador-1] = numeroRandom;
		}while(contador<6);
		for (int i=0; i<loteria.length; i++)
			System.out.println(loteria[i]);
	}
}
