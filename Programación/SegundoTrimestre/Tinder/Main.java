package Tinder;

public class Main {
	public static void main(String[] args) {
		BoiBoi b1 = new BoiBoi("Pinipon","09/08/2007",17,19,1);
		BoiBoi b2 = new BoiBoi("Andrés","04/02/2005",1);
		BoiBoi b3 = new BoiBoi("Nick","07/07/2007",1);
		GrrGrr g1 = new GrrGrr("María","13/03/2007",1);
		BoiBoi b4 = new BoiBoi("Martin","22/01/2006",2);
		App.buscaMatches(b4);
		App.buscaMatches(g1);
	}
}
