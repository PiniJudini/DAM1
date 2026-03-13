package Boletin15;

import java.util.ArrayList;

class Paciente extends Persona {
	private String dni;
	private int tlfn;
	private Centro centro;
	private ArrayList<Consulta> consultas = new ArrayList<>();
	
	public Paciente(String nombre, String apellidos, String d, int t, Centro c) {
		super(nombre, apellidos);
		this.dni = d;
		this.tlfn = t;
		this.centro = c;
		c.setPaciente(this);
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultas.size(); i++)
			consultas.get(i).mostrar();
	}
	
	public void cambiarCentro(Centro c) {
		this.centro.eliminarPaciente(this);
		this.centro = c;
		c.setPaciente(this);
	}
	
	public void mostrar() {
		System.out.println("---PACIENTE---");
		System.out.println("Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.dni + " Teléfono: " + this.tlfn);
	}
	
	public Centro getCentro() {
		return this.centro;
	}
	
	public void setConsulta(Consulta c) {
		this.consultas.add(c);
	}
}
