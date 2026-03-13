package Boletin13;

class Profesor extends Persona {
	private String departamento;
	private Grupo tutoria;
	public Profesor(String nombre, String apellidos,String departamento) {
		super(nombre, apellidos);
		if(!departamento.equalsIgnoreCase("Informática") && !departamento.equalsIgnoreCase("Empresa") && !departamento.equalsIgnoreCase("Informática")) {
			System.err.println("ERROR: Departamento no valido");
		}
		else
			this.departamento = departamento.toUpperCase();
	}
	
	public void setGrupo(Grupo grupo) {
		this.tutoria = grupo;
	}

	public String getNombre() {
		return this.nombre;
	}
}
