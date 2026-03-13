package Boletin15;

public class Main {
	public static void main(String[] args) {
		Centro centro1 = new Centro("Arganda del Rey","ESP-0333");
		Centro centro2 = new Centro("Cristo Rey","ESP-9834");
		Paciente adrian = new Paciente("Adrián","Álvarez Bombín","03365734S",630234030,centro1);
		Paciente andres = new Paciente("Andrés", "Ortega Cebria", "03477843E", 675893042, centro1);
		Medico pini = new Medico("Marcos","Pineros Quero","03492765P",616312116,centro1);
		Consulta consulta1 = new Consulta(adrian,pini,"Gripe Aviar","Paracetamol",centro1);
		Consulta consulta2 = new Consulta(andres,pini,"Sexo","Condon",centro1);
		centro1.listarPacientes();
		centro1.listarMedicos();
		centro1.listarConsultas();
		
		pini.cambiarCentro(centro2);
		centro2.listarMedicos();
		
		pini.listarConsultasPaciente(adrian);
	}
}
