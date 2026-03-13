package EjercicioMedicos;

import java.util.HashSet;

class Paciente extends Persona {
	private HashSet<Cita> citas = new HashSet<>();
	private Especialidad especialidad;

	public Paciente(String nombre) {
		super(nombre);
	}

	public void setCita(Cita c) {
		int numero = this.citas.size();
		this.citas.add(c);
		if (this.citas.size() == numero)
			System.out.println("Ya tienes esa cita");
	}

	public boolean setEspecialidad(Especialidad e) {
		boolean real;
		if (this.especialidad == e) {
			System.out.println("No puedes coger cita de una especialidad que ya tienes");
			real = false;
		}
		else {
			this.especialidad = e;
			real = true;
		}
		return real;
	}

	public void eliminarCita(Cita c) {
		if (this.citas.contains(c)) {
			this.citas.remove(c);
			c.eliminarCita();
		} else
			System.out.println("No tienes esa cita");
	}
}