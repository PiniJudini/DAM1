package EjercicioConsultas;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime fecha1 = LocalDateTime.now();
		CentroMedico centro1 = new CentroMedico("La Paz","ESP 0428");
		CentroMedico centro2 = new CentroMedico("Cristo Rey","ESP 0302");
		Paciente andres = new Paciente("Andrés","Ortega Cebriá","85978930P",654872123,centro1);
		Medico pini = new Medico("Marcos","Pineros Quero","Cirugía",33,centro2);
		Consulta c1 = new Consulta(fecha1,"Gripe Aviar","Paracetamol",pini,andres);
		Consulta c2 = new Consulta(fecha1,"SARS COV II","Paracetamol",pini,andres);

		// Listar, poner y cambiar pacientes de centro
		centro1.setPaciente(andres);
		centro1.listarPacientes();
		andres.cambiarCentro(centro1, centro2);
		
		// Listar, poner y cambiar medicos de centro
		centro1.setMedico(pini);
		centro1.listarMedicos();
		pini.cambiarCentro(centro1, centro2);
		centro2.listarMedicos();
		
		// Listar las consultas de paciente (se setea automáticamente)
		andres.listarConsultas();
		
		// Listar las consultas del médico (se setea automáticamente)
		pini.listarConsultas();
		
		// Listar consultas del centro
		centro1.listarConsultas();
		
		// Listar consultas de médico a paciente
		pini.listarConsultasPaciente(andres);
	}
}
