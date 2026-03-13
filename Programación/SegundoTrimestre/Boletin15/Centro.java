package Boletin15;

import java.util.ArrayList;

public class Centro {
	private String nombre;
	private String codigo;
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private ArrayList<Medico> medicos = new ArrayList<>();
	private ArrayList<Consulta> consultas = new ArrayList<>();
	
	public Centro(String n, String c) {
		this.nombre = n;
		this.codigo = c;
	}
	
	public void listarMedicos() {
		for(int i=0; i<medicos.size(); i++) {
			medicos.get(i).mostrar();
		}
	}
	
	public void listarPacientes() {
		for(int i=0; i<pacientes.size(); i++) {
			pacientes.get(i).mostrar();
		}
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultas.size(); i++) {
			consultas.get(i).mostrar();
		}
	}
	
	public void eliminarPaciente(Paciente p) {
		this.pacientes.remove(p);
	}
	
	public void eliminarMedico(Medico m) {
		this.medicos.remove(m);
	}
	
	public void setPaciente(Paciente p) {
		this.pacientes.add(p);
	}
	
	public void setMedico(Medico m) {
		this.medicos.add(m);
	}
	
	public void setConsulta(Consulta c) {
		this.consultas.add(c);
	}
}
