package EjercicioConsultas;

import java.util.ArrayList;

public class Medico extends Persona{
	private String especialidad;
	private int numero;
	private boolean pillado = false;
	private CentroMedico centro;
	
	private ArrayList<Consulta> consultasm = new ArrayList<>();
	
	public Medico(String nombre, String apellidos,String e,int n,CentroMedico c) {
		super(nombre,apellidos);
		this.especialidad = e;
		this.numero = n;
		this.centro = c;
	}
	
	public void mostrar() {
		System.out.println("---MÉDICO---");
		System.out.println("Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
		System.out.println("Especialidad: " + this.especialidad + " Número: " + this.numero);
		System.out.println("--------------------------------------------------");
	}
	
	public void cambiarCentro(CentroMedico c, CentroMedico c2) {
		c.eliminarMedico(this);
		c2.setMedico(this);
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultasm.size(); i++)
			consultasm.get(i).mostrar();
	}
	
	public void listarConsultasPaciente(Paciente p) {
		int contador = 0;
		for(int i=0; i<consultasm.size(); i++) {
			if(consultasm.get(i).getPaciente() == p) {
				contador++;
			}
		}
		
		if(contador==0)
			System.out.println("El paciente no tiene consultas asociadas");
		else {
			for(int i=0; i<consultasm.size(); i++) {
				if(consultasm.get(i).getPaciente() == p) {
					consultasm.get(i).mostrar();
				}
			}
		}
	}
	
	public Medico getMedico() {
		return this;
	}
	
	public boolean getPillado() {
		return this.pillado;
	}
	
	public CentroMedico getCentro() {
		return this.centro;
	}
	
	public void setConsulta(Consulta c) {
		if(c.getMedico()!=this)
			System.out.println("El médico no es el indicado");
		else
			this.consultasm.add(c);
	}
}
