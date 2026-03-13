package Examen5;

public class Main {
	public static void main(String[] args) {
		Juego calamar = new Juego(400);
		
		calamar.nuevaPrueba(100);
		calamar.mostrarJugadores();
		
		calamar.nuevaPrueba(100);
		calamar.mostrarJugadores();
		
		calamar.nuevaPrueba(199);
		calamar.mostrarJugadores();
		
		calamar.mostrarPruebas();
	}
}
