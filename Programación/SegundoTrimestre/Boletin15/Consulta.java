package Boletin15;

import java.time.LocalDate;

public class Consulta {
	private Paciente paciente;
	private Medico medico;
	private LocalDate fecha = LocalDate.now();
	private String texto;
	private String resultado;
	private Centro centro;
	
	public Consulta(Paciente p, Medico m, String t, String r, Centro c) {
		this.paciente = p;
		this.medico = m;
		this.texto = t;
		this.resultado = r;
		this.centro = c;
		if(this.centro!=p.getCentro() || this.centro!=m.getCentro())
			System.out.println("El centro seleccionado no es igual al del paciente y/o médico");
		else {
			c.setConsulta(this);
			m.setConsulta(this);
			p.setConsulta(this);
		}
	}
	
	public void mostrar() {
		System.out.println("---CONSULTA---");
		System.out.println("Paciente: " + this.paciente.getNombreCompleto());
		System.out.println("Medico: " + this.medico.getNombreCompleto());
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Motivo: " + this.texto + " Resultado: " + this.resultado);	
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
}
