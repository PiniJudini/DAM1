package Boletin13;

public class Main {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Mario","Carcalete",17);
		Alumno alumno2 = new Alumno("Andrés", "Ortega", 20);
		alumno1.mayordeEdad();
		alumno2.mayordeEdad();
		Profesor profe1 = new Profesor("Jose María", "Morales", "Informática");
		Profesor profe2 = new Profesor("Chema", "Santamarca", "Filosofía");
		
		Modulo programacion = new Modulo("Programación", 8, 1, false);
		Modulo fundamentos = new Modulo("Fundamentos", 2, 1, true);
		
		Ciclo dam = new Ciclo("Desarrollo de Aplicaciones Multiplataforma","SUPERIOR");
		dam.añadeModulo(programacion);
		dam.añadeModulo(fundamentos);
		
		Grupo dam1 = new Grupo("DAM1", dam, 1, 28);
		dam1.añadeTutor(profe2);
		dam1.añadeAlumno(alumno1);
		dam1.añadeAlumno(alumno2);
		
		dam1.verGrupo();
		dam.listar();
	}
}
