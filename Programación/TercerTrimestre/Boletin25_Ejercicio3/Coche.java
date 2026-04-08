package Boletin25_Ejercicio3;

public class Coche extends Vehiculo {
	
	public Coche(String matricula, int añoVenta, Conductor conductor) {
		super(matricula, añoVenta, conductor);
		
		this.marca = "coche";
	}
}
