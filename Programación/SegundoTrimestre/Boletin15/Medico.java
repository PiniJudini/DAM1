package Boletin15;

import java.util.ArrayList;

class Medico extends Persona{
	private String especialidad;
	private int numero;
	private Centro centro;
	private ArrayList<Consulta> consultas = new ArrayList<>();
	
	public Medico(String nombre, String apellidos, String e, int n, Centro c) {
		super(nombre,apellidos);
		this.especialidad = e;
		this.numero = n;
		this.centro = c;
		c.setMedico(this);
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultas.size(); i++)
			consultas.get(i).mostrar();
	}
	
	public void listarConsultasPaciente(Paciente p) {
		for(int i=0; i<consultas.size(); i++) {
			if(consultas.get(i).getPaciente() == p)
				consultas.get(i).mostrar();
		}
	}
	
	public void cambiarCentro(Centro c) {
		this.centro.eliminarMedico(this);
		this.centro = c;
		c.setMedico(this);
	}
	
	public void mostrar() {
		System.out.println("---MÉDICO---");
		System.out.println("Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
		System.out.println("Especialidad: " + this.especialidad + " Numero: " + this.numero);
	}
	
	public Centro getCentro() {
		return this.centro;
	}
	
	public void setConsulta(Consulta c) {
		this.consultas.add(c);
	}
}
