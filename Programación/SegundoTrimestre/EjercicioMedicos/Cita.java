package EjercicioMedicos;

import java.time.LocalDate;
import java.util.HashSet;

public class Cita {
	private Medico medico;
	private Paciente paciente;
	private String descripcion;
	private LocalDate fecha;
	private static HashSet<Cita> citas = new HashSet<>();

	public Cita(String descripcion, Medico medico, Paciente paciente) {
		this.paciente = paciente;
		this.medico = medico;
		this.descripcion = descripcion;
		this.fecha = LocalDate.now().plusDays(7);
		boolean x = paciente.setEspecialidad(medico.getEspecialidad());
		if(x == true) {
			medico.setPaciente(paciente);
			paciente.setCita(this);
			citas.add(this);
		}
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public static void listarCitas() {
		for (Cita cita : citas)
			System.out.println(cita.paciente.getNombre() + " tiene cita con " + cita.medico.getNombre() + " sobre "
					+ cita.descripcion + " el día " + cita.fecha);
	}
	
	public void eliminarCita() {
		this.medico.eliminarPaciente(this.paciente);
		citas.remove(this);
		System.out.println("La cita de " + this.paciente.getNombre() + " el día " + this.fecha + " ha sido eliminada");
	}
}
