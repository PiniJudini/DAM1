package Boletin13;

public class Grupo {
	private String nombre;
	private Ciclo ciclo;
	private int curso;
	private int contadorAlumnos;
	private int alumnosMatriculados = 0;
	private Alumno[] alumnos;
	private Profesor tutor;
	
	public Grupo(String nombre, Ciclo ciclo, int curso, int contadorAlumnos) {
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.curso = curso;
		this.contadorAlumnos = contadorAlumnos;
		this.alumnos = new Alumno[contadorAlumnos];
	}
	
	public void añadeTutor(Profesor tutor) {
		this.tutor = tutor;
		tutor.setGrupo(this);
	}
	
	public void añadeAlumno(Alumno alumno) {
		if(this.contadorAlumnos == this.alumnosMatriculados)
			System.out.println("Grupo completo. Ya hay " + this.alumnosMatriculados + " alumnos matriculados");
		else {
			this.alumnos[this.alumnosMatriculados] = alumno;
			this.alumnosMatriculados++;
		}
	}
	
	public void verGrupo() {
		System.out.println("El curso es: " + this.nombre);
		System.out.println("Ciclo: " + this.ciclo.getNombre() + " - Curso: " + this.curso);
		System.out.println("Total de alumnos: " + this.contadorAlumnos + " / Alumnos matriculados: " + this.alumnosMatriculados);
		if(this.tutor==null)
			System.out.println("No tiene tutor");
		else
			System.out.println("El tutor es: " + this.tutor.getNombre());
	}
	
}
