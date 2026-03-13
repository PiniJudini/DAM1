package Furbo;

class Jugador extends Persona {
	private Equipo equipo;
	private int dorsal;
	
	public Jugador(String nombre, Equipo equipo, int dorsal) {
		super(nombre);
		this.equipo = equipo;
		this.dorsal = dorsal;
	}
	
	public Jugador(String nombre) {
		super(nombre);
	}
	
	public void cambiarEquipo(Equipo e) {
		e.setJugador(this);
		this.equipo = e;
	}
}
