package Protectora;

abstract class Animal {
	protected int añoN;
	protected String nombre;
	public Animal(int añoN) {
		this.añoN = añoN;
		// this.nombre = setNombre(this.nombre);
	}
	
	public Animal(int añoN, String nombre) {
		this.añoN = añoN;
		this.nombre = nombre;
	}
	
	/* public String setNombre(String nombre) {
		this.nombre = nombre;
		return nombre;
	}
	
	public void getNombre() {
		if(this.nombre!=null)
			System.out.println(this.nombre);
		else
			System.out.println("No tiene nombre");
	}*/
}
