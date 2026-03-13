package EjercicioMedicos;

public class Main {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Eustaquio");
		Paciente p2 = new Paciente("Chiqui");
		Especialidad e1 = new Especialidad("Cirugía");
		Medico m1 = new Medico("Pini",e1);
		Cita c1 = new Cita("Cáncer",m1,p1);
		Especialidad e2 = new Especialidad("Traumatología");
		Medico m2 = new Medico("Zevinno Sobretti",e2);
		Medico m3 = new Medico("Gabriel",e2);
		Cita c2 = new Cita("Sepso", m2, p1);
		Cita c3 = new Cita("XXX", m2, p2);
		e2.listarMedicos();
		e1.sacarMinimo();
		Cita.listarCitas();
		p1.eliminarCita(c2);
		Cita.listarCitas();
		e2.listarMedicos();
	}
}