package EjercicioVehiculos;

public abstract class Vehiculo {
	protected String matricula;
	protected int añoFabricacion;
	protected Conductor dueño;
	
	public Vehiculo(String matricula, int añoFabricacion, Conductor dueño) {
		this.matricula = matricula;
		this.añoFabricacion = añoFabricacion;
		this.dueño = dueño;
	}
	
	public void setConductor(Conductor conductor) {
		this.dueño = conductor;
	}
}
