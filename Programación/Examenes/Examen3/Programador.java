package Examen3;

import java.util.ArrayList;

class Programador extends Persona {
	private String lenguaje1;
	private String lenguaje2;
	private int contador = 0;
	private Proyecto proyecto;
	
	public Programador(String nombre, double salario) {
		super(nombre,salario);
		this.contador = 0;
		this.mostrar();
	}
	
	public Programador(String nombre, double salario, String l1) {
		super(nombre,salario);
		this.lenguaje1 = l1;
		this.contador = 1;
		this.mostrar();
	}
	
	public Programador(String nombre, double salario, String l1, String l2) {
		super(nombre,salario);
		this.lenguaje1 = l1;
		this.lenguaje2 = l2;
		this.contador = 2;
		this.mostrar();
	}
	
	public void mostrar() {
		if(this.contador == 0) {
			System.out.println(this.nombre + ". " + this.codigo + ". Lenguajes de Programación: ");
			System.out.println("Ninguno. Salario Base: " + this.salario + "€");
			System.out.println();
		}
		else if(this.contador == 1) {
			System.out.println(this.nombre + ". " + this.codigo + ". Lenguajes de Programación: ");
			System.out.println(this.lenguaje1 + ". Salario Base: " + this.salario + "€");
			System.out.println();
		}
		else {
			System.out.println(this.nombre + ". " + this.codigo + ". Lenguajes de Programación: ");
			System.out.println(this.lenguaje1 + " y " + this.lenguaje2 + ". Salario Base: " + this.salario + "€");
			System.out.println();
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setProyecto(Proyecto p) {
		this.proyecto = p;
	}
	
	public void calcularSalario() {
		double salarioReal = 0;
		if(this.contador == 0)
			salarioReal = this.salario;
		else if(this.contador == 1)
			salarioReal = this.salario + 200;
		else
			salarioReal = this.salario + 200 + 200;
		// Había que poner el código del programador, no el del proyecto.
		System.out.println("El salario total de " + this.nombre + " (" + this.proyecto.getCodigo() + ") es de " + salarioReal);
	}
}
