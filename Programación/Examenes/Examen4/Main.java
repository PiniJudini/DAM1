package Examen4;

public class Main {
	public static void main(String[] args) {
		Juego calamar = new Juego(456);
		
		calamar.nuevaPrueba(200);
		calamar.mostrarJugadores();
		
		calamar.nuevaPrueba(200);
		calamar.mostrarJugadores();
		
		calamar.nuevaPrueba(55);
		calamar.mostrarJugadores();
		
		calamar.mostrarPruebas();
	}
}
