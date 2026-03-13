package Boletin11_Ejercicio3;

public class Main {
	public static void main(String[] args) {
		Coleccion martyrs = new Coleccion("Martyrs");
		Manga t1 = new Manga("Kawasaki",martyrs,"Accion",45);
		t1.setNumero(12);
		t1.setNumero(11);
		t1.eliminarNumero(12);
		martyrs.mostrarRestantes();
	}
}
