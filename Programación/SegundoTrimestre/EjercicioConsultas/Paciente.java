package EjercicioConsultas;

import java.util.ArrayList;

public class Paciente extends Persona{
	private String dni;
	private int tlfn;
	private boolean pillado = false;
	private CentroMedico centro;
	
	private ArrayList<Consulta> consultasp = new ArrayList<>();
	
	public Paciente(String nombre, String apellidos, String dni, int tlfn, CentroMedico c) {
		super(nombre,apellidos);
		this.dni = dni;
		this.tlfn = tlfn;
		this.centro = c;
	}
	
	public void mostrar() {
		System.out.println("---PACIENTE---");
		System.out.println("Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.dni + " Teléfono: " + this.tlfn);
		System.out.println("--------------------------------------------------");
	}
	
	public void cambiarCentro(CentroMedico c, CentroMedico c2) {
		c.eliminarPaciente(this);
		c2.setPaciente(this);
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultasp.size(); i++)
			consultasp.get(i).mostrar();
	}
	
	public Paciente getPaciente() {
		return this;
	}
	
	public boolean getPillado() {
		return this.pillado;
	}
	
	public void setConsulta(Consulta c) {
		if(c.getPaciente()!=this)
			System.out.println("El paciente no es el indicado");
		else
			this.consultasp.add(c);
	}
}