package Tinder;

class BoiBoi extends Persona {
	public BoiBoi(String nombre, String nacimiento, int edadMin, int edadMax, int busqueda) {
		super(nombre, nacimiento, edadMin, edadMax, busqueda);
		this.sexo = "BoiBoi";
		App.setPersona(this);
	}
	
	public BoiBoi(String nombre, String nacimiento, int busqueda) {
		super(nombre, nacimiento, busqueda);
		this.sexo = "BoiBoi";
		App.setPersona(this);
	}
}