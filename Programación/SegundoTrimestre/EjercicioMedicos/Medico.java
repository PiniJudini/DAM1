package EjercicioMedicos;

import java.util.ArrayList;
import java.util.HashSet;

class Medico extends Persona {
	private Especialidad especialidad;
	private HashSet<Paciente> pacientes = new HashSet<>();
	
	public Medico(String nombre, Especialidad especialidad) {
		super(nombre);
		this.especialidad = especialidad;
		especialidad.setMedico(this);
	}
	
	public void setPaciente(Paciente p) {
		int numero = this.pacientes.size();
		this.pacientes.add(p);
		if(this.pacientes.size() == numero)
			System.out.println("El paciente ya estaba en la especialidad " + this.especialidad.getNombre());
		else
			System.out.println("Añadido el paciente " + this.nombre);
	}
	
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}
	
	public int getNumeroPacientes() {
		return this.pacientes.size();
	}
	
	public void eliminarPaciente(Paciente p) {
		this.pacientes.remove(p);
	}
}