package Boletin13;

class Alumno extends Persona {
	private int edad;
	public Alumno(String nombre, String apellidos, int edad) {
		super(nombre, apellidos);
		this.edad = edad;
	}
	public void mayordeEdad() {
		boolean mayordedad;
		if(this.edad>=18)
			mayordedad = true;
		else
			mayordedad = false;
		if(mayordedad==true)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
	}
}