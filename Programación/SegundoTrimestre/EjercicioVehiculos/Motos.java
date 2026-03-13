package EjercicioVehiculos;

class Motos extends Vehiculo{
	private int atiguedad;
	public Motos(String matricula, int añoFabricacion, Conductor dueño, int antiguedad) {
		super(matricula,añoFabricacion,dueño);
		this.atiguedad = antiguedad;
	}
}
