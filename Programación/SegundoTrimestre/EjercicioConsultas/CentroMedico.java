package EjercicioConsultas;

import java.util.ArrayList;

public class CentroMedico {
	private String nombre;
	private String codigo;
	
	private ArrayList<Medico> medicos = new ArrayList<>();
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private ArrayList<Consulta> consultascm = new ArrayList<>();
	
	public CentroMedico(String n, String c) {
		this.nombre = n;
		this.codigo = c;
	}
	
	public void listarConsultas() {
		for(int i=0; i<consultascm.size(); i++)
			consultascm.get(i).mostrar();
	}
	
	public void setMedico(Medico c) {
		if(c.getPillado() == false)
			this.medicos.add(c);
		else
			System.out.println("El médico ya pertenece a un centro");
	}
	
	public void eliminarMedico(Medico m) {
		this.medicos.remove(m);
	}
	
	public void listarMedicos() {
		for(int i=0; i<medicos.size(); i++)
			medicos.get(i).mostrar();
	}
	
	public void setPaciente(Paciente p) {
		if(p.getPillado() == false)
			this.pacientes.add(p);
		else
			System.out.println("El paciente ya pertenece a un centro médico");
	}
	
	public void eliminarPaciente(Paciente p) {
		this.pacientes.remove(p);
	}
	
	public void listarPacientes() {
		for(int i=0; i<pacientes.size(); i++)
			pacientes.get(i).mostrar();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setConsulta(Consulta c) {
		if(c.getCentro()!=this)
			System.out.println("El centro no es el indicado");
		else
			this.consultascm.add(c);
	}
}
