package Boletin11_Ejercicio3;

import java.util.ArrayList;

public class Manga {
	private String autor;
	private Coleccion coleccion2;
	private String genero;
	private int numeroFinal;
	private static ArrayList<Manga> coleccion = new ArrayList<>();
	
	public Manga(String a, Coleccion c, String g, int n) {
		this.autor = a;
		this.coleccion2 = c;
		this.genero = g;
		this.numeroFinal = n;
		c.setNumeroFinal(n);
	}

	public String getAutor() {
		return autor;
	}

	public String gettColeccion() {
		return this.coleccion2.getNombre();
	}

	public void setColeccion(String tColeccion) {
		this.coleccion2.setNombre(tColeccion);
	}

	public String getGenero() {
		return genero;
	}
	
	public void setNumero(int n) {
		this.coleccion2.setNumero(n);
	}
	
	public void eliminarNumero(int n) {
		if(this.coleccion2.compararNumero(n)==true)
			coleccion.remove(this);
	}
}
