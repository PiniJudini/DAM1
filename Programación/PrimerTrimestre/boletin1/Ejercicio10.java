package boletin1;

public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println("A continuación te haré una tirada de dados...");
		for(int i=0; i<2; i++) {
			int numeroRandom = (int)(Math.random()*(6-1+1))+1;
			System.out.println(numeroRandom);
		}
		}
}
