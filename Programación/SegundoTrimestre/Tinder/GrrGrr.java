package Tinder;

class GrrGrr extends Persona {
	public GrrGrr(String nombre, String nacimiento, int edadMin, int edadMax, int busqueda) {
		super(nombre, nacimiento, edadMin, edadMax, busqueda);
		this.sexo = "GrrGrr";
		App.setPersona(this);
	}
	
	public GrrGrr(String nombre, String nacimiento, int busqueda) {
		super(nombre, nacimiento, busqueda);
		this.sexo = "GrrGrr";
		App.setPersona(this);
	}
}
