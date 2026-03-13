package EjercicioConsultas;

import java.time.LocalDateTime;

public class Consulta {
	private LocalDateTime fecha;
	private String descripcion;
	private String consejo;
	private Paciente paciente;
	private Medico medico;
	private CentroMedico centro;
	
	public Consulta(LocalDateTime f, String d, String c, Medico m, Paciente p) {
		this.fecha = f;
		this.descripcion = d;
		this.consejo = c;
		this.medico = m;
		this.paciente = p;
		
		this.medico.setConsulta(this);
		this.paciente.setConsulta(this);
		this.centro = this.medico.getCentro();
		this.centro.setConsulta(this);
	}
	
	public void mostrar() {
		System.out.println("---CONSULTA---");
		System.out.println("Paciente: " + this.paciente.nombre + " " + this.paciente.apellidos + " Fecha: " + this.fecha);
		System.out.println("Descripción: " + this.descripcion + " Consejo: " + this.consejo);
		System.out.println("Médico: " + this.medico.nombre + " " + this.medico.apellidos);
		System.out.println("--------------------------------------------------");
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
	
	public Medico getMedico() {
		return this.medico;
	}
	
	public CentroMedico getCentro() {
		return this.centro;
	}
}
