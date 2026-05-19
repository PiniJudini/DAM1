package Examen6_Turno2_Ejercicio3;

public class Carta implements Ubicacion, Comparable<Carta> {
	private String nombre;
	private String tipo;
	private int coste;
	private String descripcion;
	private String ubicacion;

	public Carta(String n, String t, int c, String d) {
		this.nombre = n;
		this.tipo = t;
		this.coste = c;
		this.descripcion = d;
		this.ubicacion = "Biblioteca";
	}
	
	@Override
	public void cementerio() {
		this.setUbicacion("Cementerio");
	}
	
	@Override
	public void biblioteca() {
		this.setUbicacion("Biblioteca");
	}
	
	@Override
	public void mano() {
		this.setUbicacion("Mano");
	}

	@Override
	public int compareTo(Carta carta) {
		int devolucion = 0;

		if (this.nombre.compareTo(carta.nombre) < 0)
			devolucion = -1;
		else
			devolucion = 1;

		return devolucion;
	}

	public void setUbicacion(String ubi) {
		this.ubicacion = ubi;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "\nTipo: " + this.tipo + "\nCoste: " + this.coste + "\nDescripción: "
				+ this.descripcion + "\nUbicación: " + this.ubicacion;
	}
}
