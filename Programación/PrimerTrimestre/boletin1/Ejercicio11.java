package boletin1;

public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.println("A continuación te haré una tirada de dados...");
		boolean dadosiguales;
		int contador = 0;
		do {
			contador++;
			int numeroRandom1 = (int)(Math.random()*(6-1+1))+1;
			int numeroRandom2 = (int)(Math.random()*(6-1+1))+1;
			System.out.println(numeroRandom1 + " " + numeroRandom2);
			if(numeroRandom1!=numeroRandom2) {
				dadosiguales = false;
			}
			else {
				dadosiguales=true;
			}
		}while(dadosiguales == false);
		System.out.println("He realizado " + contador + " tiradas.");
	}
}
