package Tinder;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

abstract public class Persona {
	protected String nombre;
	protected String sexo;
	protected int edad;
	protected int edadMin = 0;
	protected int edadMax = 0;
	protected int busqueda;
	protected LocalDate nacimiento;
	
	public Persona(String n, String nac, int eMin, int eMax, int b) {
		this.nombre = n;
		this.edadMin = eMin;
		this.edadMax = eMax;
		this.busqueda = b;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.nacimiento = LocalDate.parse(nac, formato);
		this.edad = this.getEdad();
	}
	
	public Persona(String n, String nacimiento, int b) {
		this.nombre = n;
		this.busqueda = b;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.nacimiento = LocalDate.parse(nacimiento, formato);
		this.edad = this.getEdad();
	}
	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.nacimiento, hoy);
		return periodo.getYears();
	}
	
	public void getDatos() {
		System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad);
		
		if(this.busqueda==0)
			System.out.print("Busco: Mujeres");
		else if(this.busqueda==1)
			System.out.print("Busco: Hombres");
		else
			System.out.print("Busco: Ambos");
		
		System.out.println(" Orientación sexual: " + this.sexo);
	}
}