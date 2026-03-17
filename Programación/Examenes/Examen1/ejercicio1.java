package Examen1;
public class ejercicio1 {
	public static void main(String[] args) {
		System.out.println("Generando claves del formato solicitado: ");
		for (int i=0; i<4; i++) {
			if (i!=0) {
				System.out.println(" ");
			}
			for (int o=0; o<5; o++) {
				if (o!=0) {
				System.out.print("-");
				}
				for (int k=0; k<5; k++) {
					int numeroRandom = (int)(Math.random()*(9-0+1)+0);
					System.out.print(numeroRandom);
				}
			}
		}
	}
}
