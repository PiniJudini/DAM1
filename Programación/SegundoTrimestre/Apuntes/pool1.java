package DAM1;
//Esta es la clase principal que va a agrupar a las clases secundarias
public class pool1 {
	public static void main(String[] args) {
		// La clase persona para poder usarse en otras clases como aqui↓, deben estar en el mismo paquete
		Persona persona1 = new Persona ("Lucia", "Sanz");
		persona1.mostrar();
		
		Persona persona2;
		persona2 = new Persona ("Pepito", "Grillo");
		// ↓ Este es el public void mostrar() de pool1 ↓
		persona2.mostrar();
		System.out.println(persona1.getnumeroPersonas());
		System.out.println(persona2.getnumeroPersonas());
		
		// Con el extends y super podemos usar las funciones de la clase persona con Alumno y Profesor
		Profesor profesor1 = new Profesor("Jose María", "Morales");
		Alumno alumno1 = new Alumno("Andrés", "Ortega");
		
		System.out.println(alumno1.getNombre());
		System.out.println(profesor1.getNombreCompleto());
	}
}
