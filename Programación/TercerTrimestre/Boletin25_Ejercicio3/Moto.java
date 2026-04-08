package Boletin25_Ejercicio3;

public class Moto extends Vehiculo {

	public Moto(String matricula, int añoVenta, Conductor conductor) {
		super(matricula, añoVenta, conductor);
		
		this.marca = "moto";
	}
}
