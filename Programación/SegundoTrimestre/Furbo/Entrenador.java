package Furbo;

class Entrenador extends Persona{
	private Equipo equipo;
	
	public Entrenador(String nombre, Equipo equipo) {
		super(nombre);
		this.equipo = equipo;
		equipo.setEntrenador(this);
	}
	
	public void cambiarEquipo(Equipo e) {
		e.setEntrenador(this);
		this.equipo = e;
	}
}
