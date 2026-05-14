package Interfaces;

public class Main {
	public static void main(String[] args) {
		Persona p = new Persona("Jose María", "Morales Vázquez", 57);
		Jubilada.mePuedoJubilar(57);
		Jubilada.mePuedoJubilar(p.getEdad());
		p.informacion();
	}
}
