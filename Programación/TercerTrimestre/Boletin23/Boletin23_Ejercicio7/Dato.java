package Boletin23_Ejercicio7;

import java.util.ArrayList;

public class Dato {
	private String nombre;
	private String apellidos;
	private int edad;
	private static ArrayList<Dato> datos = new ArrayList<>();
	
	public Dato(String n, String a, int e) {
		this.nombre = n;
		this.apellidos = a;
		this.edad = e;
		datos.add(this);
	}
	
	public static void listarDatos() {
		for(Dato dato: datos) {
			System.out.println("Nombre: " + dato.nombre + ", Apellidos: " + dato.apellidos + " y Edad: " + dato.edad);
		}
	}
}
