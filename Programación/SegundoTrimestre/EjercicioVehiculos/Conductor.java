package EjercicioVehiculos;

import java.time.LocalDate;

public class Conductor {
	private String nif;
	private int añoNacimiento;
	private int añoCarnet;
	private int puntos;
	private int añosdeCarnet;
	
	public Conductor(String nif, int añoNacimiento, int añoCarnet, int puntos) {
		this.nif = nif;
		this.añoNacimiento = añoNacimiento;
		this.añoCarnet = añoCarnet;
		this.puntos = puntos;
	}
	
	public void obtenerDatos() {
		int año = LocalDate.now().getYear();
		int edad = año - this.añoNacimiento;
		añosdeCarnet = año - this.añoCarnet;
		System.out.println("NIF: " + this.nif + " - Edad: " + edad + " - Años de carnet: " + añosdeCarnet + " - Puntos de carnet: " + this.puntos);
	}
	
	public int getPuntos() {
		return this.puntos;
	}
}