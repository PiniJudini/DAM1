package Boletin25_Ejercicio3;

import java.time.LocalDate;

public class Conductor {
	private String nombre;
	private String nif;
	private int añoNacimiento;
	private int añoCarnet;
	private int puntos;
	private int edad;
	private int añosCarnet;

	public Conductor(String n, String nif, int aN, int aC, int p) {
		this.nombre = n;
		this.nif = nif;
		this.añoNacimiento = aN;
		this.añoCarnet = aC;
		this.puntos = p;

		int año = LocalDate.now().getYear();
		this.edad = año - this.añoNacimiento;
		this.añosCarnet = año - this.añoCarnet;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getAñosCarnet() {
		return this.añoCarnet;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
