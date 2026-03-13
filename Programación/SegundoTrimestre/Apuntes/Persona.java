package DAM1;
// La clase en sí no ejecuta nada, necesita objetos pertenecientes a esta para funcionar.
// Las clases crean nuevos tipos de datos
public class Persona {
	// Para evitar manipulaciones se pone private antes del tipo de variable.
	//↓↓ Estos son datos ↓↓
	protected String nombre;
	protected String apellidos;
	private int edad;
	private static int numeroPersonas = 0;
	// Protected cumple más o menos la misma función que private, pero estos se pueden usar para heredarlos.
	
	//↓↓ Esto es un constructor ↓↓. Este acumula los datos imprescindibles para que las clase tenga identidad propia.
	public Persona(String nom, String ape) {
		this.nombre = nom;
		this.apellidos = ape;
		//Aqui no hace falta poner this, ya que al ser una variable global, no está especificada en un objeto.
		numeroPersonas++;
	}
	
	public int getnumeroPersonas() {
		return numeroPersonas;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//↓↓ Estos son métodos ↓↓, que permiten interactuar con los datos.
	public void incrementaEdad() {
		// El comando this hace referencia a trabajar 
		this.edad++;
	}
	
	public void mostrar() {
		System.out.println(this.apellidos + ", " + this.nombre);
	}
}

// El comando extend sirve para heredar las características de la clase Persona, menos el constructor.
class Profesor extends Persona {
	public Profesor(String nombre, String apellidos) {
		super(nombre,apellidos);
	}
	
	public String getNombreCompleto() {
		return "Señor Don. " + this.nombre + " " + this.apellidos;
	}
}

class Alumno extends Persona {
	public Alumno(String nombre, String apellidos) {
		super(nombre,apellidos);
	}
}