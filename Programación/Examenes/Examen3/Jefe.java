package Examen3;

import java.util.ArrayList;

class Jefe extends Persona {
	private Proyecto proyecto;
	// En vez de ser unicamente un proyecto habría sido correcto que hubieramos hecho un ArrayList<Proyecto> para calcular el salario.
	
	public Jefe(String nombre, double salario) {
		super(nombre, salario);
		// Falta poner la funcion setCodigo() como en Programador.
	}
	
	// Falta la función listarDatos del jefe
	
	public void setProyecto(Proyecto p) {
		this.proyecto = p;
	}
	
	// Te has complicado un poco la vida
	public void cambiarProyecto(Proyecto p) {
		if(this.proyecto == p)
			System.out.println("No cambies a un proyecto que ya tienes");
		else {
			this.proyecto = p;
			p.eliminarJefe(this);
			System.out.println("El Jefe del Proyecto " + p.getNombre() + " ha cambiado. Ahora es " + this.nombre);
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
